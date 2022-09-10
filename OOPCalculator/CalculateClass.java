package OOPCalculator;

public class CalculateClass {

    //String obName;
    double x = 0;
    double y = 0;

    public CalculateClass(double x, double y) {
        
        this.x = x;
        this.y = y;
        
    }

    public void divide() {
        final double result = this.x / this.y;
        System.out.println("\n" + "The result is: " + result + "\n");
    }

    public void doubleNum() {
        double result = this.x * 2;
        System.out.println("\n" + "The result is: " + result + "\n");
    }

    public void doubleNum2() {
        double result = this.y * 2;
        System.out.println("\n" + "The result is: " + result + "\n");
    }
    public void doubleSum() {
        double result = this.x + this.y;
        System.out.println("\n" + "The result is: " + result + "\n");
    }
    
    public void multiply() {
        double result = this.x * this.y;
        System.out.println("\n" + "The result is: " + result + "\n");
    }
}
