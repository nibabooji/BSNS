package org.bsns.server.domain;

public class ScheduleVO {
	private Integer scheduleKey;
	private Integer boardNum;
	private String scheduleDate;
	
	public ScheduleVO() {
		// TODO Auto-generated constructor stub
	}
	public ScheduleVO(Integer scheduleKey, Integer boardNum, String scheduleDate) {
		super();
		this.scheduleKey = scheduleKey;
		this.boardNum = boardNum;
		this.scheduleDate = scheduleDate;
	}
	public Integer getScheduleKey() {
		return scheduleKey;
	}
	public void setScheduleKey(Integer scheduleKey) {
		this.scheduleKey = scheduleKey;
	}
	public Integer getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(Integer boardNum) {
		this.boardNum = boardNum;
	}
	public String getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	@Override
	public String toString() {
		return "ScheduleVO [scheduleKey=" + scheduleKey + ", boardNum="
				+ boardNum + ", scheduleDate=" + scheduleDate + "]";
	}
	
	
}
