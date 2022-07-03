package tech.msharifi.Contact;

public class Contact {

	    private String fname;
	    private String lname;
	    private String email;
	    private String phoneNum;
	 
	    public Contact() {
	        super();
	    }
	 
	    public Contact(String fname, String lname, String email, String phoneNum) {
	        super();
	        this.setFname(fname);
	        this.setLname(lname);
	        this.setEmail(email);
	        this.setPhoneNum(phoneNum);
	   }

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhoneNum() {
			return phoneNum;
		}

		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}

		
		

}

