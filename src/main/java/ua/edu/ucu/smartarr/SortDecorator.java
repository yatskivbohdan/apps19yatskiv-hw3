package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{
    private static MyComparator function;
    public SortDecorator(SmartArray smartArray, MyComparator func) {
        super(smartArray);
        function = func;
        array = toArray();
    }

    @Override
    public Object[] toArray() {
        return Arrays.stream(smartArray.toArray()).sorted(function).toArray();
    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription() + "+SortDecorator";
    }
    
}
