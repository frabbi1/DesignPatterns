
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sub =  new Subject();
		Observer user1 = new Observer("rabbi");
		Observer user2 = new Observer("fazlay");
		Observer user3 = new Observer("taher");
		
		sub.register(user1);
		sub.register(user2);
		sub.register(user3);
		
		sub.updatePrice(20);
		
		System.out.println("unregister----------------\n");
		
		sub.unregister(user2);
		sub.unregister(user3);
		sub.updatePrice(50);
	}

}
