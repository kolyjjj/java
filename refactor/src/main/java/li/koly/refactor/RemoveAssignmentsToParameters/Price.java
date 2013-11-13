package li.koly.refactor.RemoveAssignmentsToParameters;

public class Price {

    // There is difference between assignment and changing the inner status of an object
    int discount (final int inputVal, final int quantity, final int yearToDate){
        int result = inputVal;
        if (inputVal > 50) result -= 2;
        if (quantity > 100) result -= 1;
        if (yearToDate > 10000) result -= 4;
        return result;
    }
}
