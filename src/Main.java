import Animals.Animal;
import Animals.Cat;
import Animals.Dog;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Максим", 190, 0),
                new Cat("Мурзик", 200,10 ),
                new Cat("Барс", 210, 50),
                new Dog("Боб", 400, 10),
                new Dog("Роберт", 500, 11),
                new Dog("Счастливчик", 600, 30)
        };
        for (int i = 0; i < animals.length ; i++) {
            animals[i].run();
            animals[i].swim();
        }

        System.out.println("Всего у нас животных: " + animals.length);


    }
}
