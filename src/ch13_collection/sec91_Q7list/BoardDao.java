package ch13_collection.sec91_Q7list;

import java.util.ArrayList;
import java.util.List;


public class BoardDao {
	public List<Board> getBoardList(){
		// ArrayList은 중복된값 출력
		List<Board> list =new ArrayList<Board>();
		list.add(new Board("제목1","글내용"));
		list.add(new Board("Title","내용2"));
		return list;
	}
}


