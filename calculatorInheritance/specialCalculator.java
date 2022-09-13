package calculatorInheritance;


public class specialCalculator extends calculator {
    
    public void special() {

        System.out.println("Hello World!");

    }

    //- two methods: pi, square, square root.

    public void square(Double a, Double b) {

        Double squareA = a * a;
        Double squareB = b * b;

        System.out.println(squareA - squareB);

    }

    public void squareRoot(Double a) {

        System.out.println(Math.sqrt(a));

    }

    public void pi() {

        System.out.println(Math.PI);

    }

}