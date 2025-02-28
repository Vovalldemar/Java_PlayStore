public class Toy implements Comparable<Toy> {
    private int id;
    private String name;
    private int weight;

    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Toy other) {
        return Integer.compare(other.weight, this.weight); // приоритет веса
    }

    @Override
    public String toString() {
        return "Toy{id=" + id + ", name='" + name + "', weight=" + weight + '}';
    }
}
