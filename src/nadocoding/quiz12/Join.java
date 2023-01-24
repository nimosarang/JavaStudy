package nadocoding.quiz12;

import nadocoding.quiz12.clean.CleanRunnable;

public class Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        java.lang.Thread thread = new java.lang.Thread(cleanRunnable);
        thread.start();

        try {
            thread.join(2500); // 최대 2.5초 대기 , 그래도 청소가 안끝나면 사장도 청소 시작
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();



    }

    public static void cleanByBoss(){
        System.out.println("-- 사장 청소 시작--");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) " + i + "번방 청소 중");

            try {
                java.lang.Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
