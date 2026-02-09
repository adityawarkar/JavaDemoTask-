package polymorphism;

class TriangleStatic {

	int b;
	int h;
	static float half;
		
	static {
		half = 0.5f;
	}
	
public TriangleStatic(int b,int h) {
	this.b = b;
	this.h = h;
}

float disp() {
	float area = half*b*h;
	return area;
}
}
class CircleStatic {
	int r;
	static float pi;
		
	
	static {
		pi=3.14f;
	} 
public CircleStatic(int r) {
	this.r = r;	
}

float disp() {
	float area = pi*r*r;
	return area;
}
}

class SquareStatic {
    int a;              
    static String unit; 
    static {
        unit = "sq.units";
    }
    public SquareStatic(int a) {
        this.a = a;
    }
    float disp() {
        float area = a * a;
        return area;
    }
}
class Rectangle{
	int 1;
	int b;
	public Rectangle(int 1,int b) {
		super();
		this.1 = 1;
		this.b = b;
	}
	public int getL() {
		return 1;
	}
	public int getB() {
		retrun b;
	}
	void findArea() {
		area1=1*b;
	}
}

public class Shapes {

	public static void main(String[] args) {
		TriangleStatic tc = new TriangleStatic(10,12);
		System.out.println(tc.disp());
		CircleStatic c = new CircleStatic(10);
		System.out.println(c.disp());
		SquareStatic s = new SquareStatic(4);
		System.out.println(s.disp());
		SquareStatic s = new RectangleStatic(2);
		System.out.println(s.disp());
		
	}

}
