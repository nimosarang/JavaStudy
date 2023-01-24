package nadocoding.quiz11;

public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");
//            System.out.println("택시에 탑승한다");
        }catch (Exception e){
            System.out.println("!!문제발생 : " + e.getMessage());
        }finally { //문제가 생기던말던 실행, 임시파일 작업 후 삭제에도 활용가능, 파일 닫기에 자주 활용
            System.out.println("택시의 문을 닫는다.");
        }

        //try + catch(s)
        //try + catch(s) + finally
        //try + finally

        System.out.println("-------------------");



    }
}
