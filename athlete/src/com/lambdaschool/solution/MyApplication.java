package com.lambdaschool.soultion;

public class MyApplication implements Processor
{
   private MessageService msgSrv;

   public MyApplication( MessageService msgSrv)
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
