class SecSmallestElement
{
    public static void main(String args[])
    {
        int[] a={15,6,23,899,5};
        int s1=a[0];
        int s2=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<s1){
                s2=s1;
                s1=a[i];
            }
            else if((s1==s2 || a[i]<s2) && a[i]!=s2) a[i]=s2;
        }
        System.out.println(s2);
    }
}