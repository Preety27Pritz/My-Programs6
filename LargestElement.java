class LargestElement
{
    public static void main(String args[])
    {
        int[] a={15,6,23,899,5};
        int large=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>large) large=a[i];
        }
        System.out.println("Largest Element in the array is:"+large);

    }
}