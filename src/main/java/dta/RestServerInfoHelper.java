package dta;

import java.util.ResourceBundle;

public class RestServerInfoHelper {

	
public	RestServerInfo getRestServerInfo(){
		
		ResourceBundle serveProps=ResourceBundle.getBundle("server");
		String protocol=serveProps.getString("protocol");
		String host=serveProps.getString("host");
		String port=serveProps.getString("port");
		
		RestServerInfo restServerInfo=new RestServerInfo(protocol,host,port);
		 return restServerInfo;
		}

}
