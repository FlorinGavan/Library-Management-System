package com.itschool.library.utils.design_patterns.structural.proxy.example_one;

public class CommandExecutorProxy implements CommandExecutor {

    private  boolean isAdmin;
    private  CommandExecutor executor;

    public  CommandExecutorProxy(String user, String pwd){
        if ("Robin".equals(user) && "r@reqed".equals(pwd)) isAdmin = true;
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String  cmd) throws Exception{
        if (isAdmin){
            executor.runCommand(cmd);
        }else {
            if (cmd.trim().startsWith("rm")){
                throw new Exception("rn command is not allowed for non-admin users");
            }else {
                executor.runCommand(cmd);
            }
        }
    }
}