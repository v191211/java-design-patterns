package com.journaldev.creational.abstractfactory;

/**
 * Created by V on 11/28/2018.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}