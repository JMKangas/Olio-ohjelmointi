package OOPCalculatorRefined;

public class CalculateClass {

    //String obName;
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {

        this.x = x;

    }
    
    public double getY() {

        return y;

    }

    public void setY(double y) {

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
