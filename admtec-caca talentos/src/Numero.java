public class Numero {
    public static class Num {
        static int x = 5; //single variable for the entire class
        public void add1() {
            this.x++;
        }
    }

    public static void main(String[] args) {
        Num num = new Num(); //object
        System.out.println(num.x);
        num.add1(); //method
        System.out.println(num.x); //attribute x
    }
}
