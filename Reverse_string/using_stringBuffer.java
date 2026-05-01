package Reverse_string;

public class using_stringBuffer {
    public static void main(String[] args){
        String str = "Java";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}

//same as stringbuilder
//thread-safe(synchronized)
//slightly slower than stringBuilder