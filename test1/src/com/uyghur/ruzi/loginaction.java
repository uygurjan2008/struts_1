package com.uyghur.ruzi;

public class loginaction {
private String username;
private String userpass;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUserpass() {
	return userpass;
}
public void setUserpass(String userpass) {
	this.userpass = userpass;
}

public String execute() {

if(username.equals("1")&&userpass.equals("1"))
{
	return "success";
	
}else{
	
	return "fail";
	
}


}

}
