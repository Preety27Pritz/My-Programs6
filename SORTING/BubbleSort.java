class BubbleSort
{
    public static void main(String args[])
    {
        int[] a={5,2,8,9,6,1,4,7,3};
        sort(a);
        for(int n:a) System.out.println(n);
    }
    public static void sort(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}