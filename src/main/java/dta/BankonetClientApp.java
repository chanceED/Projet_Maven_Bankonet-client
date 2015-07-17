package dta;

public class BankonetClientApp {

	public static void main(String[] args) {

  RestServerInfoHelper restServerInfoHelper=new RestServerInfoHelper();

  
  RestServerInfo restServerInfo=new RestServerInfo();
  restServerInfo= restServerInfoHelper.getRestServerInfo();
 System.out.println( restServerInfo.getBaseUrl());
  
  

  
  
  
	}

}
