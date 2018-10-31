package com.aroniaina.springneo4j.dto;

/**
 *
 * @author a.safidy
 */
public class MovieDto {

	private String title;
	private int released;
	private String tagline;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReleased() {
		return released;
	}

	public void setReleased(int released) {
		this.released = released;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

}
