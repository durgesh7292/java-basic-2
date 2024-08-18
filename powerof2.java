public class powerof2 {
    public static boolean ispowerof(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(ispowerof(16));
    }
}
