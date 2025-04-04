public class EX_BoardTest {
    public static void main(String[] args) {
        NoticeBoard nb = new NoticeBoard();
        nb.setNum(1);
        nb.setSubject("공지사항입니다.");
        nb.setContent("공지사항 내용입니다.");
        nb.setWriter("관리자");
        nb.setFile("첨부파일.zip");

        QNABoard qna = new QNABoard();
        qna.setNum(1);
        qna.setSubject("공지사항입니다.");
        qna.setContent("공지사항 내용입니다.");
        qna.setWriter("관리자");
        qna.setVote(123);

        FreeBoard free = new FreeBoard();
        free.setNum(1);
        free.setSubject("공지사항입니다.");
        free.setContent("공지사항 내용입니다.");
        free.setWriter("관리자");
        free.setScrapCount(456);;
    }
}
