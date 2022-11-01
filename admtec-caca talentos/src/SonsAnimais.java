public abstract class SonsAnimais {
   public String nome;

    public SonsAnimais(String nome) {
       this.nome = nome;
   }

   public abstract void somAnimal();

   public static class Gato extends SonsAnimais {
       public Gato(String nome) {
           super(nome);
       }
       public void somAnimal() {
          System.out.println("Miau!");
       }
   }
    public static void main(String[] args) {
       Gato cat = new Gato("Milô");
       System.out.println(cat.nome);
       cat.somAnimal();
    }
}
