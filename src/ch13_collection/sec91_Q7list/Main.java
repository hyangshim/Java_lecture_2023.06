package ch13_collection.sec91_Q7list;

import java.util.List;



public class Main {
	public static void main(String[] args) {
		BoardDao  dao =new BoardDao();
		List<Board> list =dao.getBoardList();
		for (Board board : list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}
	}

}
