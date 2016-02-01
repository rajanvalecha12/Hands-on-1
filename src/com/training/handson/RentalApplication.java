package com.training.handson;
import java.util.*;
public class RentalApplication {
static int sno=100;


	public static void main(String[] args) {
		int days=0;
		int quant=0;
		int price=0;
		boolean flag=true;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	
	while(flag){
		System.out.println("what do you wanna take on rent?");
		System.out.println("1.Fan");
		System.out.println("2.Funiture");
		System.out.println("3.Air Conditioner");
		System.out.println("4.Vessel");
		System.out.println("5.exit");
		System.out.println("enter your choice - ");
		int ch = sc.nextInt();

	if(ch==1)
	{
		Fan[] fan={};
		price=250;
		System.out.println("for many days u wanna rent the item");
		days=sc.nextInt();
		System.out.println("how many of items do u require");
		quant=sc.nextInt();
		fan=new Fan[quant];
		for(int i=0;i<quant;i++)
		{
		 fan[i]= new Fan(sno,250,"fan",days,quant) ;
		fan[i].getProdInfo();
		sno++;
		if(i==(quant-1)){
			System.out.println("Toatal cost : " +price*quant*days);
		}
	}
	}
	else if (ch==2)
	{
		Furniture[] furniture={};
	
		System.out.println("for many days u wanna rent the item");
		days=sc.nextInt();
		System.out.println("how many of items do u require");
		quant=sc.nextInt();
		furniture=new Furniture[quant];
		for(int i=0;i<quant;i++)
		{
			furniture[i]= new Furniture(sno,250,"furniture",days,quant) ;
			furniture[i].getProdInfo();
			sno++;
		if(i==(quant-1)){
			System.out.println("Toatal cost : " +price*quant*days);
		}
		
	}
	}
		else if (ch==3)
		{
			AirConditioner[] ac={};
		
			System.out.println("for many days u wanna rent the item");
			days=sc.nextInt();
			System.out.println("how many of items do u require");
			quant=sc.nextInt();
			ac = new AirConditioner[quant];
			for(int i=0;i<quant;i++)
			{
		     ac[i]= new AirConditioner(sno,250,"Air Conditioner",days,quant) ;
				ac[i].getProdInfo();
				sno++;
			if(i==(quant-1)){
				System.out.println("Toatal cost : " +price*quant*days);
			}
			
		}
		}
		else if (ch==4)
		{
			Vessel[] vs={};
		
			System.out.println("for many days u wanna rent the item");
			days=sc.nextInt();
			System.out.println("how many of items do u require");
			quant=sc.nextInt();
			vs = new Vessel[quant];
			for(int i=0;i<quant;i++)
			{
				vs[i]= new Vessel(sno,250,"Vessel",days,quant) ;
				vs[i].getProdInfo();
				sno++;
			if(i==(quant-1)){
				System.out.println("Toatal cost : " +price*quant*days);
			}
			
		}
		}
		else if(ch==5){
			flag=false;
		}
	}

	
}
}
