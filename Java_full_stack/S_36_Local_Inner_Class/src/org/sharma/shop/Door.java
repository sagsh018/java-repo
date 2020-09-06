package org.sharma.shop;

public class Door {
    public boolean isOpened(String key){

        class Lock{
            public boolean isLocked(String key){
                if(key.equals("qwerty")){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        Lock lock = new Lock();
        return lock.isLocked(key);
    }
}
