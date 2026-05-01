package palindrome_string;
//it is a two pointer technique
public class using_loop {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome=true;

        int start = 0;
        int end = str.length() -1;

        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                isPalindrome = false;
                break;
            }
            start++;
            end--;

        }
        if(isPalindrome){
            System.out.println("palindrome");

        }else{
            System.out.println("Not palindrome");
        }
    }
}
