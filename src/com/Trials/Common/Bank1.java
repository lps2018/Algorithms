package com.Trials.Common;

public interface Bank1 {


    public void deposit();
    public void withdraw ();
    public abstract void interest();
}


class Chase1 implements Bank1
{

    @Override
    public void deposit() {
        System.out.println("deposit1");
    }

    @Override
    public void withdraw() {
        System.out.println("withdraw1");
    }

    @Override
    public void interest()
    {
        System.out.println("interest1");
    }
}

class Test1{
    public static void main(String[] args) {
        Chase1 chase1 =new Chase1();
        chase1.deposit();
        chase1.interest();
        chase1.withdraw();
    }

}



