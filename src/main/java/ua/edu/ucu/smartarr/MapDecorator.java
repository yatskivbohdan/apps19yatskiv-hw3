package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator{
    public MapDecorator(SmartArray smartArray, MyFunction func) {
        super(smartArray);
        array = Arrays.stream(smartArray.toArray()).map(func::apply).toArray();
    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription() + "+MapDecorator";
    }


}
