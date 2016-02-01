package com.training.handson;
import java.util.*;
public class MediaApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int ch=0;
//Books[] book= new Books[2];
Media[] book = new Books[2];
//Dvd[] dvd=new Dvd[2];
Media[] dvd= new Dvd[2];
//Periodical[] periodical=new Periodical[2];
Media[] periodical=new Periodical[2];
book[0] = new Books("C programming","Y kanetkar","Computer Science",1,5,14,142432);
book[1]=new Books("java programming","Y kanetkar","Computer Science",1,5,14,1456452);
dvd[0]=new Dvd("Motivational speech","Bill gates","Inspirational",4,5,10,60.00);
dvd[1]=new Dvd("Motivatiosdgfnal speech","Bfrqwill gates","Inweftrspirational",47,56,105,640.00);
periodical[0]=new  Periodical("digital magazine","india times","information technology",50,5,14,"Monthly");
periodical[0]=new  Periodical("digital magazsfsine","indiasgfsw times","infosdgrmation technology",50,5,14,"daily");
System.out.println("Select Media Type-");
System.out.println("1.Books");
System.out.println("2.Dvd");
System.out.println("3.Periodical");
System.out.println("Enter your choice -");
ch=sc.nextInt();
switch(ch){
	case 1:
		
		for(Media bk:book){
			bk.printMedia();
		}
		break;
case 2:
		
		for(Media dv:dvd){
			dv.printMedia();
		}
		break;
case 3:
	
	for(Media pe:periodical){
		pe.printMedia();
	}
	break;	
}

}
}
