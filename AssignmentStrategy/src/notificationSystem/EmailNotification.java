package notificationSystem;

public class EmailNotification implements Notification {
	
	private String email = "";
	
	public EmailNotification(String email) {
		this.email = email;
	}


	public void notifyUser() {
		System.out.print("turned on via Email to " + email);

	}

}
