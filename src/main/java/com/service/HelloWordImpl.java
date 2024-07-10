package com.service;

public class HelloWordImpl implements HelloWord{
    /**
     * @param name
     * @return
     */
    @Override
    public String printDetails(String name) {
        return "My name is " + name;
    }
}
