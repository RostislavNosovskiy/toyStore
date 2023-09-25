import java.util.ArrayList;
import java.util.Scanner;

public class Raffle {
    public ToysBox put() {
        ToysBox toysBox = new ToysBox();
        Scanner scanner = new Scanner(System.in);
        int ounChance = 0;
        while (ounChance < 100) {
            boolean work = true;
            do {
try{Toy toy = this.getToyFromScanner(scanner);
    if (ounChance + toy.getChance() <= 100) {
        toysBox.addToy(toy);
        ounChance = ounChance + toy.getChance();
        work = false;
    } else {
        int num = 100 - ounChance;
        System.out.println("Вероятность выпадения данной игрушки должна быть не больше " + num + ", попрубйте задать корректную вероятность");
    }
}catch (NumberFormatException | NullPointerException e){
    System.out.println("Неправильный формат введённой строки, порробуйте ещё раз");
}
        } while (work);
    }
        return toysBox;
    }
public static int id;
    public Toy getToyFromScanner(Scanner scanner) {
        System.out.println("Введите информацию об игрушке в формате: 'ШансВыпаденияИгрушки НазваниеИгрушки'");
        String toyInf = scanner.nextLine();
        String[] toyInfo = toyInf.split(" ");
        Toy toy = null;
        if (toyInfo.length != 2) {
            return null;
        } else {
            id = id+1;
            int chance = Integer.parseInt(toyInfo[0]);
            toy = new Toy(id, toyInfo[1], chance);
        }
        return toy;
    }



}
