package com.springboot.studyhyeonwook.web.controller.api.board;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studyhyeonwook.service.board.BoardService;
import com.springboot.studyhyeonwook.web.dto.board.CreateBoardReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;
	
	//게시글 작성	뒤에 번호를 안줌 -> 번호가 DB의 인덱스이기때문 
	@PostMapping("/content")
	public ResponseEntity<?> addBoard(@RequestBody CreateBoardReqDto createBoardReqDto) {	// json만 @RequestBody붙여줘야함
		
		boolean responseData = false;
		try {
			boardService.createBoard(createBoardReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(responseData);
		}
		return ResponseEntity.ok().body(responseData);	// 밑과 같음
//		return new ResponseEntity<>(title + "게시글 작성 성공",headers, HttpStatus.BAD_REQUEST);
	}
	
	//게시글 조회
	
	//게시글 수정
	
	//게시글 삭제
}
