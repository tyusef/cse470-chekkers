package mvc.MVC_Client.Controller;

import javax.swing.*;
import mvc.MVC_Client.View.BoardPanel;

/**
 * Client Application -> Main
 * @author Keerthikan
 * 
 * Main
 */
public class ClientMain {
	
	public static void main(String[] args) {
		ClientApp client = new ClientApp();
		client.setTitle("Checkers");
		client.pack();
		client.setVisible(true);
		client.setLocation(250, 150);
		client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
