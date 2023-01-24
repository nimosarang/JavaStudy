
public class PhoneMain {
    public static void main(String[] args) {
        //1. 해당 클래스 구현해서 객체를 생성 사용해보자
        //2. 키보드로 부터 메뉴를 입력 받아 케이스 선택하도록 (1.추가 2.출력 3.종료)
        //3. Manager 클래스를 생성해서 각각의 기능(1,2)을 구현하도록 하자
        //4. 추가, 출력에 대한 기능을 구현하시오 -> 키보드로부터 이름, 전화번호, 생년월일 입력
        //5. 검색 기능 구현
        //6. 수정, 삭제 구현

//        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();

        while(true){
            System.out.println("1.전화번호부 추가  2.전화번호부 출력 3.전화번호부 조회 4. 전화번호부 수정 5. 전화번호부 삭제 6.프로그램 종료");
            System.out.println("메뉴를 선택해주세요: ");
            String menu = DataInput.sc.nextLine();

            switch (menu){
                case "1" : //추가
                    manager.addPhoneInfo();
                    break;

                case "2" : //전체출력
                    manager.listPhoneInfo();
                    break;

                case "3" : //조회(검색)
                    manager.searchPhoneInfo();
                    break;

                case "4" : //수정
                    manager.updatePhoneInfo();
                    break;

                case "5" : //삭제
                    manager.deletePhoneInfo();
                    break;

                case "6" : //종료
                    System.out.println("프로그램 종료");
                    return;
            }
        }

    }
}