package nadocoding.quiz12;

public class Synchronization {
    public static void main(String[] args) {
        Room room = new Room();

        java.lang.Runnable cleaner1 = new java.lang.Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원1 청소 시작 --");
                for (int i = 1; i <= 5; i++) {
                    room.clean("직원1");
                }
                System.out.println("-- 직원1 청소 끝 --");
            }
        };

        java.lang.Runnable cleaner2 = () -> {
            System.out.println("-- 직원2 청소 시작 --");
            for (int i = 1; i <= 5; i++) {
                room.clean("직원2");
            }
            System.out.println("-- 직원2 청소 끝 --");
        };

        java.lang.Thread cleanerThread1 = new java.lang.Thread(cleaner1);
        java.lang.Thread cleanerThread2 = new java.lang.Thread(cleaner2);

        cleanerThread1.start();
        cleanerThread2.start();
    }

}

