class BinarySearch
{
    public static void main(String args[])
    {
        int[] a={1,2,3,4,5,6,7,8,9};
        System.out.println(search(a,7));
    }
    public static int search(int[] a,int key)
    {
        int str=0;
        int end=a.length-1;
        for(int i=str;i<=end;i++){
            int mid=(str+end)/2;
            if(key==a[mid]) return mid;
            else if(key>a[mid]) str=mid+1;
            else end=mid-1;
        }
        return -1;
    }
}