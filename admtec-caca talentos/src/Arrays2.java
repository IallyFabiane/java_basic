import java.util.ArrayList;

public class Arrays2 {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<String>(); //array alteravel
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
