public class Cat extends Animal {
    String breed;

    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "This cat's name is " + this.name + ", is " + this.age +" years old and is a " + this.breed + " cat";
    }

    @Override
    public boolean equals(Object otherObject) {
        Cat otherCat = (Cat) otherObject;
        if (super.equals(otherObject) & this.breed == otherCat.breed) {
            return true;
        }
        else return false;
    }

    @Override
    public int hashCode() {
        int sum = 0;
        for (int i = 0; i < this.name.length(); i++) {
            sum = sum + (int) this.name.charAt(i);
        }
        return sum * age;
    }

    public static void main(String[] args) {
        Cat myCat = new Cat("Alex", 17, "Stray");
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        myCat.testInstanceMethod();
        Cat.testClassMethod();



        Animal firstAnimal = new Animal("Bucky", 12);
        Cat firsCat = new Cat("Joe", 9, "Stray");
        
        System.out.println(firstAnimal.toString());
        System.out.println(firstAnimal.hashCode());

        System.out.println(firsCat.toString());
        System.out.println(firsCat.hashCode());

        System.out.println("After cloning 2 new Animal and Cat objects:");
        
        Animal secondAnimal = (Animal) firstAnimal.clone();
        Cat secondCat = (Cat) firsCat.clone();

        System.out.println(secondAnimal.toString());
        System.out.println(secondAnimal.hashCode());

        System.out.println(secondCat.toString());
        System.out.println(secondCat.hashCode());

        System.out.println("After creating 2 new Animal and Cat objects:");

        Animal thirdAnimal = new Animal("John", 15);
        Cat thirdCat = new Cat("Trang", 1, "Bengal");

        System.out.println(thirdAnimal.toString());
        System.out.println(thirdAnimal.hashCode());

        System.out.println(thirdCat.toString());
        System.out.println(thirdCat.hashCode());

    }
}