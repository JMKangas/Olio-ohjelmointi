
public class currencyObject {
  private double euros;
  private double usd;
  private double gbp;
  private double chf;
  private double jpy;
  private double kes;

  public currencyObject(double euros) {

    this.euros = euros;
    this.usd = euros * 1.003;
    this.gbp = euros * 0.86;
    this.chf = euros * 0.98;
    this.jpy = euros * 139.71;

  }

  public double getEuros() {
    return euros;
  }

  public double getUsd() {
    return usd;
  }

  public double getGbp() {
    return gbp;
  }

  public double getChf() {
    return chf;
  }

  public double getJpy() {
    return jpy;
  }

  public void setEuros(double euros) {
    this.euros = euros;
  }

  public void setUsd(double euros) {
    this.usd = euros * 1.003;
  }

  public void setGbp(double euros) {

    this.gbp = euros * 0.86;

  }

  public void setChf(double euros) {
    this.chf = euros * 0.98;
  }

  public void setJpy(double euros) {
    this.jpy = euros * 139.71;
  }

  public double getKes() {
    return kes;
  }

  public void setKes(double euros) {
    this.kes = euros * 120.74;
  }

  public void convert() {

    System.out.println("You have " + usd + " USD");
    System.out.println("You have " + gbp + " GBP");
    System.out.println("You have " + chf + " CHF");
    System.out.println("You have " + jpy + " JPY");
    
  }
}
