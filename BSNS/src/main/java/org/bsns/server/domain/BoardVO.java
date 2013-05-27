package org.bsns.server.domain;

import java.util.Date;

public class BoardVO {

	private Integer number;
	
	//타입이 추가 될떄 마다 적어 놀 것 
	// EX) 1 -> 소모임, 2 -> 개인SNS, 3 -> 호출 
	private Integer type;
	
	private String email;
	
	private String content;
	
	private Date date;

	private JobTimeVO jobTime;
	
	private BoardFileVO boardFile;
	
	private ScheduleVO schedule;
	
	private ApprovalVO approval;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public JobTimeVO getJobTime() {
		return jobTime;
	}

	public void setJobTime(JobTimeVO jobTime) {
		this.jobTime = jobTime;
	}

	public BoardFileVO getBoardFile() {
		return boardFile;
	}

	public void setBoardFile(BoardFileVO boardFile) {
		this.boardFile = boardFile;
	}

	public ScheduleVO getSchedule() {
		return schedule;
	}

	public void setSchedule(ScheduleVO schedule) {
		this.schedule = schedule;
	}

	public ApprovalVO getApproval() {
		return approval;
	}

	public void setApproval(ApprovalVO approval) {
		this.approval = approval;
	}

	@Override
	public String toString() {
		return "BoardVO [number=" + number + ", type=" + type + ", email="
				+ email + ", content=" + content + ", date=" + date
				+ ", jobTime=" + jobTime + ", boardFile=" + boardFile
				+ ", schedule=" + schedule + ", approval=" + approval + "]";
	}
}
