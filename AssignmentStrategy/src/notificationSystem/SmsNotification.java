package notificationSystem;

public class SmsNotification implements Notification{
	
	private String phone = "";
	
	public SmsNotification(String phone) {
		this.phone = phone;
		
	}
	
	public void notifyUser() {
		System.out.print("turned on via sms to " + phone);
	}

}
