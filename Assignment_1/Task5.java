public class Task5 {
  // variables
  private String customer; // Customer name
  private String bank; // Bank 
  private String account; // Account       
  private int limit; // Bank Limit           
  protected double balance; // Balance     

  // Constructors:
  /**
   * Constructs a new credit card instance.
   * @param cust        the name of the customer (e.g., "John Bowman")
   * @param bk          the name of the bank (e.g., "California Savings")
   * @param acnt        the account identifier (e.g., "5391 0375 9387 5309")
   * @param lim         the credit limit (measured in dollars)
   * @param initialBal  the initial balance (measured in dollars)
   */
  public Task5(String cust, String bk, String acnt, int lim, double initialBal) {
    customer = cust;
    bank = bk;
    account = acnt;
    limit = lim;
    balance = initialBal;
  }

  /**
   * Constructs a new credit card instance with default balance of zero.
   * @param cust    the name of the customer (e.g., "John Bowman")
   * @param bk      the name of the bank (e.g., "California Savings")
   * @param acnt    the account identifier (e.g., "5391 0375 9387 5309")
   * @param lim     the credit limit (measured in dollars)
   */
  public Task5(String cust, String bk, String acnt, int lim) {
    this(cust, bk, acnt, lim, 0.0); // Default balance 0             
  }

  // Accessor methods:
  /** Returns the name of the customer. */
  public String getCustomer() { return customer; }

  /** Returns the name of the bank */
  public String getBank() { return bank; }

  /** Return the account identifier. */
  public String getAccount() { return account; }

  /** Return the credit limit. */
  public int getLimit() { return limit; }

  /** Return the current balance. */
  public double getBalance() { return balance; }

  // Update methods:
  /**
   * Charges the given price to the card, assuming sufficient credit limit.
   * @param price  the amount to be charged
   * @return true  if charge was accepted; false if charge was denied
   */
  public boolean charge(double price) {               // make a charge
    if (price + balance > limit)                      // if charge would surpass limit
      return false;                                   // refuse the charge
    // at this point, the charge is successful
    balance += price;                                 // update the balance
    return true;                                      // announce the good news
  }

  /**
   * Processes customer payment that reduces balance.
   * @param amount  the amount of payment made
   */
  public void makePayment(double amount) { // Making a payment           
    balance -= amount;
  }

  @Override // Modification to Task5
  public String toString() {
    return "Customer = " + customer + 
            "\nBank = " + bank + 
            "\nAccount = " + account +
            "\nBalance = " + balance + 
            "\nLimit = " + limit;
  }

  public static void main(String[] args) {
    Task5[] wallet = new Task5[3];
    wallet[0] = new Task5("John Bowman", "California Savings",
                               "5391 0375 9387 5309", 5000);
    wallet[1] = new Task5("John Bowman", "California Federal",
                               "3485 0399 3395 1954", 3500);
    wallet[2] = new Task5("John Bowman", "California Finance",
                               "5391 0375 9387 5309", 2500, 300);

    for (int val = 1; val <= 16; val++) {
      wallet[0].charge(3*val);
      wallet[1].charge(2*val);
      wallet[2].charge(val);
    }

    for (Task5 card : wallet) {
      System.out.println(card); // Replacing printSummary with println
      while (card.getBalance() > 200.0) {
        card.makePayment(200);
        System.out.println("New balance = " + card.getBalance());
      }
    }
  }
}