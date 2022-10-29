public class Arrays {
    public static void main(String[] args) {
        String[] carros = {"Tesla", "BMW", "Lamborgini"};
        carros[1] = "Porshe"; //reallocation
        int[] meusNumeros = {1,2, 3, 4, 5};
        for(int i = 0; i < carros.length; i++) {
            System.out.println(carros[i]);
        }
        for(int i: meusNumeros) { //forEach
            System.out.println(i);
        }
    }
}
