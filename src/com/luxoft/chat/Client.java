package com.luxoft.chat;

import java.net.*;
import java.nio.CharBuffer;
import java.io.*;
import java.util.*;

public class Client {
	public static void main(String args[]) {
		try {
			// Open your connection to a server, at port 5432
			// localhost used here
			Socket s1 = new Socket("127.0.0.1", 5432);
			
			
			
			// Get output stream associated with the socket
			OutputStream s1out = s1.getOutputStream();
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(s1out));
			// Send your string!
			System.out.println("Client1: ");
			String str = null;

			Scanner sc = new Scanner(System.in);

			str = sc.nextLine();

			bw.write(str,0,str.length());

			// System.out.println(str);
			// Close the connection, but not the server socket
			bw.close();
			s1.close();
			// System.out.println("test2"); 
			
			
			
		} catch (ConnectException connExc) {
			System.err.println("Could not connect.");
		} catch (IOException e) {
			e.printStackTrace();
		} // END of try-catch
	} // END of main method
} // END of SimpleClient program

