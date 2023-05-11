package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    protected static int actionLimit;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {

        super(capacity);
        this.actionLimit=actionLimit;
    }

    public static int getActionLimit() {
        return actionLimit;
    }

    public CarouselRun run(){

        if (isRunCalled){
            return  null;
        }

        isRunCalled = true;
        return new LimitedCarouselRun();
    }
}
