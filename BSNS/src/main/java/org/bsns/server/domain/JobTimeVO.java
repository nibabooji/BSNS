package org.bsns.server.domain;

public class JobTimeVO {
	private Integer jobTimeKey;
	private Integer boardNum;
	private Integer jobtimeType;
	private String jobtimeDate;
	
	public Integer getJobTimeKey() {
		return jobTimeKey;
	}
	public void setJobTimeKey(Integer jobTimeKey) {
		this.jobTimeKey = jobTimeKey;
	}
	public Integer getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(Integer boardNum) {
		this.boardNum = boardNum;
	}
	public Integer getJobtimeType() {
		return jobtimeType;
	}
	public void setJobtimeType(Integer jobtimeType) {
		this.jobtimeType = jobtimeType;
	}
	public String getJobtimeDate() {
		return jobtimeDate;
	}
	public void setJobtimeDate(String jobtimeDate) {
		this.jobtimeDate = jobtimeDate;
	}
	@Override
	public String toString() {
		return "JobTimeVO [jobTimeKey=" + jobTimeKey + ", boardNum=" + boardNum
				+ ", jobtimeType=" + jobtimeType + ", jobtimeDate="
				+ jobtimeDate + "]";
	}
	
	
	
	

}
