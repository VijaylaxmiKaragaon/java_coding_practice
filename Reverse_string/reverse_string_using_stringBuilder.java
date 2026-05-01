package Reverse_string;

public class reverse_string_using_stringBuilder {
    public static void main(String[] args){
        String str = "Java";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }
}


// StringBuilder has a built-in reverse() method
// Fast and memory-efficient
// Best choice in real world applications