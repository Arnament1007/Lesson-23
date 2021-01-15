package Action;

public class ActionTwoImpl implements FirstAction, SecondAction {


    @Override
    public void FirstActionOne(String string) {
        System.out.println("FirstAction. String: " + string);
    }

    @Override
    public void FirstActionOTwo(int numder) {
        System.out.println("FirstAction. number: " + numder);
    }

    @Override
    public void SecondActionOne(String string) {
        System.out.println("SecondAction. String: " + string);
    }

    @Override
    public void SecondActionTwo(int numder) {
        System.out.println("SecondAction. number: " + numder);
    }

    @Override
    public int getLenght(String string) {
        return string.length() * 2;
    }
}
