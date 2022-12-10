/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 *  enqueue() - помещает элемент в конец очереди,
 *  dequeue() - возвращает первый элемент из очереди и удаляет его,
 *  first() - возвращает первый элемент из очереди, не удаляя.
 */
import java.util.LinkedList;

public class task02 {
    private static LinkedList<Integer> enqueue(LinkedList<Integer> list, int x) {
        list.addLast(x);
        return list;          
    }
    private static int dequeue(LinkedList<Integer> list) {
        int numDeq = list.peekFirst();
        list.remove(list.peekFirst());
        return numDeq;          
    }
    private static int first(LinkedList<Integer> list) {
        int numFer = list.peekFirst();;
        return numFer;          
    }
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            lst.add(i);
        }
        System.out.println(lst);
        System.out.println("помещает элемент 10 в конец очереди");
        enqueue(lst, 10);
        System.out.println(lst);
        System.out.println("возвращает первый элемент из очереди и удаляет его");
        int numFerst = dequeue(lst);
        System.out.println(numFerst);
        System.out.println(lst);
        System.out.println("возвращает первый элемент из очереди, не удаляя");
        int numSecond = first(lst);
        System.out.println(numSecond);
        System.out.println(lst);        
    }
}
