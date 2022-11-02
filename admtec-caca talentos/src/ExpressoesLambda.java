import java.util.ArrayList;
import java.util.function.Consumer;


public class ExpressoesLambda {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(9);
        numeros.add(8);
        numeros.add(1);
        Consumer<Integer> metodo = (n) -> { System.out.println(n); };
        numeros.forEach( metodo );
    }
}