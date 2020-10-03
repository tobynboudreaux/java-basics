class Animal {
    public Animal(String name){
        super();
    }
}

public class Dog extends Animal {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        super("");
        this.name = name;
        this.breed = breed;
    }
}