package com.training.handson;

public class Periodical extends Media {
	private String period;

	public Periodical(String title, String author, String subject, long volumeNumber, int rating, int lendingLength,
			String period) {
		super(title, author, subject, volumeNumber, rating, lendingLength);
		this.period = period;
	}
	public void printMedia()
	{
		System.out.println(this.getTitle()+" "+this.getAuthor()+" "+this.getSubject()+" "+this.getVolumeNumber()+" "+this.getRating()+" "+this.getLendingLength()+" "+this.getPeriod());
	}
	public String getPeriod() {
		return period;
	}
	
}
