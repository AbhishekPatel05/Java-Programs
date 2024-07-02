public class Palindrome {
    public static void main(String[] args) {
        String S = "Abhishek";
        StringBuilder A = new StringBuilder(S);
        A.reverse();
        if (S.equals(A.toString())){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
    }
    
}
