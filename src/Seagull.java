public class Seagull implements IFlyable, IWaterfowl, IHunter {
    @Override
    public void fly() {
        System.out.println("Парю над морем!");

    }

    @Override
    public void land() {
        System.out.println("Приземляюсь на берег");

    }

    @Override
    public void hunt() {
        System.out.println("Ловлю рыбку!");

    }


    @Override
    public void swim() {
        System.out.println("Качаюсь на волнах!");

    }
}
