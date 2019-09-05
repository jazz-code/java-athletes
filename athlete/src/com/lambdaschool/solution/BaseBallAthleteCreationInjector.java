package com.lambdaschool.solution;

public class BaseBallAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new BaseBallAthleteImpl());
    }
}