package org.sharma.car;

public class Car {
    private Engine engine;

    public Car(){
        engine = new Engine(false);
    }

    public void carStatus(){
        if(engine.isIgnition()){
            System.out.println("Car is on");
        }
        else{
            System.out.println("Car is off");
        }
    }

    public Engine getEngine(){
        return engine;
    }

    public class Engine{
        private boolean ignition;

        public Engine(boolean ignition){
            this.ignition = ignition;
        }

        public boolean isIgnition(){
            return ignition;
        }

        public void setIgnition(boolean ignition){
            this.ignition = ignition;
        }
    }
}
