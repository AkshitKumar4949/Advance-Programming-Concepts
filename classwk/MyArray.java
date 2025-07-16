package classwk;
class MyArray {
    int[] arr;
    int size = 0;
    MyArray(){
        arr = new int[10];
    }
    void add(int x){
        if(size==arr.length){
            resize();
        }
        arr[size]=x;
        size++;
    }
    void resize(){
        int[] temp = new int[(int)(size*1.5)+1];
        for(int i=0;i<size;i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }
    int size(){
        return size;
    }
    int get(int index){
        return arr[index];
    }
    public static void main(String[] args) {
        MyArray arr = new MyArray();
        arr.add(1);
        arr.add(7);
        arr.add(9);
        arr.add(69);
        arr.add(10);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
