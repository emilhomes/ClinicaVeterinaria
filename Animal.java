public class Animal {
    //Atributos do animal
    private String name;
    private int age;
    private double weight;
    private String owner;

    //Construtor
    public Animal(String name, int age, double weight, String owner) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.owner = owner;
    }

    //Métodos Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    //Métodos getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getOwner() {
        return this.owner;
    }

    //Métodos comer, domir, emitir som
    public void eat() {
        System.out.println(this.name + " is eating!");
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping!");
    }

    public void makeSound() {
        System.out.println(this.name + " making sound!");
    }
}

class Cachorro extends Animal {
    private String race;

    Cachorro(String name, int age, double weight, String owner, String race) {
        super(name, age, weight, owner);
        this.race = race;
    }

    //Método setter
    public void setRace(String race) {
        this.race = race;
    }

    //Método getter
    public String getRace() {
        return this.race;
    }

    public void wagTail() {
        System.out.println(getName() + " is wagging the tail");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Au Au Au");
    }
}

class Gato extends Animal {
    private String furColor;

    public Gato(String name, int age, double weight, String owner, String furColor) {
        super(name, age, weight, owner);
        this.furColor = furColor;
    }

    //Método setter
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    //Método getter
    public String getFurColor() {
        return furColor;
    }

    public void scratchingSofa() {
        System.out.println(getName() + " is scratching the sofa!");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Miau Miau");
    }
}

class Main {
    public static void main(String[] args) {
        Animal dog = new Cachorro("Rex", 2, 24.5, "Felipe", "Labrador");
        Animal cat = new Gato("Mingau", 1, 10.2, "Carla", "White");

        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();
    }
}