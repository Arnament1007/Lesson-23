package Action;

public interface ThirdAction {

    void ThirdActionOne(String string);

    void ThirdActionTwo(int numder);

    static void ToLowerCase(String string){
        System.out.println("ThirdAction. to Lower Case: " + string.toLowerCase());
    }

    default int getLenght(String string) {
        return string.length() * 3;
    }
}
