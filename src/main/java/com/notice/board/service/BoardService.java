package com.notice.board.service;


import com.notice.board.entity.Board;
import com.notice.board.repository.BoardRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BoardService {


    private BoardRepository boardRepository;

    //작성
    public void write(Board board) {

        boardRepository.save(board);
    }
    //리스트 처리
    public List<Board> boardList() {

        return boardRepository.findAll();
    }


    //게시글 불러오기
    public Board boardView(Integer id) {

        return boardRepository.findById(id).get();
    }

    //게시글 삭제
    public void boardDelete(Integer id) {

        boardRepository.deleteById(id);
    }


}
