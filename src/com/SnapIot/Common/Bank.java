package com.SnapIot.Common;

abstract class Bank {

    public void deposit()
    {
        System.out.println("deposit ");
    }
    public void withdraw ()
    {
        System.out.println("withdraw ");
    }
    public void RD ()
    {
        System.out.println("Bank");
    }

   // public abstract void interest();
}
class Chase extends Bank
{
//    @Override
//    public void interest() {
//        System.out.println("chase 10%");
//    }

   // @Override
    public void RD ()
    {
        //System.out.println("Chase");
    }
}

class Citi extends Bank
{
//    @Override
//    public void interest() {
//        System.out.println("citi 5%");
//    }
}

class Test
{
    public static void main(String[] args) {
        Bank chaseBank = new Chase();
        chaseBank.deposit();
        chaseBank.withdraw();
        chaseBank.RD();
       // chaseBank.interest();
        Bank citiBank = new Citi();
        //citiBank.deposit();
        //citiBank.withdraw();
        //citiBank.interest();
    }

}