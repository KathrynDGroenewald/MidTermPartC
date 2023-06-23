/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author kathr
 */


public class TestUserProfile {
    
    public static void main(String[] args){ 
                
        Scanner input = new Scanner(System.in); 
       
        System.out.println("--- Creating a new profile ---");
        
        //get userID
        System.out.println("Please enter your name: ");
        String userID = input.nextLine();
        
        //get userGenre 
        System.out.println("The genre options are: \"Comedy\", \"Drama\", \"Action\", "
                + "\"Mystery\""); 
        System.out.println("Please enter your favorite genre: ");
        String userGenre = input.nextLine();
        
        //create userprofile object
        UserProfile newUser = new UserProfile(userID, userGenre);
        
        //display message that account was created
        System.out.println(newUser.getUserID() + " your account has been "
                + "created. Your favorite genre is " + newUser.getGenre());
        
      
        

        
        
    }
}
