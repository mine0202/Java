package chap07.verify;

/**
 * packageName : chap07.verify
 * fileName : HttpServletExample
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class HttpServletExample {
    public static void main(String[] args) {

        method(new LoginServlet());         // "로그인 합니다"
        method(new FileDownloadServlet());  // "파일 다운로드합니다."
    }
//   HttpServlet  부모클래스
//    자식클래스 : LoginServlet , FileDownloadServlet
    public static void method(HttpServlet servlet) {
        servlet.service();  // 자식클래스 재정의 된 함수를 호출
    }
}

