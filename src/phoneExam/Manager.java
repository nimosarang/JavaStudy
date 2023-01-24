import java.util.Scanner;

public class Manager {
    PhoneInfo arr[] = new PhoneInfo[10]; //매니저 객체가 생성될 때 배열 생성
//    Scanner sc = new Scanner(System.in); //매니저 객체가 생성될 때 스캐너 생성
    int count = 0; //인덱스 저장을 위한 변수

    public void addPhoneInfo() {
        // 전화번호부 추가(1명분) //phoneInfo 객체를 어디에 선언해야하는지가 키포인트
        System.out.println("이름을 입력해주세요:");
        String name = DataInput.sc.nextLine();

        System.out.println("전화번호를 입력해주세요: ");
        String phoneNo = DataInput.sc.nextLine();

        System.out.println("생년월일을 입력해주세요");
        String birth = DataInput.sc.nextLine();

        arr[count++] = new PhoneInfo(name, phoneNo, birth);//저장된 위치를 찾고 활용하고자 하기에 배열 객체 생성
        System.out.println("추가되었습니다!");
        System.out.println();
    }

    public void listPhoneInfo() {
        // 전체 전화번호부 출력
        for (int i = 0; i < count; i++) {
            arr[i].show();
            System.out.println();
        }
    }

    public void searchPhoneInfo() {
        System.out.println("검색할 이름을 입력해주세요: ");
        String name = DataInput.sc.nextLine();
        int idx = -1;

        for (int i = 0; i < count; i++) {
            if (arr[i].getName().equals(name)) {
                arr[i].show();
                System.out.println();
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("대상을 찾을 수 없어요");
            System.out.println();
        }

    }

    public void updatePhoneInfo() {
        System.out.println("이름을 검색하여 수정할 대상을 찾아주세요: ");
        String name = DataInput.sc.nextLine();
        int idx = -1;

        for (int i = 0; i < count; i++) {
            if (arr[i].getName().equals(name)) {
                System.out.println("전화번호: ");
                String phoneNo = DataInput.sc.nextLine();
                arr[i].setPhoneNo(phoneNo);
                idx = i;
                break;
            }
        }
        if (idx == -1){
            System.out.println("전화번호가 없어요");
        }

    }

    public void deletePhoneInfo() {

        System.out.println("이름을 검색하여 삭제할 대상을 찾아주세요: ");
        String name = DataInput.sc.nextLine();
        int idx = -1;

        for (int i = 0; i < count; i++) {
            if (arr[i].getName().equals(name)) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            System.out.println("대상을 찾을 수 없어요");
        } else {
            for (int i = idx; i < count; i++) {
                if(i == arr.length-1){ //마지막 위치 , 마지막 녀석은 당길 수 없어서 조건문으로 처리
                    arr[i] = null;
                }else{
                    arr[i] = arr[i+1];
                }
            }

        }
        count--; // Count 위치 --로 원래 위치대로 하나씩 복귀해주기
        System.out.println("삭제완료");
        System.out.println();
    }
}
