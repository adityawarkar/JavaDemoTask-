package Inheritance;

class Trainer {
		void teach() {
			System.out.println("Teaches");
		}
	}
class JavaTrainee extends Trainer{
	void teach() {
		System.out.println("Teachs Java");

	}
}
class AptiTrainer extends Trainer{
	void teach() {
		System.out.println("Teaches Apti");
	}
}
class TestingTrainer extends Trainer{
	void teach() {
		System.out.println("Teaches Java");
	}
}

public class JavaTrainer {

	public static void main(String[] args) {
//		Trainer t;
		
		duty(new JavaTrainee());
		duty(new AptiTrainer());
		duty(new TestingTrainer());
		
//		t=new JavaTrainee();
//		t.teach();
//		t=new AptiTrainer();
//		t.teach();
//		t=new TestingTrainer();
//		t.teach();
	}
	static void duty(Trainer t) {
		t.teach();
		
	}
}

//In the above program polymorphism could not be achieve due to type coupling.
//TypeCoupling refers to a process of a child type reference refering to a child type object.
//Also in the above program three refrence variable calling one teach method each i.e. 'jt' is calling teach methodo of java tariner class.
//'at' is calling teach method of aptitraiuner calss.
//And 'tt' is calling teach method of testingtrainer of class this is 3:3 or 1:1 relationship.
//Therefore polymorphism does not exist in the above program or ex-1.
//If polymosphism has to be achieve we must achieve loose coupling.
//loose caoupling refers to the process of a parent reference refering to a child type object.