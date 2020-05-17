package chamrattt.java.collection;
public class Main {
    public static void main(String[] args) {
        Wrapper<Integer> integerWrapper = new Wrapper<Integer>();
        try {
//            integerWrapper.addItem(6);
//            integerWrapper.addItem(6);
//            integerWrapper.addItem(5);
//            integerWrapper.addItem(6);
            for (int i = 1;i<=1000;i++){
                integerWrapper.addItem(i);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < integerWrapper.list.size();i++){
            System.out.println(integerWrapper.getItem(i));
        }
    }
}


