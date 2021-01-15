import Action.*;
import Functional.PredicateInterface;

public class Main {

    public static void main(String[] args) {

        FirstAction.Distance(100);
        SecondAction.IsEmpty("Laura");
        ThirdAction.ToLowerCase("MAMA");
        FourthAction.ToUpperCase("papa");

        ActionOneImpl actionOne = new ActionOneImpl();
        actionOne.FourthActionOne("Four");
        actionOne.FourthActionTwo(4);
        actionOne.ThirdActionOne("Three");
        actionOne.ThirdActionTwo(3);
        System.out.println(actionOne.getLenght("Denis"));

        ActionTwoImpl actionTwo = new ActionTwoImpl();
        actionTwo.FirstActionOne("One");
        actionTwo.FirstActionOTwo(1);
        actionTwo.SecondActionOne("Two");
        actionTwo.SecondActionTwo(2);
        actionTwo.getLenght("Denis");
        System.out.println(actionTwo.getLenght("Denis"));

        Helper helper = new Helper();
        System.out.println(helper.Check("denis", "denis"));

        PredicateInterface<Double> predicateInterface = (val) -> val > 1500.0;
        boolean resultPredicateDouble = predicateInterface.check(1200.0);
        System.out.println("resultPredicateDouble: " + resultPredicateDouble);


    }
}
