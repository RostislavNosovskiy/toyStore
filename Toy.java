public class Toy  {
    private int id;
    private String toyName;
    private int chance;

    public Toy(int id, String toyName, int chance){
        this.id = id;
        this.toyName = toyName;
        this.chance = chance;
    }

    public String toString(){
        return "id: "+ this.id + ", Наименование игрушки: "+ this.toyName +  ", Вероятность выпадения данной иргуршки в конкурсе: "+ this.chance;
    }
    public int getChance(){
        return this.chance;
    }
public int getId(){return this.id;}
public String getToyName(){return this.toyName;}
}
