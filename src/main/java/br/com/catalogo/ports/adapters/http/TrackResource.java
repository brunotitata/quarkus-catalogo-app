package br.com.catalogo.ports.adapters.http;

public class TrackResource {

	private String title;

	public TrackResource(String title) {
		this.title = title;
	}

	public TrackResource() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "TrackResource [title=" + title + "]";
	}

}
