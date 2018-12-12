package com.journaldev.structural.proxy;

/**
 * Created by V on 12/12/2018.
 */
public class ProxyTest {
    public static void main(String[] args){
        CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

    }
}
