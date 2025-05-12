interface bird { }

interface flyingBird extends bird {
    void fly();
}

class Eagle implements flyingBird {
    public void fly() {
        System.out.println("Eagle could fly");
    }
}

class Crow implements flyingBird {
    public void fly() {
        System.out.println("Crow could fly");
    }
}

class Ostrich implements bird {

}