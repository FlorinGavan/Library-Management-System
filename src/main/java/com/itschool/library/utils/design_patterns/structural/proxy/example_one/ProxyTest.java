package com.itschool.library.utils.design_patterns.structural.proxy.example_one;

public class ProxyTest {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Robin", "nonPaws");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand("rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}