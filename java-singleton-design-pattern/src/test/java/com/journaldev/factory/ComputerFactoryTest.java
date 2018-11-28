package com.journaldev.factory;

import com.jouurnaldev.factory.Computer;
import com.jouurnaldev.factory.ComputerFactory;

/**
 * Created by V on 11/28/2018.
 */
public class ComputerFactoryTest {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }
}
