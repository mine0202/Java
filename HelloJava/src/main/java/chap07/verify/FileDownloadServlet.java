package chap07.verify;

/**
 * packageName : chap07.verify
 * fileName : FileDownloadServlet
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class FileDownloadServlet extends HttpServlet{
    @Override
    public void service() {
        System.out.println("파일 다운로드합니다.");
    }
}
