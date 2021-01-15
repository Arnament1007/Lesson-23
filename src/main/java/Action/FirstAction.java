package Action;

public interface FirstAction {

    void FirstActionOne(String string);

    void FirstActionOTwo(int numder);

    static void Distance(int distance) {
        System.out.println("FirstAction. distance: " + distance);
    }

    default int getLenght(String string) {
        return string.length();
    }
}
