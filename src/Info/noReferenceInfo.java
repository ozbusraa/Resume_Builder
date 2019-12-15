package Info;

import java.io.BufferedWriter;

public class noReferenceInfo implements Reference {
    String name="";
    String lastname="";
    String telNo="";
    String mailAddress="";
    Reference nextReferenceInfo=null;

    public void setName(String name) {    }
    public void setLastname(String lastname) {    }
    public void setTelNo(String telNo) {    }
    public void setMailAddress(String mailAddress) {    }
    public void setNextReferenceInfo(Reference nextReferenceInfo) {    }

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

    @Override
    public void print_Header1(BufferedWriter writer) {

    }

    @Override
    public void print_Header2(BufferedWriter writer) {

    }

    @Override
    public void print_Header3(BufferedWriter writer) {

    }

    @Override
    public void print_Closer(BufferedWriter writer) {

    }

    @Override
    public void print_1(Reference reference, BufferedWriter writer) {

    }

    @Override
    public void print_2(Reference reference, BufferedWriter writer) {

    }

    @Override
    public void print_3(Reference reference, BufferedWriter writer) {

    }

    @Override
    public void write(BufferedWriter writer, String text) {

    }
}
