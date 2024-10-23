import java.util.PriorityQueue;

public class ToyQueue {
    private PriorityQueue<Toy> toyQueue;

    public ToyQueue() {
        this.toyQueue = new PriorityQueue<>();
    }

    public void addToy(Toy toy) {
        toyQueue.add(toy);
    }

    

    

    
}
