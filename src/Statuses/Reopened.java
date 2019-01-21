package Statuses;

public class Reopened extends Status {

    public Status getInProgress(){return new InProgress();}


    @Override
    public Status getStatus() {
        return this;
    }
}
