package polymorphism;

public class TendulkarApp {

	public static void main(String[] args) {
		Tendulkar t=new ArjunTendulkar();
		t.job();
		t.profession();
		//t.smoke();
		((ArjunTendulkar)t).smoke();
	}
 
}
class Tendulkar{
	void job() {
		System.out.println("Play Cricket");
	}
	void profession() {
		System.out.println("He is Batsman");
	}
}
class ArjunTendulkar extends Tendulkar{
	void profession() {
		System.out.println("He is a Baller");
	}
	void smoke() {
		System.out.println("He Smoke some time");
	}
}