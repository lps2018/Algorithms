package com.SnapIot.AbstractInterface;

public class InterfaceDemo implements BankInterface
{
    public static void main(String[] args)
    {
        //

        BankInterface chase_bankInterface = new Chase();
        chase_bankInterface.calculateInterest();
        //
        BankInterface bofa_bankInterface = new Bofa();
        bofa_bankInterface.calculateInterest();
        //
        Chase chase = new Chase();
        chase.calculateInterest();
    }

    @Override
    public void deposit() {

    }

    @Override
    public void interest() {

    }

    @Override
    public void calculateInterest()
    {

    }
}

     class Chase implements BankInterface
    {

        @Override
        public void deposit() {
            System.out.println("chase deposit"+10);
        }

        @Override
        public void interest() {
            System.out.println("chase  interest"+10);
        }

        @Override
        public void calculateInterest()
        {
            System.out.println("chase calculatedInterest"+10);
        }
    }

     class Bofa implements BankInterface
    {

        @Override
        public void deposit() {
            System.out.println("bofa deposit"+20);
        }

        @Override
        public void interest() {
            System.out.println("bofa  interest"+20);
        }

        @Override
        public void calculateInterest()
        {
            System.out.println("bofa "+"twenty");
        }
    }

