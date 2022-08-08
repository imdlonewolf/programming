#include<bits/stdc++.h>
using namespace std;
int solve(int a[],int i,int j){
    if(i==j)  //only one coin
    return a[i];
    if(i>j)   //no coin
    return 0;
    int l=a[i]+min(solve(a,i+2,j),solve(a,i+1,j-1));  
    // if I select a[i] then the opponent can select a[i+1] or a[j]
    int r=a[j]+min(solve(a,i,j-2),solve(a,i+1,j-1));
    //  if I select a[j] then the opponent can select a[i] or a[j-1]
    return max(l,r);
}
int dp[100][100];
int solve_dp(int a[],int i,int j){
    if(i==j)
    return a[i];
    if(i>j)
    return 0;
    if(dp[i][j]!=-1)
    return dp[i][j];
    int l=a[i]+min(solve(a,i+2,j),solve(a,i+1,j-1));  
    // rem coins -> a[i+1.....j]
    int r=a[j]+min(solve(a,i,j-2),solve(a,i+1,j-1));
    //  rem coins -> a[i.....j-1]
    dp[i][j]=max(l,r);
    return dp[i][j];
}
int main(){
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
        dp[i][j]=-1;
    }
    int a[n];
    for(int i=0;i<n;i++)
    cin>>a[i];
    cout<<solve_dp(a,0,n-1);
}