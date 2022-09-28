package chap06.sec04.verify.exam03;

/**
 * packageName : chap06.sec04.verify
 * fileName : MemberService
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */

//MemberService 클래스에 login() 함수와 logout() 함수를 선언하려고 합니다. 클래스를 작성하세요.
// login() 함수를 호출할 때에는 매개값으로 id와 password를 제공하고, logout() 함수는 id만 매개값으로 제공합니다.
// MemberService 클래스와 login(), logout() 함수를 선언해 보세요.
// login() 함수는 매개값 id가 "hong", 매개값 password 가 "12345" 일 경우에만 true 로 리턴하고, 그 이외의 값일 경우에는 false 를 리턴하세요.
// logout() 함수의 내용은 "hong이 로그아웃 되었습니다."가 출력되도록 하세요.
// 리턴타입 : boolean, 함수명 : login, 매개변수타입 : id(String), password(String)
// 리턴타입 : void, 함수명 : logout, 매개변수타입 : id(String)
// 결과 :
//    로그인 되었습니다.
//    hong이 로그아웃 되었습니다.

public class MemberService {
    boolean login(String id , String password){
        if ( id.equals("hong")  && password.equals("12345")){
            return true;
        }
        else {
            return false;
        }
    }
    void logout(String id){
        System.out.println(id + "이 로그아웃 되었습니다.");
    }
}
