package com.training.handson;

public class Media {
private String title;
private String author;
private String subject;
private long volumeNumber;
private int rating;
private int lendingLength;
public Media(String title, String author, String subject, long volumeNumber, int rating, int lendingLength) {
	super();
	this.title = title;
	this.author = author;
	this.subject = subject;
	this.volumeNumber = volumeNumber;
	this.rating = rating;
	this.lendingLength = lendingLength;
}
public void printMedia(){
	
}

	

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public long getVolumeNumber() {
	return volumeNumber;
}
public void setVolumeNumber(long volumeNumber) {
	this.volumeNumber = volumeNumber;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public int getLendingLength() {
	return lendingLength;
}
public void setLendingLength(int lendingLength) {
	this.lendingLength = lendingLength;
}
}
