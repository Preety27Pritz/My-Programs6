class SmallestElement
{
    public static void main(String args[])
    {
        int[] a={15,6,23,899,5};
        int small=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<small) small=a[i];
        }
        System.out.println("Smallest Element in the array is:"+small);

    }
}