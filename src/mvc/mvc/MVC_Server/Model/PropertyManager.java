package mvc.MVC_Server.Model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {

	private static PropertyManager INSTANCE = null;
        int port = 0;
	
	private PropertyManager(){
            port = 50800;
	}
	
	public static PropertyManager getInstance() throws IOException{
		if(INSTANCE == null){
			INSTANCE = new PropertyManager();
		}
		return INSTANCE;
	}
	
	public int getPort(){
		return port;
	}
	
}
