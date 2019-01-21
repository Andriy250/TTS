package Statuses;

public class Open extends Status {

    public Status getInProgress(){
        return new InProgress();
    }

    public Status getClosed(){
        return new Closed();
    }

    @Override
    public Status getStatus() {
        return this;
    }
}
