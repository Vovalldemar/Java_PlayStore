import java.util.PriorityQueue;

public class ToyQueue {
    private PriorityQueue<Toy> toyQueue;

    public ToyQueue() {
        this.toyQueue = new PriorityQueue<>();
    }

   
    public void addToy(Toy toy) {
        toyQueue.add(toy);
    }
   
    public Toy getNextToy() {
        return toyQueue.poll();
    }

    public boolean isEmpty() {
        return toyQueue.isEmpty();
    }

    public void printQueue() {
        toyQueue.forEach(System.out::println);
    }
}
