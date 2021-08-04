package eg2; 
public class Business {
	public boolean isValidPassword(String password) {
		if (password.matches("[A-Z]{1}[a-z]{5}[0-9]{1}")) {
			return true;
		}
		else
			throw new IsInValidPassword("entered password "+password+" is Invalid");
	}
	public boolean isValidAdharNumber(String adharnumber) throws IsInValidAdharNumber {
		if(adharnumber!=null && adharnumber.matches("[0-9]{12}")) 
			return true;
		else
			throw new IsInValidAdharNumber("Entered Adharnumber "+adharnumber+" is invalid");
			

	}
}