package bookExample;

public class ButtonExample {
    public static void main(String[] args) {
        //OK 버튼 객체 생성
        Button btnOK = new Button();
        //OK 버튼 객체에 람다식(클릭리스너 익명 구현 객체) 주입

        btnOK.setClickListener( () -> {
            System.out.println("OK 버튼을 클릭했습니다.");
        });

        //OK 버튼 클릭하기
        btnOK.click();

        //Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        //Cancel 버튼 객체에 람다식(클릭리스너 익명 구현 객체) 주입
        btnCancel.setClickListener(()->{
            System.out.println("Cancel 버튼을 클릭했습니다");
        });

        //cancel 버튼 클릭하기
        btnCancel.click();



    }
}
