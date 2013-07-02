package org.bsns.server.domain;

public class ApprovalCheckVO {
	private Integer approvalCheck; // 승인타입 1~3 (ex- 1: 대기, 2:보류, 3:결제)
	private Integer approvalKey; 
	private String email; // 결제 권한자
	
	
	public Integer getApprovalCheck() {
		return approvalCheck;
	}
	public void setApprovalCheck(Integer approvalCheckKey) {
		this.approvalCheck = approvalCheckKey;
	}
	public Integer getApprovalKey() {
		return approvalKey;
	}
	public void setApprovalKey(Integer approvalKey) {
		this.approvalKey = approvalKey;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "ApprovalCheckVO [approvalCheckKey=" + approvalCheck
				+ ", approvalKey=" + approvalKey + ", email=" + email + "]";
	}
	
	
	
}
