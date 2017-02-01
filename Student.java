package co.hibernateproject;

public class Student {
	Integer sid;
	String sname, email;
	
	public Student(){}
		
	public Student (Integer sid, String sname, String email){
		this.sid =sid;
		this.sname = sname;
		this.email =email;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString(){
		return sid + "\t"+ sname  + "\t" + email;
		
	}

}
