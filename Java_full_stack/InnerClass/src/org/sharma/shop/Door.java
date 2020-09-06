package org.sharma.shop;

import java.util.concurrent.locks.Lock;

public class Door {
    private Lock lock;

    public Door(){
        lock = new Lock(true);
    }

    public void shopStatus(){
        if(lock.getLock()){
            System.out.println("The shop is closed");
        }
        else{
            System.out.println("Welcome, Shop is open");
        }
    }

    public Lock getDoorLock(){
        return lock;
    }

    public class Lock{
        private boolean lock;

        public Lock(boolean lock){
            this.lock = lock;
        }

        public boolean getLock(){
            return lock;
        }

        public void setLock(boolean lock){
            this.lock = lock;
        }
    }
}
