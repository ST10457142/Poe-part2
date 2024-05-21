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

    

class Login {

 
        

        
        public boolean checkUsername(String username) {
          
           boolean user = false;
           
            for (int i = 0; i < username.length(); i++) {
                char u = username.charAt(i);
                
                if(u == 95 || username.length() == 5 ){
                
                        user = true;
                
                }
                else{
                    
                    user = false;
                }
                
            }
            
            if(user ){
                
                JOptionPane.showMessageDialog(null, " correctly formatted");
            }
            else{
            JOptionPane.showMessageDialog(null, "Not correctly formatted");
            }
           
        return user;
        }

        public boolean checkPasswordcomplexity(String password) {
            
            boolean pass = false;
            
            for (int i = 0; i < password.length() ; i++) {
                
                if(password.length() >= 8){
                    
                    pass = true;
                }
                else{
                    pass = false;
                }
                
            }
            
            if(pass){
                JOptionPane.showMessageDialog(null, "Correctly formatted");
            }
            else{
            
                JOptionPane.showMessageDialog(null, "not Correctly formatted");
            }
            
        return pass;
        }

        public String registerUser( boolean usename, boolean password) {
            
           
            if(usename && password){
                
                JOptionPane.showMessageDialog(null, "Succefully registerd");
           
                
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Unsuccefully registerd");
                
            }
            
            
        return "";
        }

        public boolean loginUser(String username, String password, String LoginUsername, String LoginPassword) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
            boolean match = true;
            
            if(LoginUsername.equals(username) && LoginPassword.equals(password) ){
                match = true;
            }
            
            else{
                match = false;
            }
            
            returnloginstatus(match);
            
        return match;
        }

        public String returnloginstatus(boolean loggedIn) {
           
            if(loggedIn){
            
                JOptionPane.showMessageDialog(null, "A successful login");
            }
            else{
                
                JOptionPane.showMessageDialog(null, "A failed login");
                
            }
            
        return "";
        }



}

   
