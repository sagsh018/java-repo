package org.sharma.shop;

public class Door {
    private Lock lock = new Lock() {
        @Override
        public boolean isUnlocked(String key) {
            if(key.equals("qwerty")){
                return true;
            }
            else{
                return false;
            }
        }
    };
    public Lock getLock(){
        return lock;
    }
}
