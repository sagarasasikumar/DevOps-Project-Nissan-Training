package com.mydevop.app;
import java.util.Scanner;
import java.text.NumberFormat;

public class App
{
  public final static String[] units = { "", "One", "Two", "Three", "Four","Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve","Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen", "Nineteen" };
  public final static String[] tens = {	"", "","Twenty", "Thirty","Forty", "Fifty","Sixty", "Seventy","Eighty","Ninety" };
  public static String toWords( int n ) 
  {
	  		if (n < 0) {return "Error";}
			if (n < 20) {return units[n];}
			if (n < 100) {return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];}
			if (n < 1000) {return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + toWords(n % 100);}
			if (n < 100000) {return toWords(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + toWords(n % 1000);}
			if (n < 10000000) {	return toWords(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + toWords(n % 100000);}
			return toWords(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + toWords(n % 10000000);
}
public static void main( String[] args )
    {
    int n;
	Scanner s=new Scanner(System.in);
    System.out.println("Enter a number to convert into word format");
	n =s.nextInt();
	System.out.println(toWords(n) + "");

    }
}
