class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("boo boo boo");
    }
}

class DogTestDrive {
    public static void main(String[] args) {
        Dog Rex = new Dog();
        Rex.size = 40;
        Rex.bark();
    }
}