public class lastoccuerence {
    public static int lastOccuerence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=lastOccuerence(arr,key,i+1);
        if(isfound== -1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,5};
        System.out.println(lastOccuerence(arr,5,0));
    }
    
}
