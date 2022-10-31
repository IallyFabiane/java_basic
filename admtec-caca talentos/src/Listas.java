import java.util.ArrayList;
import java.util.LinkedList;

public class Listas {
    public static void main(String[] args) {
        LinkedList<String> carros = new LinkedList<String>(); //array alteravel
        carros.add("Ford");
        carros.add("Volkswagen");
        carros.add("Fiat");
        carros.add("Nissan");
        System.out.println(carros.set(0, "Chevrolet"));
        System.out.println(carros.remove(0));
        System.out.println(carros.get(0));
        for(int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
        carros.clear();
        System.out.println(carros);
        System.out.println(carros.size());
    }
}
