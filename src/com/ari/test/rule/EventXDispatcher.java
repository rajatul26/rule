package com.ari.test.rule;

public class EventXDispatcher implements ActionDispatcher
{
    @Override
    public void fire()
    {
        // send patient to in_patient
        System.out.println("Fire event X.....>>>");
    }
}