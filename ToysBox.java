import java.util.*;

public class ToysBox {
    private Queue<Toy> toyBox;
public ToysBox(){
    this.toyBox = new PriorityQueue<>(new ToyComporatorByChance());
}
    public void addToy(Toy toy){
        this.toyBox.add(toy);
    }
    public Toy get(int i){
    Toy res = this.toyBox.poll();
        assert res != null;
        Toy newToy = new Toy(res.getId(), res.getToyName(), res.getChance()-100/i);
        this.toyBox.add(newToy);
        return res;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Toy toy: toyBox){
            sb.append(toy);
            sb.append("\n");
        }
        return sb.toString();
    }


}
