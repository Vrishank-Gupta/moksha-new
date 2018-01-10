  
// // #include <iostream>
// // using namespace std;
// // void buildTree(long long a[],long long curr,long long start,long long end,long long* tree)
// // {
// // 	if (start > end)
// // 		return;
// // 	if(start == end)
// // 	{
// // 		tree[curr] = a[start];
// // 		return;
// // 	}

// // 	else
// // 	{
// // 		long long mid = (start+end)/2;

// // 		buildTree(a,2*curr+1,start,mid,tree);
// // 		buildTree(a,2*curr+2,mid+1,end,tree);

// // 		tree[curr] = tree[2*curr+1]+tree[2*curr+2];
// // 	}
// // }

// // void updateRange(long long tree[],long long lazy[],long long index,long long s,long long e,long long rs,long long re,long long inc)
// // {
// // 	if (lazy[index] != 0)
// // 	{
// // 		tree[index] += (e-s+1) * lazy[index];

// // 		if(s!=e)
// // 		{
// // 			lazy[2*index+1] += lazy[index];
// // 			lazy[2*index+2] += lazy[index];
// // 		}

// // 		lazy[index] = 0;
// // 	}
	
// // 	if(s>e || s > re || e < rs)
// // 		return;

// // 	if(s >= rs && e <= re)
// // 	{
// // 		tree[index] += (e-s+1) * inc;

// // 		if(s != e)
// // 		{
// // 			lazy[2*index+1] += inc;
// // 			lazy[2*index+2] += inc;
// // 		}

// // 		return;
// // 	}


// // 		long long mid = (s+e)/2;

// // 		updateRange(tree,lazy,2*index+1,s,mid,rs,re,inc);
// // 		updateRange(tree,lazy,2*index+2,mid+1,e,rs,re,inc);

// // 		tree[index] = tree[2*index+1] + tree[2*index+2];
	
// // }

// // long long query(long long tree[],long long lazy[],long long l,long long r,long long s,long long e,long long index)
// // {
// // 	if(r<s || l>e || s>e)
// // 		return 0;

// // 	if(lazy[index] != 0)
// // 	{
// // 		tree[index] += (e-s+1)* lazy[index];

// // 		if(s != e)
// // 		{
// // 			lazy[2*index+2] += lazy[index];
// // 			lazy[2*index+1] +=  lazy[index];
// // 		}

// // 		lazy[index] = 0;
// // 	}

// // 	if(l <= s && r >= e)
// // 	{
// // 		return tree[index];
// // 	}

	
	
// // 		long long mid = (e+s)/2;

// // 		long long left = query(tree,lazy,l,r,s,mid,2*index+1);
// // 		long long right = query(tree,lazy,l,r,mid+1,e,2*index+2);
// // 		return(left+right);
	
// // }
// #include<iostream>
// #include<cstring>
// using namespace std;

// void buildTree(long long a[],long long curr,long long start,long long end,long long* tree)
// {
// 	if (start > end)
// 		return;
// 	if(start == end)
// 	{
// 		tree[curr] = a[start];
// 		return;
// 	}

// 	else
// 	{
// 		long long mid = (start+end)/2;

// 		buildTree(a,2*curr+1,start,mid,tree);
// 		buildTree(a,2*curr+2,mid+1,end,tree);

// 		tree[curr] = tree[2*curr+1]+tree[2*curr+2];
// 	}
// }

// void updateRange(long long tree[],long long index,long long s,long long e,long long rs,long long re)
// {
// 	if(re<s || rs >e)
// 		return;

// 	if(s==e)
// 	{
// 		tree[index] = (int)sqrt(tree[index]);
// 		return;
// 	}

// 	int mid = (s+e)>>1;

// 	updateRange(tree,2*index+1,s,mid,rs,re);
// 	updateRange(tree,2*index+2,mid+1,e,rs,re);

// 	tree[index] = tree[2*index+1] + tree[2*index+2];
// }

// int query1(int tree[],int index,int l,int r,int s,int e)
// {
// 	if(l<s || r>e)
// 	{
// 		return 0;
// 	}

// 	if (l )
// }
// int query(int tree[],int index,int l,int r,int s,int e)
// {
// 	if(l<s || r >e)
// 		return 0;

// 	if(l<=s && r<=e)
// 	{
// 		return tree[index];
// 	}

// 	int mid = (s+e)>>1;
// 	int left = query(tree,2*index+1,l,r,s,mid);
// 	int right = query(tree,2*index+2,l,r,mid+1,e);
// 	tree[index] = left+right;
// }

// int main()
// {
// 		long long n;
// 		long q;
// 		cin >> n;
// 		char a[n];

// 		cin.getline(a,n)
// 		long long tree[4*n+1];

// 		buildTree(a,0,0,n-1,tree);

// 		cin >> q;

// 		while(q--)
// 		{
// 				int type;
// 				cin >> type;
// 				if(type == 0)
// 				{
// 					int l,r;
// 					cin >> l >> r;
// 					updateRange(tree,0,0,n-1,l,r);
// 				}

// 				if(type == 1)
// 				{
// 					int l ,r;
// 					cin >> l >> r;
// 					cout << query(tree,0,l,r,0,n-1) << endl;
// 				}
			
// 		}
// 	return 0;	
// } 









// int a[n] ////My initial Given array

// int k = 0;

// for (int i =0;i<n;i++)
// {
// 	if(a[i]%2 == 0)
// 	{
// 		e[k++] = a[i];
// 	}
// }

// int size_of_even_array = k;


// k=0;

// for (int i =0;i<n;i++)
// {
// 	if(a[i]%2 != 0)
// 	{
// 		o[k++] = a[i];
// 	}
// }

// int size_of_odd_array = k;








// // or.////////







// int k=0,j=0;

// for (int i=0;i<n;i++)
// {
// 	if(a[i]%2==0)
// 		e[k++] = a[i];
// 	else
// 		o[j++] = a[i];
// }


// // k and j will give size of arrays respectively



#include<iostream>

using namespace std;

int main()

{
	int n =10;
	int a[n];
	for (int i=0;i<n;i++)
		cin >> a[i];
	int e[n],o[n];


	 ////My initial Given array

	int k = 0;

	for (int i =0;i<n;i++)
	{
		if(a[i]%2 == 0)
		{
			e[k++] = a[i];
		}
	}

	int size_of_even_array = k;


	k=0;

	for (int i =0;i<n;i++)
	{
		if(a[i]%2 != 0)
		{
			o[k++] = a[i];
		}
	}

	int size_of_odd_array = k;

	for (int i=0;i<size_of_odd_array;i++)
	{
		cout << o[i] << " ";
	}
		cout << endl;

	for (int i=0;i<size_of_even_array;i++)
		cout << e[i] << " ";


}

