package entities;

interface Animal {
    public void somAnimal();
}

class Porco implements Animal {
    @Override
    public void somAnimal() {
        System.out.println("O porco faz \"Oinc, oinc\"");
    }
}

class Interfaces {
    public static void main(String[] args) {
        Porco porco = new Porco();
        porco.somAnimal();
    }
}