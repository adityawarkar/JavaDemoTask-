package polymorphism;

public class Protect {

	public static void main(String[] args) {


		System.out.println("<<<<<<<<<<<<Army>>>>>>>>>>");
		duty(new Army1());
		System.out.println();
		System.out.println("<<<<<<<<<<<<Navy>>>>>>>>>>");
		duty(new Navy1());
		System.out.println();
		System.out.println("<<<<<<<<<<<<Airways>>>>>>>>>>");
		duty(new Airways1());

	}
	static void duty(SecurityForce1 sf) {
		sf.protect();
		
	}

}
abstract class SecurityForce1{
	abstract void protect();

}
class Army1 extends SecurityForce1{
    
    void useTank() {
        System.out.println("Army uses tanks");
    }
   
    void protect() {
        System.out.println("Protect land");
    }
}
class Navy1 extends SecurityForce1{
    
    void useShips() {
        System.out.println("Navvy uses ships");
    }
   
    void protect() {
        System.out.println("Protect Water");
    }
}
class Airways1 extends SecurityForce1{
    
    void useplanes() {
        System.out.println("Airways uses Planes");
    }
   
    void protect() {
        System.out.println("Protect Airway");
    }
}