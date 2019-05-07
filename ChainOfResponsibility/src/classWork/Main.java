package classWork;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
		Operation add = new Add();
		Operation sub = new Sub();
		Operation mult = new Multiplication();
		Operation div = new Division();
		Operation N = new NullObject();
		
		add.setNext(sub);
		sub.setNext(mult);
		mult.setNext(div);
		div.setNext(N);
		
		String input = inp.nextLine();
		String[] list = parse(input);
		
		int ans  = add.calculate(list[0], list[2], list[1]);
		if(ans == 9999999 ) {
			System.out.println("Division failed");
			
		}
		else if(ans == -999999) System.out.println();
		else {
			System.out.println("Result = " + ans);
			
		}

	}
	
	public static String[] parse(String input){
		String[] list;
		list  = input.split(" ");
		
		return list;
	}

}
