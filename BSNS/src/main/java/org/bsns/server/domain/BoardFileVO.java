package org.bsns.server.domain;

public class BoardFileVO {
	private Integer boardFileNo;
	private Integer fileNo;
	private Integer boardNum;
	
	public BoardFileVO(){}
	public BoardFileVO(Integer boardFileNo, Integer fileNo, Integer boardNum) {
		super();
		this.boardFileNo = boardFileNo;
		this.fileNo = fileNo;
		this.boardNum = boardNum;
	}
	public Integer getBoardFileNo() {
		return boardFileNo;
	}
	public void setBoardFileNo(Integer boardFileNo) {
		this.boardFileNo = boardFileNo;
	}
	public Integer getFileNo() {
		return fileNo;
	}
	public void setFileNo(Integer fileNo) {
		this.fileNo = fileNo;
	}
	public Integer getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(Integer boardNum) {
		this.boardNum = boardNum;
	}
	@Override
	public String toString() {
		return "BoardFileVO [boardFileNo=" + boardFileNo + ", fileNo=" + fileNo
				+ ", boardNum=" + boardNum + "]";
	}
	
	
}
