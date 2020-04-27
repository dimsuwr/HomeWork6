package Animals;

public class Animal {
    String name;
    int runLength;
    int swimLength;

    public Animal(String name, int runLength, int swimLength) {
        this.name = name;
        this.runLength = runLength;
        this.swimLength = swimLength;
    }

    public void run(){
        System.out.println(name + " пробежал " + runLength + " метров!");
    }


    public void swim() {
        System.out.println(name + " пропыл" + swimLength + " метров");
    }

}
