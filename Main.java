import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
ToysBox toysBox = new ToysBox();
Raffle raffle = new Raffle();
toysBox = raffle.put();
        try (FileWriter fileWriter = new FileWriter("Raffle", true) ){
            fileWriter.append("Разыгрываемые игрушки: ").append("\n").append(toysBox.toString()).append("\n");
        }catch(IOException e){
            System.out.println("Ошибка записи в файл");
        }
        int[]arr = new int[10];
        for (int i=0; i<arr.length;i++){
        Toy toy = toysBox.get(arr.length);
        arr[i] = toy.getId();}

        try (FileWriter fileWriter = new FileWriter("Raffle", true) ){
            fileWriter.append("Результат аукциона: ").append(Arrays.toString(arr)).append("\n");
        }catch(IOException e){
            System.out.println("Ошибка записи в файл");
        }

    }
}
