/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainlogin;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
class Task_class {
    

    public int taskNumber, total, optionSelect, taskStatus, duration,count = 0;
    public String taskDescription, taskName, developerDetails, taskID, status;
    public boolean taskdes;
    public String TaskDetails;
    


    public Task_class(int taskNumber, int total, int optionSelect, String taskDescription, String taskName, String developerDetails, int taskStatus, String status,int duration,String taskID, int count ) {
        
        this(taskNumber, total, optionSelect, taskDescription, taskName, developerDetails, taskStatus, duration);
    }

    public Task_class(int taskNumber, int total, int optionSelect, String taskDescription, String taskName, String developerDetails, int taskStatus, int duration) {
        this(taskNumber, total, optionSelect, taskDescription, taskName, developerDetails, taskStatus);
    }

    public Task_class(int taskNumber, int total, int optionSelect, String taskDescription, String taskName, String developerDetails, int taskStatus) {
        this.taskNumber = taskNumber;
        this.total = total;
        this.optionSelect = optionSelect;
        this.taskDescription = taskDescription;
        this.taskName = taskName;
        this.developerDetails = developerDetails;
        this.taskStatus = taskStatus;
        this.status = status;
        this.count = count;
        this.duration = duration;
        this.taskID = taskID;
    }

 public boolean checkTaskDescription() {
    while(taskDescription.length() > 50)
    {
        taskDescription = JOptionPane.showInputDialog("Please enter a task description of less than 50 characters.");
    }
    return true;
 }
 public String createTaskID()
 {
     taskID = (taskName.substring(0, 2) + ":" + count + ":" + developerDetails.substring(developerDetails.length() - 3));
     taskID = taskID.toUpperCase();
     return taskID;
  }   
  
 public String printTaskDetails()
 {
     if (taskStatus == 1)
     {    
         status = ("To Do");
     }
     if (taskStatus == 2)
     {
         status = ("Done");
     }  
      if (taskStatus == 3)
     {
         status = ("Doing");
     }
      TaskDetails = (status + "," + developerDetails + "," + count + taskName + "," + taskDescription + "," + taskID + "," + duration);
      return TaskDetails;
      
 } 
 public int returnTotalHours()
 {
     int total = 0;
     if(count == 0)
 {
     total = duration;
 }
     else if(count >= 1)
 {
     total = total+duration;    
 }   
     return total;
 }        
}


