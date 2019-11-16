package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{
    public SortDecorator(SmartArray smartArray, MyComparator func) {
        super(smartArray);
        array = Arrays.stream(smartArray.toArray()).sorted(func).toArray();
    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription() + "+SortDecorator";
    }
    
}
