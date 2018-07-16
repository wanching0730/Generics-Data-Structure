package FindMinimum;

import java.util.ArrayList;

public class FindMin {
    public static <E extends Comparable<E>> E min (ArrayList<E> list) {
        E min = list.get(0);

        for(int i = 1; i < list.size(); i++) {
            if(min.compareTo(list.get(i)) > 0)
                min = list.get(i);
        }

        return min;
    }

    public static void main(String[] args) {
        ArrayList<Rectangle> list = new ArrayList<>();
        list.add(new Rectangle(4,5));
        list.add(new Rectangle(20,30));
        list.add(new Rectangle(1,9));
        System.out.println(min(list));
    }
}
