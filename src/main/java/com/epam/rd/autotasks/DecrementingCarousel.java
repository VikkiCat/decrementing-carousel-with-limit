package com.epam.rd.autotasks;

public class DecrementingCarousel {
    protected boolean isRunCalled;

    int capacity;
    static int [] array;
    int counter = 0;

    public DecrementingCarousel(int capacity) {

        this.capacity = capacity;
        array = new int[capacity];

    }
    public boolean addElement(int element){
        if((element>0)&&(counter<capacity)&& !isRunCalled)
        {
            array[counter] = element;
            counter++;
            return true;
        }
        return false;
    }

    public CarouselRun run(){

        if (isRunCalled){
            return  null;
        }
        isRunCalled = true;
        return new CarouselRun();
    }
}
