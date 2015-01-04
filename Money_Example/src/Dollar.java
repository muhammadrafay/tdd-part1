

public class Dollar {
	public int amount=0;
	private int pvt_amount=0; // made pvt for chap 4 as as of chap 10 dollar is the only class accessing it
	
	Dollar(int amount) {
		this.amount= amount;
		this.pvt_amount= this.amount;
		}
	
	//changes the amount of the object
	void times(int multiplier) {
		amount *= multiplier;
		pvt_amount *= multiplier;
		}
	
	//returns object without changing actual amount
	Dollar timesReturnDollar(int multiplier) {
		//amount *= multiplier;
		//return null;
		return new Dollar(amount * multiplier);
		}
	
	public boolean equals(Object object) {
		Dollar dollar= (Dollar) object;
		return amount == dollar.amount;
		}
}
