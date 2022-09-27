package chap05;

/**
 * packageName : chap05
 * fileName : Sec0502
 * author : ds
 * date : 2022-09-26
 * description : 배열
 * 요약:
 *      배열 : 같은 자료형의 데이터를 연속된 공간에 저장, 내부적으로 인덱스번호가 부여됨
 *      인덱스 : 0~n 까지 부여된 숫자
 *      배열 선언 : 자료형 [] 변수;
 *      배열 생성 : 1) 자료형[] 변수 = { 값1, ... 값n};
 *                2) 자료형[] 변수 = new 자료형 []{값1,..., 값n};
 *                3) 자료형[] 변수 = new 자료형 [길이];
 *                    변수[0] = 값1;
 *                    .....
 *                    변수[n] = 값n;
 *      배열 길이 : 배열변수.length  ( 읽기 전용 )
 *      2차원 배열 : 자료형[][] 변수 = new 자료형[크기][크기];
 *      향상된 for 문 (증감식 없음, 자동증가 ): for(자료형 변수 : 배열변수명 ) { 반복문 }
 *
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-26         ds          최초 생성
 */
public class Sec0502 {
    public void getStudent(){
        //    예제 학생의 성적을 저장하여 총합과 평균을 출력하는 프로그램을 작성
//    참조자료형 ( 배열, 객체)
//    int score[] ={} ; 도 가능
//         값을 넣을때는 중괄호{ } , 선언할때는 대괄호[]
//         자바 배열 선언 : 자료형[] 변수명 = { 값1, ... 값n}
//        사용시 주의점 : 1라인으로 사용해야함 ( 배열 선언과 동시에 값을 넣어야함. )
//        예 ) int[] score;
//             score = {83, 90, 87, 88, 89, 90, 91, 92, 93, 75};   // 에러발생

        int[] score = {83, 90, 87, 88, 89, 90, 91, 92, 93, 75};
        int sum = 0;

        for( int i = 0 ; i <10 ; i ++){
//            배열의 값을 가져오기 : 변수명 = score[인덱스번호]
//            배열의 값을 수정하기 : score[인텍스번호] = 10;
            sum += score[i];
        }
//        평균
        int avg = sum /10;
        System.out.println("sum="+sum+", avg ="+ avg);
    }
//     배열 정의 및 생성 방법
    public void ArrayCreateByValueList(){
//        new 연산자도 사용가능 : 배열도 자바에서는 객체로 취급

//        int[] score = new int[] {83, 90, 87 };
//        두 라인 이상으로 코딩 가능, 선언하고 나중에 값을 넣어도 에러 발생하지 않음.
        int[] score2 ;
        score2 = new int[] {83, 90, 87 };

//        기본 성적 출력하기
        System.out.println("score2[0]: " + score2[0]);
        System.out.println("score2[1]: " + score2[1]);
        System.out.println("score2[2]: " + score2[2]);

//      성적 합계
        int sum = 0;
        for ( int i=0 ; i<3; i++){
            sum += score2[i];
        }

        System.out.println("총합 : "+ sum);
//        평균
        double avg = (double)sum/3;
        System.out.println("평균 : "+ avg);
//        괄호에 따라 값이 다름
        double avg2 = (double)(sum/3);
        System.out.println("평균 : "+ avg2);

    }

    public void ArrayCreateByNew(){
//        배열 생성 및 정의
//        배열의 값을 저장할 공간을 3개 만들어 놓기
        int[] arr1 = new int[3];
        for ( int i = 0; i<3; i++){
            System.out.println("arr1[" + i + "]= " +arr1[i]);
        }
//      arr1 베열에 ( 10, 20, 30 ) 넣어 보기
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        for ( int i = 0; i<3; i++){
            System.out.println("arr1[" + i + "]= " +arr1[i]);
        }
//      아래처럼 new 를 사용하여 다시 방을 만들면 메모리 낭비가 된다.
        arr1 = new int[]{10, 20, 30};
        for ( int i = 0; i<3; i++){
            System.out.println("arr1[" + i + "]= " +arr1[i]);
        }

//      배열을 초기화 하려면 for 문을 사용하여 각 값에 0 을 넣어준다.
        for ( int a=0; a<3; a++){
            arr1[a]=0;
        }
        for ( int i = 0; i<3; i++){
            System.out.println("arr1[" + i + "]= " +arr1[i]);
        }
    }

    public void exam01(){
//         실수 (double) 배열 arr2 를 만들어서 값을 ( 0.1 , 0.2 , 0.3 ) 저장하고 출력하세요
//         문자열(String) 배열 arr3 를 만들어서 값을 ( "1월" , "2월", "3월" ) 저장하고 출력하세요
// 사용법 : 자료형 [] 배열변수 = new 자료형[배열크기];
//        배열 : 초기 크기를 지정하면 뒤에서 크기변경 불가함 (처음에 여유있게 생성 )
        double[] arr2 = { 0.1 , 0.2 , 0.3};
        double[] arr4 = new double[3];
        arr4[0]= 0.1;
        arr4[1]= 0.2;
        arr4[2]= 0.3;

        String[] arr3 = {"1월" , "2월", "3월" };

        // 실수 배열 출력

        for ( int i = 0 ; i<3; i++){
            System.out.println("arr2["+ i + "] = "+ arr2[i]);
        }
        for ( int i = 0 ; i<3; i++){
            System.out.println("arr4["+ i + "] = "+ arr4[i]);
        }

        // 문자열 배열 출력

        for ( int i = 0 ; i<3; i++){
            System.out.println("arr3["+ i + "] = "+ arr3[i]);
        }

    }

