package org.bsns.server.domain;

import java.util.Date;
import java.util.List;

public class BoardVO {

	private Integer number;
	
	//타입이 추가 될떄 마다 적어 놀 것 
	// EX) 1 -> 소모임, 2 -> 개인SNS, 3 -> 호출 
	private Integer type;
	
	private String email;
	
	private String content;
	
	private Date date;

	private List<JobTimeVO> jobTime;
	
	private List<BoardFileVO> boardFile;
	
	private List<ScheduleVO> schedule;
	
	private List<ApprovalVO> approval;

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

	public List<JobTimeVO> getJobTime() {
		return jobTime;
	}

	public void setJobTime(List<JobTimeVO> jobTime) {
		this.jobTime = jobTime;
	}

	public List<BoardFileVO> getBoardFile() {
		return boardFile;
	}

	public void setBoardFile(List<BoardFileVO> boardFile) {
		this.boardFile = boardFile;
	}

	public List<ScheduleVO> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<ScheduleVO> schedule) {
		this.schedule = schedule;
	}

	public List<ApprovalVO> getApproval() {
		return approval;
	}

	public void setApproval(List<ApprovalVO> approval) {
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
