
interface Database {
    void save(String name);
}

class MySqlDB implements Database {
    public void save(String name) {
        System.out.println("Saved to MySql database");
    }
}

class UserService {
    private Database db;

    UserService(Database db) {
        this.db = db;
    }

    public void SaveUser(String data) {
        db.save(data);
    }
}

public class DIP {
    public static void main(String[] args) {
        Database mySqldb = new MySqlDB();

        //MySqlDB saveData = new MySqlDB();

        UserService service = new UserService(mySqldb);
        service.SaveUser("Balaji");

    }
}