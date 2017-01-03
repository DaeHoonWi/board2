/**
 * 
 */
package com.board2.dto;

/************************************************
 * <pre>
 *
 * </pre>
 * @Company : (주)한국이디에스
 * @Author  : 위대훈
 * @Date    : 2017. 1. 3. 오전 11:49:40
 * @Version : 1.0
 * @MovieTeamProject 게시판
 *************************************************/
public class ContentDTO {
	
	private int mId;
	private String mWriter;
	private String mContent;
	
	/**
	 * Desc : Constructor of ContentDTO.java class
	 */
	public ContentDTO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Desc : Constructor of ContentDTO.java class
	 * @param mId
	 * @param mWriter
	 * @param mContent
	 */
	public ContentDTO(int mId, String mWriter, String mContent) {
		this.mId = mId;
		this.mWriter = mWriter;
		this.mContent = mContent;
	}

	/**
	 * <pre>
	 * return the mId
	 * </pre>
	 * @return 
	 */
	public int getmId() {
		return mId;
	}

	/**
	 * <pre>
	 * the mId to set
	 * </pre>
	 * @param mId 
	 */
	public void setmId(int mId) {
		this.mId = mId;
	}

	/**
	 * <pre>
	 * return the mWriter
	 * </pre>
	 * @return 
	 */
	public String getmWriter() {
		return mWriter;
	}

	/**
	 * <pre>
	 * the mWriter to set
	 * </pre>
	 * @param mWriter 
	 */
	public void setmWriter(String mWriter) {
		this.mWriter = mWriter;
	}

	/**
	 * <pre>
	 * return the mContent
	 * </pre>
	 * @return 
	 */
	public String getmContent() {
		return mContent;
	}

	/**
	 * <pre>
	 * the mContent to set
	 * </pre>
	 * @param mContent 
	 */
	public void setmContent(String mContent) {
		this.mContent = mContent;
	}
	
}
