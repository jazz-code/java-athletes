package com.lambdaschool.solution;

public class TrackAthleteCreationInjector implements AthleteService
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new TrackAthleteImpl());
    }
}
