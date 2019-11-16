package ua.edu.ucu.smartarr;


// Base array for decorators
public class BaseArray implements SmartArray{
    private Object[] array;


    public BaseArray(Object[] givenArray) {
        array = givenArray.clone();
    }

    @Override
    public Object[] toArray(){
        return array.clone();
    }

    @Override
    public String operationDescription(){
        return "BaseArray";
    }

    @Override
    public int size(){
        return array.length;
    }
}
