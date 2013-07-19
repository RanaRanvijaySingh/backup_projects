package com.webonise.assignment.threads;
public class Chopstick {

    private boolean _isUsed;

    /*
    * @return the current state of the chopstick
    */
    public boolean isUsed(){
        return _isUsed; 
    }

    /*
    * @param usedFlag the new state of the chopstick
    */
    public void setUsed(boolean usedFlag){
        _isUsed = usedFlag;
    }
}