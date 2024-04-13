public class Eagle extends ABirdOfPrey implements IFlyable{

    @Override
    public void fly() {
        System.out.println("Орел летит");

    }

    @Override
    public void land() {
        System.out.println("Орел приземляется");

    }
    public void soarHigh(){
        System.out.println("Парит высоко в воздухе");
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void hunt() {
        System.out.println("Орел охотится");

    }

    @Override
    public void huntSmallAnimals() {
        System.out.println("Орел охотится на мелких животных");

    }
}
