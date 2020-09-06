package org.sharma.car;

public class Car {
    public boolean isStarted(String key){
        class Engine{
            public boolean isStarted(String key){
                if (key.equals("qwerty")){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return new Engine().isStarted(key);
    }
}
