package generic;

public class WC<T>  {
    private T value;
    WC(T value){
        this.value=value;
    }
    public static void main(String[] args) {
        WC<Integer> one = new WC<>(5);
        System.out.println(one.get());
    }
    public T get(){
        return value;
    }
}
