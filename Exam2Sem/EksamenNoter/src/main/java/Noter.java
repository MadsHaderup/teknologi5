import java.util.List;

public class Noter {

    public int getSubtasksTime(List<SubTask> subTasks){
        int hours = 0;
        int minutes = 0;
        for(SubTask subTask : subTasks){
            hours = hours + subTask.getHours();
            minutes = minutes + subTask.getMinutes();
        }
        int extraHours = (int)(((double)minutes) / 60.0);
        return hours + extraHours;

    }
}
