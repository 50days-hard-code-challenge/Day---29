double myPow(double x, int n) {
    if(n==0)return 1;
    if(n<0)return 1/myPow(x,-n+1)*x;
    return myPow(x,n-1)*x;
}
