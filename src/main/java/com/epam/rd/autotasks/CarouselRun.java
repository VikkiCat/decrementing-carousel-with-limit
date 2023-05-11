package com.epam.rd.autotasks;

import static com.epam.rd.autotasks.DecrementingCarousel.array;

public class CarouselRun {
    protected int position;

    public int next() {

            int count = 0;
            while (count < array.length && array[position %= array.length] <= 0) {
                position++;
                count++;
            }

            if (count == array.length) return -1;
        return array[position++]--;
    }

    public boolean isFinished() {

            for (int var : array) {
                if (var > 0) return false;
            }
        return true;
    }


}
