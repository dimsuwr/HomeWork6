package Animals;

public class Cat extends Animal {
    public Cat(String name, int runLength, int swimLength) {
        super(name, runLength, swimLength);
    }


    @Override
    public void run() {
        if (runLength <= 200){
            System.out.println(name + " пробежал " + runLength + " метров!");
        } else {
            System.out.println(name + " не может пробежать " + runLength + " метров, максимум что он может это 200 метров!");
        }
    }


    @Override
    public void swim() {
        System.out.println("Кошки не умеют плавать!\n");
    }
}
