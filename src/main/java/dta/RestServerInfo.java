package dta;

public class RestServerInfo {

	private String protocol;
	private String host;
	private String port;
	

	

	
	
	public RestServerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestServerInfo(String protocol, String host, String port) {
		this.protocol=protocol;
		this.host=host;
		this.port=port;
	}

	

	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	public String getBaseUrl(){
		String URL="null";
		URL=protocol+"://"+host+":"+port;
		return URL;
	}
	
	
}
