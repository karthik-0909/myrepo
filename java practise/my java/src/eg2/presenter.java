package eg2;

public class presenter {

	public static void main(String[] args) {
		Business p1=new Business();
		try {
			if(p1.isValidAdharNumber("123245678912")) {
				System.out.println("AdharNumber is valid");
			}
		} catch (IsInValidAdharNumber e) {
			System.out.println(e.getMessage());
		}
		
		try{
			if (p1.isValidPassword("Passme1")) {
				System.out.println("Entered Password is Valid ");
			}
		}
		catch(IsInValidPassword e){
			System.out.println(e.getMessage());
			
		}

	}

}
