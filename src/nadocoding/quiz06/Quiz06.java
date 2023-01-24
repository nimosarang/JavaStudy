package nadocoding.quiz06;

public class Quiz06 {

    public static String getHiddenData(String data, int index){
        String hiddenData = data.substring(0, index);
//        for (int i = 0; i < data.length()-index; i++)
        for(int i = index; i<data.length(); i++){
            hiddenData += "*";
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        String name = "안성민"; //이름
        String id = "920101-1134567"; //주민번호
        String phone = "010-1234-5678"; // 폰번호

        System.out.println("이름 : " + getHiddenData(name, 1)); //개인정보, 비공개 시작 위치
        System.out.println("주빈등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));

    }



}
