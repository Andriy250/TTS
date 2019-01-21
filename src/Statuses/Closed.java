package Statuses;

public class Closed extends Status {

    public Status getReopened(){
        return new Reopened();
    }


    @Override
    public Status getStatus() {
        return this;
    }
}
