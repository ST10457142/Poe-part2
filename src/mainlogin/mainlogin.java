/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainlogin;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class mainlogin {
  
    public String password1, Username1, Firstname1, Lastname1, taskdescription, taskname, developerdetails, Status,taskID, LoginUsername, LoginPassword;
    public int optionselect, taskNumber,totaltasks, taskStatus, count = 0, duration;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    
        new mainlogin();
    } 
    public mainlogin() 
    {
        
        // Login login = new Login("kyl_l", "12@4Dboy", "Ditebogo", "nkwana");
       Login login = new Login();
       
        //login details
      Firstname1 = (JOptionPane.showInputDialog("Please enter Firstname."));
      Lastname1 = (JOptionPane.showInputDialog("Please enter Lastname."));
      
      
      Username1 = (JOptionPane.showInputDialog("Please enter Username that must contain not more than 5 letters and must have an underscore."));
     boolean correct =  login.checkUsername( Username1);
      
     password1 = (JOptionPane.showInputDialog("Please enter Password."));
//       
//        
//       
       boolean pass =    login.checkPasswordcomplexity( password1);
//
//
   //  JOptionPane.showMessageDialog(null,login.registerUser(login.checkUsername( Username1) , login.checkPasswordcomplexity( password1)));
//      JOptionPane.showMessageDialog(null,login.loginUser());
//      JOptionPane.showMessageDialog(null,login.returnloginstatus());
//      
     // if (login.returnloginstatus().equals("A successful login."))
     
    
    login.registerUser(correct , pass);
    
     LoginUsername = (JOptionPane.showInputDialog("Please enter Username."));
    
     LoginPassword = (JOptionPane.showInputDialog("Please enter Password."));
        boolean loggedIn = login.loginUser(Username1, password1, LoginUsername, LoginPassword);
    
     if(loggedIn )
      {
          
          Task_class task = new Task_class(optionselect, taskNumber, totaltasks, taskdescription, taskname, developerdetails, duration, count=0 );
          
          JOptionPane.showMessageDialog(null,"Welcome to EasyKanban.");
          optionselect = Integer.parseInt(JOptionPane.showInputDialog("Please select one of the following features that you wish to carry out:"
                  + "Option 1) Add task"
                  + "Option 2) Show report"
                  + "Option 3) Quit"));
          switch (optionselect)
      { 
              case 1 -> {
                  taskNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of tasks of which the limit is 5 tasks."));
                  for (int i = 0; i < taskNumber; i++)
                  {
                      taskname = (JOptionPane.showInputDialog("Please enter the name of the task."));
                      taskdescription = (JOptionPane.showInputDialog("Please enter the brief description of the task."));
                      developerdetails = (JOptionPane.showInputDialog("Please enter the firstname as well as the lastname of the developer that is currently working on the task."));
                      duration = Integer.parseInt(JOptionPane.showInputDialog("Please input the duration of this task."));
                      taskStatus = Integer.parseInt(JOptionPane.showInputDialog("Please state the status of your task by choosing either" + "Option 1) To Do" + "Option 2) Done"
                              + "Option 3) Doing" ));
                      task = new Task_class(optionselect, taskNumber, totaltasks, taskdescription, taskname, developerdetails,duration);
                      JOptionPane.showMessageDialog(null,task.checkTaskDescription());
                      JOptionPane.showMessageDialog(null,"Description successfully captured");
                      JOptionPane.showMessageDialog(null,task.returnTotalHours());
                      JOptionPane.showMessageDialog(null,task.createTaskID());
                      JOptionPane.showMessageDialog(null,task.printTaskDetails());
                      count++;        
                  }
                  task = new Task_class(optionselect, taskNumber, totaltasks, taskdescription, taskname, developerdetails,duration);
                  JOptionPane.showMessageDialog(null,"The total number of hours will be displayed in the next textbox");
                  JOptionPane.showMessageDialog(null,task.returnTotalHours());
              }
              case 2 -> JOptionPane.showMessageDialog(null,"Coming soon");
              case 3 -> JOptionPane.showMessageDialog(null,"Good bye.");
              default -> JOptionPane.showMessageDialog(null,"Please restart the program you are only allowed to choose one of the given 3 Options");
                  }
      }else{
          if (!loggedIn)
                  {
                  JOptionPane.showMessageDialog(null,"Please restart the program the your login was unsuccessful");
          }      
      }      
    }        

    



//    private static class Login extends mainlogin {
//
//        private Login(String password1, String Lastname1, String ditebogo, String nkwana) {
//        }
//
//        static {
//        }
//
//        private void checkUsername() {
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        }
//
//        private void checkPasswordcomplexity() {
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        }
//
//        private Object registerUser() {
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        }
//
//        private Object loginUser() {
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        }
//
//        private Object returnloginstatus() {
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        }
    }

 
    
    
