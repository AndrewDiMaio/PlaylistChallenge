package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int countUp = 0;
        int countDown = 0;
        int count = 0;

        for (int i = startIndex; i<playList.length; i++){
            countUp++;
        }

        for (int j = startIndex; j>-1; j--){
            countDown++;
        }

        if (countUp > countDown){
            count = countDown;
        }else{
            count = countUp;
        }


        return count;

    }
}



