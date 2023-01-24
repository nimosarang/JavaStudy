package kosta.io;

import kosta.video.Video;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialExam {
    private Member m;

    //객체 직렬화
    public void write() { //객체 직렬화 메소드
        Video v = new Video("1","a","B"); // Video 클래스에도 implements Serializable
        m = new Member("박길동", 30, v);
        ObjectOutputStream oos = null;

        try {

            oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
            oos.writeObject(m); //멤버객체 보냄

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (Exception e2) {
            }
        }
    }

    //객체 역직렬화
    public void read() {

        ObjectInputStream ois = null;
        try {

            ois = new ObjectInputStream(new FileInputStream("object.ser"));
            m = (Member) ois.readObject(); //맴버객체 받아오길 원함, Object 를 Member 로 형변환

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (Exception e2) {
            }
        }
    }

    public static void main(String[] args) {

        SerialExam se = new SerialExam();

        se.write(); //객체 직렬화
        se.m = null; //이제 m에 없고 파일에만 있다
        se.read(); //역 직렬화

        System.out.println(se.m); //다시 들어왓는지 확인해보자 // toString 메소드 만들어서 se.m 이렇게 출력 가능,
        //오 객체가 잘 올라갔군! object.ser 생성되었고 콘솔창에 출력 시 Member{name='홍길동', age=20} 잘 출력된다

    }
}
