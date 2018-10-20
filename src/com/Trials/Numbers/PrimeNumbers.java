package com.Trials.Numbers;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n=23;

       // findPrime(n );
      int  number =50;
        seriesOfPrime(number);
    }

      static void findPrime(int n )
  {
      int count = 0;
      for (int i =1; i<=n;i++)
      {
          if (n%i==0)
          {
             count++;
          }
      }

      if (count==2)
      {
          //System.out.println("Prime "+n);
          System.out.println(n);


      }
      else
          {
              //System.out.println("Not Prime "+n);
          }
  }

  public static void seriesOfPrime(int number)
  {
     for (int i=0; i<=number;i++)
     {
         findPrime(i );
     }

  }
}
