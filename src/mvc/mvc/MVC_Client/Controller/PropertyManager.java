package mvc.MVC_Client.Controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {

	private static PropertyManager INSTANCE = null;
        String address = "";
        int port = 0;
	
	private PropertyManager(){
            address = "127.0.0.1";
            port = 50800;
	}
	
	public static PropertyManager getInstance() throws IOException{
		if(INSTANCE == null){
			INSTANCE = new PropertyManager();
		}
		return INSTANCE;
	}
	
	public String getAddress(){
		return address;
	}
	
	public int getPort(){
		return port;
	}
	
}
