package jti.amel.todolist_uts;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Task implements Serializable {

    @PrimaryKey(autoGenerate = true)
    int taskId;
    @ColumnInfo(name = "taskTitle")
    String taskTitle;
    @ColumnInfo(name = "date")
    String date;
    @ColumnInfo(name = "taskDescription")
    String taskDescrption;
    @ColumnInfo(name = "lastAlarm")
    String lastAlarm;


    public Task() {

    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTaskDescrption() {
        return taskDescrption;
    }

    public void setTaskDescrption(String taskDescrption) {
        this.taskDescrption = taskDescrption;
    }

    public void setLastAlarm(String lastAlarm){
        this.lastAlarm = lastAlarm;
    }
    public String getLastAlarm(){
        return lastAlarm;
    }
}