package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    private static MyPredicate predicate;
    public FilterDecorator(SmartArray smartArray, MyPredicate myPr) {
        super(smartArray);
        predicate = myPr;
        array = toArray();

    }

    @Override
    public Object[] toArray() {
        return Arrays.stream(smartArray.toArray()).filter(predicate::test).toArray();
    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription() + "+FilterDecorator";
    }
   
}
