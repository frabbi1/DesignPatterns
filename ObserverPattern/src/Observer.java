
public class Observer {
	private String name = "";
	public Observer(String name) {
		this.name = name;
	}
	public void getNotification(int price) {
		System.out.println(name + " gets Notification: " +"price Updated by "+ price + "\n");
	}
}
