class User {
    private String name;
    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class SaveToDB {
    public void save(User user) {

    }
}

class EmailService {
    public void save(User user) {
        System.out.print(user.getName());
    }
}

public class SRP {
    public static void main(String[] args) {
        User user = new User("Balaji");

        EmailService email = new EmailService();
        email.save(user);
    }
}