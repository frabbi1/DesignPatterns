package notificationSystem;

public class Client {
	
	private String name = "";
	
	public Client(String name){
		this.name = name;
	}
	
	public void sendNotificationVia(Notification notificationMethod) {
		System.out.print("Notification is ");
		notificationMethod.notifyUser();
		System.out.println(" for "+ name);
	}

}
