import java.util.Arrays;
 
class Palindrome {
        public static void main(String args[]) {
            String msg = Arrays.toString(args).replaceAll("\\[","").replaceAll("\\]","");
            msg = msg.replaceAll("[^A-Za-z]", "").toLowerCase();
            String rev = new StringBuilder(msg).reverse().toString();
            if(msg.equals(rev)) {
                System.out.println("Given String "+msg+" is a Palindrome.");
            }
            else
            {
                System.out.println("Given String "+msg+" is not a Palindrome.");
            }
        }
}