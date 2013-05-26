package org.bsns.server.domain;

public class JobTimeVO {
	private Integer jobTimeKey;
	private Integer boardNum;
	private Integer jobTimeType;
	private String jobTimeDate;
	
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
	public Integer getJobTimeType() {
		return jobTimeType;
	}
	public void setJobTimeType(Integer jobTimeType) {
		this.jobTimeType = jobTimeType;
	}
	public String getJobTimeDate() {
		return jobTimeDate;
	}
	public void setJobTimeDate(String jobTimeDate) {
		this.jobTimeDate = jobTimeDate;
	}
	@Override
	public String toString() {
		return "JobTimeVO [jobTimeKey=" + jobTimeKey + ", boardNum=" + boardNum
				+ ", jobTimeType=" + jobTimeType + ", jobTimeDate="
				+ jobTimeDate + "]";
	}
	
	
	
	

}
