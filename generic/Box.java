package generic;

public class Box<T> {
    private T integer;
    public void setValue(T value){
        this.integer = value;
    }
    public T getValue(){
        return integer;
    }
    public static void main(String args[]){
        Box<String> obj = new Box<>(); 
        obj.setValue("fdaf");
        System.out.println(obj.getValue());
        Box<Integer> obj1 = new Box<>();
        obj1.setValue(4);
        System.out.println(obj1.getValue());
    }
}