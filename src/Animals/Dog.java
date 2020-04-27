package Animals;

public class Dog extends Animal{
    public Dog(String name, int runLength, int swimLength) {
        super(name, runLength, swimLength);
    }

    @Override
    public void run() {
        if (runLength <= 500){
            System.out.println("Пёс " + name + ", пробежал " + runLength + " метров!");
        }else {
            System.out.println("Пёс " + name + ", хоть и выносливый, но он не может пробежать "
                    + runLength + " метров, максимум что он может это 500 метров!");
        }
    }


    @Override
    public void swim() {
        if (swimLength <= 10){
            System.out.println("Пёс " + name + ", проплыл " + swimLength + " метров!\n");
        }else {
            System.out.println(name + ", не может проплыть " + swimLength + " метров, максимум что он может это 10 метров!\n");
        }
    }
}
