import java.util.ArrayList;
import java.util.Iterator;

public class getIterator{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        System.out.println(it.next());
        
    }
}