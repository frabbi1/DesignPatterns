package notificationSystem;

public class Test {

	public static void main(String[] args) {
		Client jodu = new Client("Jodu");
		jodu.sendNotificationVia(new SmsNotification("01711111111"));
		
		Client abdul = new Client("Abdul");
		abdul.sendNotificationVia(new EmailNotification("bsse09xx@iit.du.ac.bd"));
		
		Client rabbi = new Client("Rabbi");
		rabbi.sendNotificationVia(new BlockNotification());

	}

}
