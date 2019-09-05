package com.lambdaschool.soultion;

public class MyApplication implements Processor
{
   private AthleteService msgSrv;

   public MyApplication(AthleteService msgSrv)
   {
       this.msgSrv = msgSrv;
   }

    @Override
    public void displayAthlete(String sport)
    {
        System.out.println("************");
        athlete.display(sport);
        System.out.println("************\n");
    }
}
