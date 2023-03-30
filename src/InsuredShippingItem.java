public class InsuredShippingItem extends ShippingItem {
  private double insuredAmount;
  
  public InsuredShippingItem(double w, double insAmt) {
    super(w);
    insuredAmount = insAmt;
  }

  @Override
  public double getCost() {
    /* TO BE IMPLEMENTED IN PART C */
  }
  
  public void addMoreInsurance(double amt) {
    insuredAmount += amt;
  }
}