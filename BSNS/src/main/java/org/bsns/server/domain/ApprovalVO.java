package org.bsns.server.domain;

public class ApprovalVO {
	private Integer approvalKey;
	private Integer boardNum;
	
//	public ApprovalVO() {
//		// TODO Auto-generated constructor stub
//	}
//	public ApprovalVO(Integer approvalKey, Integer boardNum) {
//		super();
//		this.approvalKey = approvalKey;
//		this.boardNum = boardNum;
//	}
	public Integer getApprovalKey() {
		return approvalKey;
	}
	public void setApprovalKey(Integer approvalKey) {
		this.approvalKey = approvalKey;
	}
	public Integer getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(Integer boardNum) {
		this.boardNum = boardNum;
	}
	@Override
	public String toString() {
		return "ApprovalVO [approvalKey=" + approvalKey + ", boardNum="
				+ boardNum + "]";
	}
	
	
}
