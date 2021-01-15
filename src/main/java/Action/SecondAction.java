package Action;

public interface SecondAction {

    void SecondActionOne(String string);

    void SecondActionTwo(int numder);

    static void IsEmpty(String string){
        System.out.println("SecondAction. string is empty: " + string.isEmpty());
    }

    default int getLenght(String string) {
        return string.length() * 2;
    }
}
