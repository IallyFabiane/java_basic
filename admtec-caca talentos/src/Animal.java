public class Animal {
    String nome;

    public Animal(String name) { //constructor
        String nome = name;
    }

    public static void main(String[] args) {
        Animal cat = new Animal("Milo");
        System.out.println(cat.nome);
    }
}
