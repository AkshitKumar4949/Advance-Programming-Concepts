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
        System.out.println(st);
    }
}
