package nadocoding.quiz12;

public class MultiThread {
    public static void main(String[] args) {
        java.lang.Runnable cleaner1 = new java.lang.Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원1 청소 시작 --");
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println("(직원1)" + i + " 번방 청소 중");

                    try {
                        java.lang.Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("-- 직원1 청소 끝 --");
            }
        };

        java.lang.Runnable cleaner2 = () -> {
                System.out.println("-- 직원2 청소 시작 --");
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println("(직원2)" + i + " 번방 청소 중");

                    try {
                        java.lang.Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("-- 직원2 청소 끝 --");
        };

        java.lang.Thread cleanerThread1 = new java.lang.Thread(cleaner1);
        java.lang.Thread cleanerThread2 = new java.lang.Thread(cleaner2);

        cleanerThread1.start();
        cleanerThread2.start();
    }

}
