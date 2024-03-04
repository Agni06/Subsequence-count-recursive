int count(string a, int b, int m, int n)
{
if(m==-1 and n==-1 or n==-1)
{
Return 1;
}
if(m==-1)
{return 0;
}
if(a[m]==b[n])
{
Return count(a, b, m-1, n-1) + count(a, b, m-1, n);

}
Return count(a, b, m-1, n);

}

