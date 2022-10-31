public class Heranca {

    public static class Veiculo { //superclass
        protected String marca = "Ford";
        public void buzinar() {
            System.out.println("Bibi, bibi");
        }
    }

    public static class Carro extends Veiculo { //subclass
        private String nomeModelo = "Mustang";
    }
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.buzinar();
        System.out.println(meuCarro.marca + " " + meuCarro.nomeModelo);
    }
}
