package com.jouurnaldev.factory;

/**
 * Created by V on 11/28/2018.
 */
public class ComputerFactory {
    /*private ComputerFactory(){}
    private static class ComputerFactoryHelper{
        private static final ComputerFactory INSTANCE = new ComputerFactory();
    }
    public static ComputerFactory getInstance(){
        return ComputerFactoryHelper.INSTANCE;
    }
    public Computer getComputer(String type, String ram, String hdd, String cpu){
        Computer computer = null;
        switch (type){
            case "pc":
                computer = new PC(ram,hdd,cpu);
                break;
            case "server":
                computer = new Server(ram,hdd,cpu);
                break;
            default:
                break;
        }
        return computer;
    }*/

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
        return null;
    }

}
