import java.util.Scanner;

public class palin {
    public static void main(String[] args) {
        int num,rev=0,rem,temp;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
