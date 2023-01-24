package nadocoding.quiz12;

import nadocoding.quiz12.clean.CleanRunnable;

public class Runnable {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        java.lang.Thread thread = new java.lang.Thread(cleanRunnable);
        thread.start();

        cleanByBoss();
    }

    public static void cleanByBoss(){
        System.out.println("-- 사장 청소 시작--");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }


}
