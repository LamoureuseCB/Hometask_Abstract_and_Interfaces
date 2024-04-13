public class Swan extends AAnimal implements IFlyable, ISwimable {
    @Override
    public void makeSound() {
        System.out.println("Лебедь издает звук");
    }

    @Override
    public void fly() {
        System.out.println("Лебедь летит");

    }

    @Override
    public void land() {
        System.out.println("Лебедь приземляется");

    }

    @Override
    public void startSwimming() {
        System.out.println("Начинает движение");

    }

    @Override
    public void stopSwimming() {
        System.out.println("Заканчивает движение");

    }

    public void gracefulSwim(){
        System.out.println("Лебедь изящно плывет");
    }
}
