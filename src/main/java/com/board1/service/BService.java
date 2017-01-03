package com.board1.service;

import java.util.ArrayList;

import com.board1.dto.ContentDTO;

public interface BService {

	public ArrayList<ContentDTO> listDao();
	public void writeDao(String mWriter, String mContent);
	public ContentDTO viewDao(String strID);
	public void deleteDao(String bId);
}
