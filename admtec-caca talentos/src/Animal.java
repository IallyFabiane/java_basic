public class Animal {
    String nome;

    public Animal(){}
    public Animal(String name) { //constructor
        this.nome = name;
    }

    public static void main(String[] args) {
        Animal cat = new Animal("Milo");
        System.out.println(cat.nome);
    }
}
