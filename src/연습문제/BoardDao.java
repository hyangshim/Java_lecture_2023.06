package 연습문제;

import java.util.ArrayList;
import java.util.List;


public class BoardDao {
	public List<Board> getBoardList(){
		// ArrayList은 중복된값 출력
		List<Board> list =new ArrayList<Board>();
		list.add(new Board("글제목","글내용"));
		list.add(new Board("Title","Content"));
		return list;
	}
}


