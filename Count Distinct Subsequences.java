Static void subsequence(Set<String> sn, char[] s, char[] op, int i, int j, int n)
{
if(i==n)
{
op[j] = ‘\0’;
Sn.add(String.valueOf(op));
Return;
}
}
else
{
op[j] = s[I];
subsequence(sn, s, op, i+1, j+1, n);
subsequence(sn, s, op, i+1, j, n);

}
