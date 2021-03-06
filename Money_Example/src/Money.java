
 class Money {
	protected int amount;
	protected String currency;
	
	Money() {
		}
	
	Money(int amount) {
		this.amount= amount;
		currency = "CHF";
		}
	
	Money(int amount,String currency) {
		this.amount=amount;
		this.currency = currency;
		}
	
	public boolean equals(Object object) {		
		Money money= (Money) object;
		//return amount == money.amount && getClass().equals(money.getClass()); //to compare money and francs
		return amount == money.amount
		&& currency().equals(money.currency());
		}
	
	static Money dollar(int amount) {
		return new Dollar(amount);
		}
	
	static Money franc(int amount) {
		return new Franc(amount);
		}
	
	Money times(int multiplier){
		return new Money(amount * multiplier, currency);
	}
	
	Money plus(Money addend) {
		return new Money(amount + addend.amount, currency);
		}
	
	String currency() {
	return currency;
	}
	
	public String toString() {
		return amount + " " + currency;
		}
}
