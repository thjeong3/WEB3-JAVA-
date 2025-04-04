public class Member {
    private String phoneNo;
    private String email;

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Member(String phoneNo, String email) {
        this.phoneNo = phoneNo;
        this.email = email;
    }
    @Override
    public String toString(){
        return "{ phoneNo = '" + phoneNo +"', email='" + email + "' }";
    }

}