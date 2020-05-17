package chamrattt.java.collection;
import java.util.ArrayList;
import java.util.List;

public class Wrapper<T> {
    public List<T> list = new ArrayList<T>();
    public T addItem(T value) {
        try {
            if (value == null)
                throw new NullPointerException("Value cannot be null.");
                if(list.contains(value))
                    throw new Exception("Value input cannot duplicate.");
                    list.add(value);
        } catch (NullPointerException nullPoint) {
            System.out.println(nullPoint.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (T) list;
    }

    public T getItem(int index) {
        return list.get(index);
    }
}
