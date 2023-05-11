package com.epam.rd.autotasks;

import static com.epam.rd.autotasks.DecrementingCarousel.array;

public class LimitedCarouselRun extends CarouselRun{
    int callCounter = DecrementingCarouselWithLimitedRun.getActionLimit();
    @Override
    public int next() {

        if (isFinished()) {
            return -1;
        } else {
            while (array[position %= array.length] <= 0) {
                position++;
            }
        }
        callCounter--;
        return array[position++]--;
    }

    @Override
    public boolean isFinished() {

        if (callCounter==0){
            return true;
        }else {
            for (int var : array) {
                if (var > 0) return false;
            }
        }
        return true;
    }
}
