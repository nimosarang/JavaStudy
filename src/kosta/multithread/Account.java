package kosta.multithread;

public class Account {
    private String accountNo; //계좌번호
    private String ownerName; //이름
    private int balance; //잔액

    public Account() {
    } //디폴트 생성자

    public Account(String accountNo, String ownerName, int balance) { //생성자 생성
        super();
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    } //입금 메소드

//    public int withdraw(int amount) throws Exception {// 출력메소드
//        if (balance < amount) {
//            throw new Exception("잔액 부족");
//        }
//        balance -= amount;
//
//        return amount;
//    }

    public void withdraw(int amount)  {
        balance -= amount;
    }



    public void show() {
        System.out.println("계좌번호:" + accountNo);
        System.out.println("계좌주:" + ownerName);
        System.out.println("잔액:" + balance);
        System.out.println();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}


