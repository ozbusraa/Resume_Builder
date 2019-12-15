package Info;

public class ReferenceInfo implements Reference {
    String name="";
    String lastname="";
    String telNo="";
    String mailAddress="";
    Reference nextReferenceInfo=null;

    public void setName(String name) {
        this.name = name;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
    public void setNextReferenceInfo(Reference nextReferenceInfo) {
        this.nextReferenceInfo = nextReferenceInfo;
    }

    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public String getTelNo() {
        return telNo;
    }
    public String getMailAddress() {
        return mailAddress;
    }
    public Reference getNextReferenceInfo() {
        return nextReferenceInfo;
    }
}
