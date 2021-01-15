package Action;

public class ActionOneImpl implements ThirdAction, FourthAction {


    @Override
    public void FourthActionOne(String string) {
        System.out.println("FourthAction. String: " + string);
    }

    @Override
    public void FourthActionTwo(int numder) {
        System.out.println("FourthAction. number: " + numder);
    }

    @Override
    public void ThirdActionOne(String string) {
        System.out.println("ThirdAction. String: " + string);
    }

    @Override
    public void ThirdActionTwo(int numder) {
        System.out.println("ThirdAction. number: " + numder);
    }

    @Override
    public int getLenght(String string) {
        return string.length();
    }
}
