package Statuses;

public class Resolved extends Status{

    public Status getReopened(){return new Reopened();}

    public Status getClosed() { return new Closed();}
    @Override
    public Status getStatus() {
        return this;
    }
}
