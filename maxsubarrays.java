public class maxsubarrays {
    public static void printsubarrays(int number[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=number[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
            System.out.println("max sum=" + maxsum);
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        printsubarrays(number);
    }
}
