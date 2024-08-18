import java.util.Scanner;

public class paal {
    public static void main(String[] args) {
        int num,rev=0,rem,temp;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }if(temp==rev){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrome");
        }
    }
    
}
