package calculatorInheritance;

public class basicCalculator extends calculator {
   
    //- four methods: plus, minus, division, multiply.

    public void plus(Double num1, Double num2) {

        System.out.println(num1 + num2);

    }

    public void minus(Double a, Double b) {

        System.out.println(a - b);

    }

    public void division(Double a, Double b) {

        System.out.println(a / b);

    }

    public void multiply(Double a, Double b) {

        System.out.println(a * b);

    }

}
