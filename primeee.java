import java.util.Scanner;

public class primeee {
    public static void main(String[] args) {
        int num,count=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=0;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime number");
        }else{
            System.out.println("not prime number");
        }
    }
}
