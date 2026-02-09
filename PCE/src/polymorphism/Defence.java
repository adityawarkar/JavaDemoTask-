package polymorphism;

public class Defence {
    public static void main(String[] args) {
        duty(new Army2());
        duty(new Navy2());
        duty(new AirForce2());
    }
    static void duty(SecurityForce sf) {
        sf.job();           
        sf.protect();       
        sf.specialWeapon(); 
        System.out.println("------------------------");
    }
}

class SecurityForce {
    void job() {
        System.out.println("To protect Nation");
    }
     void protect() {
    	 System.out.println("To save life");
     }
     void specialWeapon() {
    	 System.out.println("To use weapon");
}


class Army2 extends SecurityForce {
    
    void protect() {
        System.out.println("Protect land");
    }
   
    void specialWeapon() {
        System.out.println("Army uses tanks");
    }
}

class Navy2 extends SecurityForce {
    
    void protect() {
        System.out.println("Protect water");
    }
    
    void specialWeapon() {
        System.out.println("Navy uses ships");
    }
}

class AirForce2 extends SecurityForce {
    
    void protect() {
        System.out.println("Protect airways");
    }
   
    void specialWeapon() {
        System.out.println("AirForce uses jets");
    }
}
}



