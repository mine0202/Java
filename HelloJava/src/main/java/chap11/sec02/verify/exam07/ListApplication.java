package chap11.sec02.verify.exam07;

import java.util.List;

public class ListApplication {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
//        List 배열에 Board 객체에 저장되어 있는 값이 들어감
        List<Board> list = dao.getBoardList();

        for(Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }

    }
}
