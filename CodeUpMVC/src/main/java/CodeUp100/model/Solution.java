package CodeUp100.model;



// 해답 클래스 , Model 클래스 ( 속성 / 생성자 / Setter / Getter )

//MVC 디자인패턴
// M (model) : Model / Service / Dao
// C (controller) : Controller
// V (view) : Vue / React

public class Solution {
    String strResult;  // 결과를 저장할 속성
    int[] num;

    public String getStrResult() {
        return strResult;
    }

    public void setStrResult(String strResult) {
        this.strResult = strResult;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }
}
