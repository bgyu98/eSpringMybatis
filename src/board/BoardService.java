package board;

import java.util.List;

import board.vo.BoardVO;

public interface BoardService {
	// CRUD 湲곕뒫�쓽 硫붿냼�뱶 援ы쁽
	// 湲� �벑濡�
	void insertBoard(BoardVO vo);

	// 湲� �닔�젙
	void updateBoard(BoardVO vo);

	// 湲� �궘�젣
	void deleteBoard(BoardVO vo);

	// 湲� �긽�꽭 議고쉶
	BoardVO getBoard(BoardVO vo);

	// 湲� 紐⑸줉 議고쉶
	List<BoardVO> getBoardList(BoardVO vo);
}
