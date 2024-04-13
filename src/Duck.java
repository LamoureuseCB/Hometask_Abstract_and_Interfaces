public class Duck implements IWaterfowl, IFlyable{

    @Override
    public void fly() {
        System.out.println("Лечу над камышами!");

    }

    @Override
    public void land() {
        System.out.println("Сижу в камышах");

    }

    @Override
    public void swim() {
        System.out.println("Плаваю в пруду!");

    }
}
