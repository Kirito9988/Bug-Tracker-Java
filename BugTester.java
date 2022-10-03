
public class BugTester {

	public static void main(String[] args) {
		Bug b1=new Bug(10);
		b1.move();
		System.out.println("Current Location After 1st Move: "+ b1.getPosition());
		
		b1.move();
		System.out.println("Current Location After 2nd Move: "+ b1.getPosition());
		
		b1.turn();
		System.out.println("Current Location After 1st turn : "+ b1.getPosition());
		
		b1.move();
		System.out.println("Current Location After 3rd Move: "+ b1.getPosition());
		
		b1.move();
		System.out.println("Current Location After 4th Move: "+ b1.getPosition());
		
		b1.move();
		System.out.println("Current Location After 5th Move: "+ b1.getPosition());
		
		b1.turn();
		b1.move();
		System.out.println("Final Location After turn and Move: "+ b1.getPosition());

	}

}
