package org.bsns.server.domain;

import java.util.List;

public class BoardFileVO {
	private Integer boardFileNo;
	private Integer fileNo;
	private Integer boardNum;
	private List<FileVO> file;
	private List<FileAuthVO> fileAuth;
	
	
	public BoardFileVO() {
		// TODO Auto-generated constructor stub
	}
	public BoardFileVO(Integer boardFileNo, Integer fileNo, Integer boardNum,
			List<FileVO> file, List<FileAuthVO> fileAuth) {
		super();
		this.boardFileNo = boardFileNo;
		this.fileNo = fileNo;
		this.boardNum = boardNum;
		this.file = file;
		this.fileAuth = fileAuth;
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
	public List<FileVO> getFile() {
		return file;
	}
	public void setFile(List<FileVO> file) {
		this.file = file;
	}
	public List<FileAuthVO> getFileAuth() {
		return fileAuth;
	}
	public void setFileAuth(List<FileAuthVO> fileAuth) {
		this.fileAuth = fileAuth;
	}
	@Override
	public String toString() {
		return "BoardFileVO [boardFileNo=" + boardFileNo + ", fileNo=" + fileNo
				+ ", boardNum=" + boardNum + ", file=" + file + ", fileAuth="
				+ fileAuth + "]";
	}
	
	
	
	
}
