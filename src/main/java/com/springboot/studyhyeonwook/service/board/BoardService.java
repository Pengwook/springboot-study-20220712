package com.springboot.studyhyeonwook.service.board;

import java.util.List;

import com.springboot.studyhyeonwook.web.dto.board.CreateBoardReqDto;
import com.springboot.studyhyeonwook.web.dto.board.CreateBoardRespDto;
import com.springboot.studyhyeonwook.web.dto.board.ReadBoardRespDto;

public interface BoardService {
	public CreateBoardRespDto createBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
	public ReadBoardRespDto readBoard(int boardcode) throws Exception;
	public List<ReadBoardRespDto> readBoardList(int page) throws Exception;
	public boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception;
	public boolean deleteBoard(int boardcode) throws Exception;
}
