package collectionsANDframeworks;
import java.util.Stack;
// Follows LIFO. Thid class extends Vector. Stack is also synchronized like Vector.
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.pop();
        System.out.println(st.peek());
        // stack has 2 methods one is isempty(isempty is overridden function from list) and other is empty (empty is stack's own function).
        System.out.println(st);
    }
}
