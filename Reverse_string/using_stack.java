package Reverse_string;
import java.util.Stack;

public class using_stack {
    public static void main(String[] args)
    {
        String str = "Java";
        Stack<Character> stack = new Stack<>();
        for (char c:str.toCharArray()){
            stack.push(c);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
//using LIFO principles
//Demonstrate kowledge of stack