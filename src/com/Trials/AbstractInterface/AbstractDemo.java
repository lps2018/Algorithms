package com.Trials.AbstractInterface;

public class AbstractDemo
{
    public static void main(String[] args)
    {
        bank chase_bank = new chase();
        chase_bank.calculateInterest();
        chase_bank.deposit();
        bank bofa_bank = new bofa();
        bofa_bank.calculateInterest();
        bofa_bank.deposit();
        }

    }


abstract  class bank
{
    private int i =0;
  public void deposit()
  {
      System.out.println("deposit");
  }
  public void interest()
  {
      System.out.println("interest");
  }

  public abstract  void calculateInterest();
}

class chase extends bank
{

    @Override
    public void calculateInterest()
    {
        System.out.println("chase "+10);
    }
}

class bofa extends bank
{

    @Override
    public void calculateInterest()
    {
        System.out.println("bofa "+"twenty");
    }
}