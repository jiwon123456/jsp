package com.java.www.dto;

import java.sql.Timestamp;

public class BoardDto {
	
	public BoardDto() {}
	
	public BoardDto(String btitle, String bcontent, String id, String bfile) {
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.id = id;
		this.bfile = bfile;
	}

	public BoardDto(int bno, String btitle, String bcontent, String id, String bfile) {
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.id = id;
		this.bfile = bfile;
	}

	public BoardDto(int bno, String btitle, String bcontent, Timestamp bdate, String id, int bgrouop, int bstep,
			int bindent, int bhit, String bfile) {
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.id = id;
		this.bgrouop = bgrouop;
		this.bstep = bstep;
		this.bindent = bindent;
		this.bhit = bhit;
		this.bfile = bfile;
	}


	private int bno;
	private String btitle;
	private String bcontent;
	private Timestamp bdate;
	private String id;
	private int bgrouop;
	private int bstep;
	private int bindent;
	private int bhit;
	private String bfile;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public Timestamp getBdate() {
		return bdate;
	}
	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBgrouop() {
		return bgrouop;
	}
	public void setBgrouop(int bgrouop) {
		this.bgrouop = bgrouop;
	}
	public int getBstep() {
		return bstep;
	}
	public void setBstep(int bstep) {
		this.bstep = bstep;
	}
	public int getBindent() {
		return bindent;
	}
	public void setBindent(int bindent) {
		this.bindent = bindent;
	}
	public int getBhit() {
		return bhit;
	}
	public void setBhit(int bhit) {
		this.bhit = bhit;
	}
	public String getBfile() {
		return bfile;
	}
	public void setBfile(String bfile) {
		this.bfile = bfile;
	}
	
}
