import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.println("prime number");
        }else{
            boolean isprime=true;
            for(int i=2;i<=n-2;i++){
                if(n%i==0){
                     isprime=false;
                }
            }
            if(isprime==true){
                System.out.println("prime number");
            }else{
                System.out.println("not prime number");
            }
        }
    
    }
}
