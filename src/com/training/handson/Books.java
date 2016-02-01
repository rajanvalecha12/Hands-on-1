package com.training.handson;

public class Books extends Media {
private long ISBN;

	public Books(String title, String author, String subject, long volumeNumber, int rating, int lendingLength,long ISBN) {
		super(title, author, subject, volumeNumber, rating, lendingLength);
		this.ISBN=ISBN;
		// TODO Auto-generated constructor stub
	}
public void printMedia()
{
	System.out.println(this.getTitle()+this.getAuthor()+this.getSubject()+this.getVolumeNumber()+this.getRating()+this.getLendingLength()+this.getISBN());
}
public long getISBN() {
	return ISBN;
}
}
