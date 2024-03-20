class LinearSearch
{
    public static void main(String args[])
    {
        int[] a={5,8,23,15,20,68,72,0,35};
        System.out.println(search(a,20));
    }
    public static int search(int[] a,int key)
    {
        for(int i=0;i<a.length;i++){
            if(a[i]==key) return i;
        }
        return -1;
    }
}