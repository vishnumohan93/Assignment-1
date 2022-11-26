package nov.automation.week1;

public class Mobile {
	public void sendsms() {
		System.out.println("Happy to learn java");
	}
	public void makecall() {
		System.out.println("Calling my friend");
	}
	public static void main (String[] args) {
		Mobile message = new Mobile();
		message.sendsms();
		message.makecall();	
	}
	
}
