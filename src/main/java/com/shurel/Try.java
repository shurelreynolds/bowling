package com.shurel;

public class Try {
    private int pins = 10;
    //-1 if try not consumed
    private int knockedDownPins=-1;

    public int getKnockedDownPins() {
        return knockedDownPins;
    }

    public boolean isUsed(){
        return knockedDownPins!=-1;
    }


}
