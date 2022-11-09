package board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import board.BoardDao;
import board.BoardService;
import board.vo.BoardVO;

// @Component("boardService")
@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired // 자동 주입(객체 1개일 때)
	/* 객체가 여러개일 때
	  	@Qualifier("xxx)
	  	@Resource(name="nnn")
	*/
	private BoardDao boardDAO;

	// 메소드오버라이딩
	@Override
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		return null;
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		return null;
	}


}
