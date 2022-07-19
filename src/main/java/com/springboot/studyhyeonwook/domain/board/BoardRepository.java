package com.springboot.studyhyeonwook.domain.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {
	public int save(Board board);	// insert는 무조건 리턴이 int기 때문에 여기 int임
	public Board findBoardByBoardcode(int boardcode);
	public List<Board> getBoardListOfIndex(int index);
}
