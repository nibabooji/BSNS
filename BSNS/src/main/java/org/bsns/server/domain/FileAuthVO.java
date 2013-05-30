package org.bsns.server.domain;

public class FileAuthVO {
	
	private Integer fileAuthKey;
	private Integer boardFileNo;
	private String email;
	
	
	public FileAuthVO() {
		// TODO Auto-generated constructor stub
	}
	public FileAuthVO(Integer fileAuthKey, Integer boardFileNo, String email) {
		super();
		this.fileAuthKey = fileAuthKey;
		this.boardFileNo = boardFileNo;
		this.email = email;
	}
	public Integer getFileAuthKey() {
		return fileAuthKey;
	}
	public void setFileAuthKey(Integer fileAuthKey) {
		this.fileAuthKey = fileAuthKey;
	}
	public Integer getBoardFileNo() {
		return boardFileNo;
	}
	public void setBoardFileNo(Integer boardFileNo) {
		this.boardFileNo = boardFileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "FileAuthVO [fileAuthKey=" + fileAuthKey + ", boardFileNo="
				+ boardFileNo + ", email=" + email + "]";
	}
	
	
}