    public void ArrayCreateByValueList2(){
        int[] score ;
        score = new int[] {83, 90, 87 };

//        기본 성적 출력하기
        System.out.println("score2[0]: " + score[0]);
        System.out.println("score2[1]: " + score[1]);
        System.out.println("score2[2]: " + score[2]);

// 합계 계산용 함수 호출 : add() 아래 만듬
        int sum2 = add(score);

//        매개변수로 배열을 전달할때 아래같이 사용하면 에러가 발생함
//        int sum2 = add({87,88,89});  // 에러발생
////        아래는 가능
//        int sum2 = add(new int[]{87,88,89});  // 가능함

        System.out.println("총합 : "+ sum2);
//        평균
        double avg = (double)sum2/3;
        System.out.println("평균 : "+ avg);
//        괄호에 따라 값이 다름
        double avg2 = (double)(sum2/3);
        System.out.println("평균 : "+ avg2);
    }

    // 성적 배열을 매개변수로 전달 받아 합계를 계산해서 리턴하는 함수( 재사용 목적 )
    public int add(int[] scores){
        //      성적 합계
        int sum = 0;
        for ( int i=0 ; i<3; i++){
            sum += scores[i];
        }
        return sum;
    }

//    2차원 배열 : 배열 속에 배열
    public void ArrayInArray(){
//         자바에서 2차원 배열 정의 및 생성
        int[][] matchScores = { {1,2,3}, {11,12,13} };

//      행열 : 2차원 배열과 비슷함
//        int[][] matchScores = new int [행개수][열개수];
//        for (){  // 바깥쪽 중괄호 - 행
//            for() {  // 안쪽 중괄호 - 열
//            }
//        }
//        아래 처럼 입력 가능
//        int[][] matchScores2 = new int[2][3];
//        matchScores2[0][0]=1;
//        matchScores2[0][1]=2;
//        matchScores2[0][2]=3;
//        matchScores2[1][0]=11;
//        matchScores2[1][1]=12;
//        matchScores2[1][2]=13;

//        2중 for 문을 작성해서 출력
//         2차원 배열의 값 가져오기 : 배열변수 [ 1st 인덱스번호 ] [ 2nd 인덱스번호 ]
        for (int i=0; i<matchScores.length; i++){
            for (int a=0; a<matchScores[i].length; a++){
                System.out.println("( "+ i + " , "+a +" ) = "+ matchScores[i][a]);
            }
        }
        System.out.println("-------------- englishScores2 ------------------");
//        2차원 배열(참고) 비대칭(균형 잡히지 않은 ) 배열
        int[][] englishScores2 = {{95,92},{81,82,83} };

//        비대칭 배열 출력하기
        for (int i=0; i<englishScores2.length; i++){
            for (int a=0; a<englishScores2[i].length; a++){
                System.out.println("( "+ i + " , "+a +" ) = "+ englishScores2[i][a]);
            }
        }


        System.out.println("-------------- englishScores ------------------");
//        2차원 배열(참고) 비대칭(균형 잡히지 않은 ) 배열
        int[][] englishScores = new int[2][];

        englishScores[0] = new int[]{1,2};
        englishScores[1] = new int[]{11,12,13};
//        비대칭 배열 출력하기
        for (int i=0; i<englishScores.length; i++){
            for (int a=0; a<englishScores[i].length; a++){
                System.out.println("( "+ i + " , "+a +" ) = "+ englishScores[i][a]);
            }
        }



    }
//    데이터 복사 방법 :
//          1) 카피본 생성 복사  ( 깊은 복사 , deep copy ) : new 배열 생성, for 문 실행 ,  .arraycopy()함수
//          2) 방번호(주소값) 복사 ( 얇은 복사 , swallow copy ) : 배열번수2 = 배열변수 1
    public void ArrayCopyByForExample(){
        int[] oldIntArray = { 1,2,3};

//        깊은 복사 ( deep copy ) : 복사본 생성해서 데이터 복사하기
        int[] newIntArray = new int[5];  // 값을 저장할 새로운 방을 만들기
        for ( int i=0; i <oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];
        }
//        배열 출력하기
        for ( int i=0; i <oldIntArray.length; i++){
            System.out.println(newIntArray[i]);
        }

//        자바 함수 사용해서 깊은 복사하기
        String[] oldStrArray = {"Java", "Python", "C"};
        String[] newStrArray = new String[5];

//         .arraycopy(원본배열변수, 원본의 복사시작 위치 index값, 복사본배열변수, 복사본의 복사시작 위치 index값, 원본배열길이);
        System.arraycopy(oldStrArray,0,newStrArray,0,oldStrArray.length);

        for ( int i=0; i <oldStrArray.length; i++){
            System.out.println(newStrArray[i]);
        }

    }

//    개선된(향상된) for 문
//    사용법 : for ( 자료형 변수명 : 배열변수명) { 반복문 }
//    배열의 끝까지 순회해서 끝에 다달으면 반복문이 종료 ( 중감식이 없음, 자동 증가 )
    public void AdvanceForExample(){
        int[] scores = {95,71,72,73,80};
//        점수 총합, 평균 구하기 , 개선된 for 문으로
        int sum=0;
        for ( int score : scores){
            sum += score;
        }
        System.out.println("점수 총합 = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = "+ avg);

    }

}
