class InsertionSort
{
    public static void main(String args[])
    {
        int[] a={5,2,8,9,6,1,4,7,3};
        sort(a);
        for(int n:a) System.out.println(n);
    }
    public static void sort(int[] a)
    {
        for(int i=1;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
}