package mysql.ex07_bbs.entity;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.time.LocalDateTime;

import javax.swing.border.Border;

public class Board implements Border {
	private int bid;
	private String title;
	private String content;
	private String uid;
	private LocalDateTime moTime;
	private int viewCount;
	private int replyCount;
	
	public Board() {}
	public Board(int bid, String title, String content, String uid, LocalDateTime moTime, int viewCount,
			int replyCount) {
		super();
		this.bid = bid;
		this.title = title;
		this.content = content;
		this.uid = uid;
		this.moTime = moTime;
		this.viewCount = viewCount;
		this.replyCount = replyCount;
	}
	
	public Board(String title, String content, String uid) {
		super();
		this.title = title;
		this.content = content;
		this.uid = uid;
	}
	
	@Override
	public String toString() {
		return "Board [bid=" + bid + ", title=" + title + ", content=" + content + ", uid=" + uid + ", moTime=" + moTime.toString().substring(2,16).replaceAll("T", " ")
				+ ", viewCount=" + viewCount + ", replyCount=" + replyCount + "]";
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public LocalDateTime getMoTime() {
		return moTime;
	}
	public void setMoTime(LocalDateTime moTime) {
		this.moTime = moTime;
	}
	public int getviewCount() {
		return viewCount;
	}
	public void setviewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Insets getBorderInsets(Component c) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isBorderOpaque() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
