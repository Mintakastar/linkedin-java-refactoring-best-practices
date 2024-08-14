package com.raffenio.module3.my.solution;

//The following code has a method that is never called and an unused variable.
// Identify the dead code and suggest improvements.
public class RemovingDeadCode {
    private String name;

    public RemovingDeadCode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
