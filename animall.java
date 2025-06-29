class animall {
    void eat() {
        System.out.println("I am eating");
    }
}

class Cat extends animall {
    void tasty() {
        System.out.println("tasty food");
    }
}

class Pet extends Cat {
    void jump() {
        System.out.println("and jumping");
    }

    public static void main(String[] args) {
        Pet p = new Pet();
        p.eat();
        p.tasty();
        p.jump();
    }
}
