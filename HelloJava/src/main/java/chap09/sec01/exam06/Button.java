package chap09.sec01.exam06;

/**
 * packageName : chap09.sec01.exam06
 * fileName : Button
 * author : ds
 * date : 2022-10-04
 * description : 중첩 인터페이스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class Button {

    OnClickListener listener;  // 일반 속성

//     setter
    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }

//    일반함수 : 터치하면 클릭함수 호출
    void touch(){
        listener.onClick();

    }

//    공유 중첩 인터페이스
    static interface OnClickListener {
        void onClick();
    }
}
