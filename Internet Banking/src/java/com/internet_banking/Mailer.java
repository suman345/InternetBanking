/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internet_banking;
import static java.lang.System.out;
import java.util.Properties;  
  
import javax.mail.*;  
import javax.mail.internet.InternetAddress;  
import javax.mail.internet.MimeMessage;  
/**
 *
 * @author Sumanpc
 */
public class Mailer {
     public static void send(String to,String subject,String msg){  
  
final String user="nldbbank@gmail.com";//change accordingly  
final String pass="suman7318874161";  
  
//1st step) Get the session object    
Properties props = new Properties();  
props.put("mail.smtp.auth", "true");  
props.put("mail.smtp.starttls.enable", "true"); 
props.put("mail.smtp.host", "smtp.gmail.com");//change accordingly  
props.put("mail.smtp.port","587");
  
Session session = Session.getDefaultInstance(props,  
 new javax.mail.Authenticator() {  
  @Override
  protected PasswordAuthentication getPasswordAuthentication() {  
   return new PasswordAuthentication(user,pass);  
   }  
});  
//2nd step)compose message  
try {  
 MimeMessage message = new MimeMessage(session);  
 message.setFrom(new InternetAddress(user));  
 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
 message.setSubject(subject);  
 //message.setText(msg);  
  message.setContent(msg, "text/html"); 
 //3rd step)send message  
 Transport.send(message);  
  
 out.println("Done");  
  
 } catch (MessagingException e) {  
    throw new RuntimeException(e);  
 }  
      
}  
}
