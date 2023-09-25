import java.util.Comparator;

public class ToyComporatorByChance implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        return o2.getChance()-o1.getChance();
    }
}
