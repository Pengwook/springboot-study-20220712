package com.springboot.studyhyeonwook.service.board;

import com.springboot.studyhyeonwook.web.dto.board.CreateBoardReqDto;
import com.springboot.studyhyeonwook.web.dto.board.CreateBoardRespDto;

public interface BoardService {
	public CreateBoardRespDto createBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
	public boolean readBoard(int boardcode) throws Exception;
	public boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception;
	public boolean deleteBoard(int boardcode) throws Exception;
}
