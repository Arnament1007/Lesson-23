package Action;

public interface FourthAction {

    void FourthActionOne(String string);

    void FourthActionTwo(int numder);

    static void ToUpperCase(String string){
        System.out.println("ThirdAction. to Upper Case: " + string.toUpperCase());
    }

    default int getLenght(String string) {
        return string.length() * 4;
    }
}
