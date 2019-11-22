package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator{
    private static MyFunction function;
    public MapDecorator(SmartArray smartArray, MyFunction func) {
        super(smartArray);
        function = func;
        array = toArray();
    }

    @Override
    public java.lang.Object[] toArray() {
        return Arrays.stream(smartArray.toArray()).map(function::apply).toArray();
    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription() + "+MapDecorator";
    }


}
