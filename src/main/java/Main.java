public class Main {

    public static void main(String[] args) {

        Ints calc = new IntsCalculator(new Calculator());
        System.out.println(calc.sum(3, 1));
        System.out.println(calc.mult(20, 5));
        System.out.println(calc.pow(4, 4));

    }
}

