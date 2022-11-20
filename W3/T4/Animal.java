public class Animal implements Cloneable {
    String name;
    int age;

    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "This animal's name is " + this.name + " and is " + this.age +" years old";
    }

    @Override
    public Object clone() {
        try{  
            return super.clone();  
        }catch(Exception e){ 
            return null; 
        }
    }

    @Override
    public boolean equals(Object otherObject) {
        Animal otherAnimal = (Animal) otherObject;
        if (this.name == otherAnimal.name & this.age == otherAnimal.age) {
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
}