package palindrome_string;

public class using_stringBuilder {
    public static void main(String[] args) {
        
        
        String str = "madam";
        
        String reversed = new StringBuilder(str).reverse().toString();
        
        if(str.equals(reversed)){
            System.out.println("palindrome");
            
        }else {
            System.out.println("not palindrome");
        }
        
    }
}
