package chap10.sec02.exam03;

/**
 * packageName : chap10.sec02.exam03
 * fileName : CatchByCatchApplication
 * author : ds
 * date : 2022-10-04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class CatchByCatchApplication {
    public static void main(String[] args) {
        try{
            String data1 = args[0];
            String data2 = args[1];

            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println(data1 +"+"+data2+"="+result);
//            catch 가 여려개라도 첫번째 에러만 실행하고 finally로 감.
        }catch (Exception e){
            System.out.println("실행 매개변수의 수가 부족합니다.");
//        } catch (NumberFormatException e){
//            System.out.println("숫자로 변환할 수 없습니다.");
        } finally {
            System.out.println("다시 실행하세요.");
        }
    }
}
