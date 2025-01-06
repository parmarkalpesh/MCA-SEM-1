import java.util.ArrayList;
public class cricket<T> {
    ArrayList<T> items = new ArrayList<>();
    public void addItem(T item)
    {
        items.add(item);
    }
    public T getItem(int index){

        return items.get(index);
    }
    
    public static void main(String[] args) {
        cricket <String> myobj = new cricket<>();
        myobj.addItem("sachiv");
        myobj.addItem("Dravid");

        String name = myobj.getItem(0);
        System.out.println("Player Name: "+name);

        // myobj.addItem(123);
        cricket<Integer> myobj1 = new cricket<>();
        // myobj.addItem(10);
        System.out.println("First Number: "+myobj1.getItem(0));
    }
    
}
