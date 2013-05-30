package org.bsns.server.domain;

public class FileVO {
	private Integer fileNo;
	private long fileSize;
	private String fileType;
	private String fileName;
	private String filePath;
	
	public FileVO() {
		// TODO Auto-generated constructor stub
	}
	public FileVO(Integer fileNo, long fileSize, String fileType,
			String fileName, String filePath) {
		super();
		this.fileNo = fileNo;
		this.fileSize = fileSize;
		this.fileType = fileType;
		this.fileName = fileName;
		this.filePath = filePath;
	}
	public Integer getFileNo() {
		return fileNo;
	}
	public void setFileNo(Integer fileNo) {
		this.fileNo = fileNo;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	@Override
	public String toString() {
		return "FileVO [fileNo=" + fileNo + ", fileSize=" + fileSize
				+ ", fileType=" + fileType + ", fileName=" + fileName
				+ ", filePath=" + filePath + "]";
	}
	
	
	
}
