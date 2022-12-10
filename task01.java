import java.util.LinkedList;
import java.util.Collections;


/**
 * Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернет “перевернутый” список.
 */
public class task01 {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            lst.add(i);
        }
        System.out.println(lst);
        Collections.reverse(lst);
        System.out.println(lst);

    }
}