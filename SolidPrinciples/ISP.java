interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Student implements Workable, Eatable {
    public void work() {
        System.out.println("Student is working");
    }

    public void eat() {
        System.out.println("Student is eating");
    }
}

class Robot implements Workable {
    public void work() {
        System.out.println("Robot is working");
    }
}

public class ISP {
    public static void main(String[] args) {
        Workable studentWork = new Student();
        Eatable studentEat = new Student();
        Workable robotWork = new Robot();

        studentWork.work();
        studentEat.eat();
        robotWork.work();
    }
}
