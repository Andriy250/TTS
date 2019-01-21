package Statuses;

public class InProgress extends Status {

    public Status getOpen(){return new Open();}

    public Status getResolved() {return new Resolved();}

    @Override
    public Status getStatus() {
        return this;
    }
}
