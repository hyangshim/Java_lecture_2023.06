package ch06_class;

public class Melon {
	// 속성, attribute,주로 접근제한을 private로 설정함
	//외부에서 
	private int rank;
	private String title;
	private String artist;
	private String album;
	private String imgUrl;
	
	// 클래스를 인스턴트 할때 생성자를 만들어줘야함
	public Melon() { }
	public Melon(int rank, String title, String artist, String album, String imgUrl) {
		super();
		this.rank = rank;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.imgUrl = imgUrl;
	}


	// getter,setter
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	// 출력 
	@Override
	public String toString() {
		return "Melon [rank=" + rank + ", title=" + title + ", artist=" + artist + ", album=" + album + ", imgUrl="
				+ imgUrl + "]";
	}
	
	
	
	
	
}
