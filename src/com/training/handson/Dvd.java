package com.training.handson;

public class Dvd extends Media{
	private double runningTime;

	public Dvd(String title, String author, String subject, long volumeNumber, int rating, int lendingLength,
			double runningTime) {
		super(title, author, subject, volumeNumber, rating, lendingLength);
		this.runningTime = runningTime;
	}
public void printMedia()
{
	System.out.println(this.getTitle()+" "+this.getAuthor()+" "+this.getSubject()+" "+this.getVolumeNumber()+" "+this.getRating()+" "+this.getLendingLength()+" "+this.getRunningTime());
}
public double getRunningTime() {
	return runningTime;
}
}
