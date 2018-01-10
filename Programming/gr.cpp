#include<bits/stdc++.h>
using namespace std;
struct node
{
    int l,b,h;
};
bool comp(node n1,node n2)
{
    long long k = (n1.l)*(n1.b);
    long long j = (n2.l)*(n2.b);
    if(k>=j)
    return true;
    else
    return false;
}

int main() {
    
    while(1)
    {
        int n;
        cin>>n;
        if(n==0)
        break;
        int m=3*n;
        node v[m];
       
	//cout<<n<<"\n";
        int dim[n][3],arr[m];
        memset(dim,0,sizeof dim);
        
        for(int i=0;i<m;i++)
        {
        	int x;
        	cin>>x;
	        arr[i]=x;
        }
        for(int i=0;i<m;i+=3)
        {
        	dim[i/3][0]=arr[i];
        	dim[i/3][1]=arr[i+1];
        	dim[i/3][2]=arr[i+2];
        }
        
        for(int i=0;i<m;i+=3)
        {
        	int y=i/3;
        	v[i].h=dim[y][0];
            v[i].b=dim[y][1];
            v[i].l=dim[y][2];
            v[i+1].h=v[i].b;
            v[i+1].b=min(v[i].h,v[i].l);
            v[i+1].l=max(v[i].h,v[i].l);
            v[i+2].h=v[i].l;
            v[i+2].b=min(v[i].h,v[i].b);
            v[i+2].l=max(v[i].h,v[i].b);
            //cout<<dim[y][0]<<" ";
        }
        /*cout<<"\n";
        for(int i=0;i<m;i++)
        {
        	cout<<v[i].l<<" "<<v[i].b<<" "<<v[i].h<<"\t ";
        }
        cout<<"\n";*/
        sort(v,v+m,comp);
        /*for(int i=0;i<m;i++)
        {
        	cout<<v[i].l<<" "<<v[i].b<<" "<<v[i].h<<"\t ";
        }*/
        int dp[m];
        dp[0]=v[0].h;
        
        for(int i=1;i<m;i++)
        {
            int ht = v[i].h;
            for(int j=0;j<i;j++)
            {
                if(v[j].l>v[i].l && v[j].b>v[i].b && ht<v[i].h+dp[j])
                {
                    
                    {
                        ht=v[i].h+dp[j];
                        //cout<<ht<<" ";
                    }
                }
            }
            dp[i]=ht;
            //cout<<"\n";
        }
        int lk = 0;
        for(int i=0;i<m;i++)
        {
        	//cout<<dp[i]<<" ";
            if(dp[i]>lk)
            lk=dp[i];
        }
        cout<<lk<<"\n";
        
    }
	return 0;
}