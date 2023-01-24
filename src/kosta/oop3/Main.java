package kosta.oop3;
public class Main {

    public static void main(String[] args) {
        Dao dao1 = new OracleDao();
        Dao dao2 = new MySQLDao();

        Dao dao3 = new Dao() {
            @Override
            public void insert() {
                System.out.println("MsSQLDao 호출");
            }
        };

        BoardService service = new BoardService();
        service.insertBoard(dao3);

    }
}
