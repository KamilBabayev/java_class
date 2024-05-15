package less09.task06;

public class Dog extends Animal{
    @Override
    public void getAnimalSound() {
        System.out.println("Dogs bark");
    }

    @Override
    public void getAnimalSpeed() {
        System.out.printf("Dog speed is 15kmph");
    }
}
