package com.shurel;

import java.util.Arrays;
import java.util.List;

public class Turn {
    private Try[] tries = new Try[]{new Try(), new Try()};

    public List<Try> getTries() {
        return Arrays.asList(tries);
    }


}
