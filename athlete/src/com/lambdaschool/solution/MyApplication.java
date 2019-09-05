package com.lambdaschool.soultion;

public class MyApplication implements Processor
{
   private MessageAthlete msgAthl;

   public MyApplication(MessageAthlete msgAthl)
   {
       this.msgAthl = msgAthl;
   }

    @Override
    public void displayAthlete(String sport)
    {
        System.out.println("************");
        athlete.display(sport);
        System.out.println("************\n");
    }
}
