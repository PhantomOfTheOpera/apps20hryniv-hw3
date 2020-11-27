package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {
    protected SmartArray smartArray;
    protected Object[] decoratedArray;


    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }

    @Override
    public Object[] toArray() {
        return decoratedArray.clone();
    }

    @Override
    public int size() {
        return decoratedArray.length;
    }


}