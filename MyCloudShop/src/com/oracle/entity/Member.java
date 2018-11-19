package com.oracle.entity;

public class Member {
    private Integer memberid;

    private String nickname;

    private String memberpwd;

    private String membername;

    private String membergender;

    private Double membertel;

    private String memberemail;

	public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getMemberpwd() {
        return memberpwd;
    }

    public void setMemberpwd(String memberpwd) {
        this.memberpwd = memberpwd == null ? null : memberpwd.trim();
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    public String getMembergender() {
        return membergender;
    }

    public void setMembergender(String membergender) {
        this.membergender = membergender == null ? null : membergender.trim();
    }

    public Double getMembertel() {
        return membertel;
    }

    public void setMembertel(Double membertel) {
        this.membertel = membertel;
    }

    public String getMemberemail() {
        return memberemail;
    }

    public void setMemberemail(String memberemail) {
        this.memberemail = memberemail == null ? null : memberemail.trim();
    }

	public Member(String nickname, String memberpwd,
			String membername, String membergender, Double membertel,
			String memberemail) {
		this.nickname = nickname;
		this.memberpwd = memberpwd;
		this.membername = membername;
		this.membergender = membergender;
		this.membertel = membertel;
		this.memberemail = memberemail;
	}

}