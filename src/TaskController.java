public class TaskController {


    private Task task;

    public TaskController(Task task){
        this.task = task;
    }

    public void taskStatusOpen(){
        if (task.getStatus().getOpen() == null) task.setStatus(task.getStatus().getOpen());
    }

    public void taskStatusInProgress(){
        if (task.getStatus().getInProgress() == null) task.setStatus(task.getStatus().getInProgress());
    }

    public void taskStatusReopened(){
        if (task.getStatus().getReopened() == null) task.setStatus(task.getStatus().getReopened());
    }

    public void taskStatusClosed(){
        if (task.getStatus().getClosed() == null) task.setStatus(task.getStatus().getClosed());
    }
    public void taskResolved(){
        if (task.getStatus().getResolved() == null) task.setStatus(task.getStatus().getResolved());
    }


}
