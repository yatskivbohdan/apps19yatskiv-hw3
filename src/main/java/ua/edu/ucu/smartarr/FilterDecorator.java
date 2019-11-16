package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    public FilterDecorator(SmartArray smartArray, MyPredicate myPr) {
        super(smartArray);
        array = Arrays.stream(smartArray.toArray()).filter(myPr::test).toArray();

    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription() + "+FilterDecorator";
    }
   
}
