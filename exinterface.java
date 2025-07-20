interface Animal {
    void makesound();
}

class Cat implements Animal {
    public void makesound() {
        System.out.println("Cat is eating");
    }
}

class Dog implements Animal {
    public void makesound() {
        System.out.println("Dog is jumping");
    }
}

public class exinterface {
    public static void main(String[] args) {
        Animal c = new Cat();
        Animal d = new Dog();
        
        c.makesound();
        d.makesound();
    }
}

