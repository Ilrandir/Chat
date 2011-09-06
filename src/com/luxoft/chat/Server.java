package com.luxoft.chat;
import java.net.*;
import java.io.*;

public class Server {

	   public static void main(String args[]) {
	       ServerSocket s = null;
	       // Register your service on port 5432
	       try {
	          s = new ServerSocket(5432);
	       } catch (IOException e) {
	          e.printStackTrace();
	       }
	       // Run the listen/accept loop forever
	       while (true) {
	           try {// Wait here and listen for a connection
	              Socket s1 = s.accept();


	  			// Get an input stream from the socket
	  			InputStream is = s1.getInputStream();
	  			// Decorate it with a "data" input stream
	  			InputStreamReader in = new InputStreamReader(is);
	  			// Read the input and print it to the screen
	  			// System.out.println("String is: "+dis.toString());
	  			// String s = dis.readUTF();

	  			System.out.println("in: " + in);
	  			int ch = 0;
	  			StringBuffer sb = new StringBuffer();
	  			while ( (ch = in.read()) > 0){
	  				System.out.print(ch);
	  				Character c = new Character((char)ch);
	  				System.out.println("\t -> " + c);
	  				sb.append(c);
	  			}
	  			
	  			System.out.println("Server resp: " + sb);

	  			// When done, just close the steam and connection
	  			in.close();
	  			s1.close();
	              
	              
	              
	           
	           } catch (IOException e) {
	              e.printStackTrace();
//	              System.out.println("Exept");
	           } // END of try-catch
	       } // END of while(true)

	   } // END of main method

} // END of SimpleServer program
	