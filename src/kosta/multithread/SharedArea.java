package kosta.multithread;

public class SharedArea {
    public Account account1; //이몽룡계좌
    public Account account2; //성춘향의 계좌

    public SharedArea() {
        this.account1 = account1;
        this.account2 = account2;
    }

    void transfer(int amount) throws Exception {
        synchronized (this) {
            account1.withdraw(2000000); // 이몽룡
            System.out.println("이몽룡 계좌 : 100만원 입금");
            account2.withdraw(1000000); // 성춘향
            System.out.println("성춘향 계좌 : 100만원 입금");
        }
    }

    int getTotal() {
        synchronized (this) {
            return account1.getBalance() + account2.getBalance();
        }
    }

    public Account getAccount1() {
        return account1;
    }

    public void setAccount1(Account account1) {
        this.account1 = account1;
    }

    public Account getAccount2() {
        return account2;
    }

    public void setAccount2(Account account2) {
        this.account2 = account2;
    }
}
