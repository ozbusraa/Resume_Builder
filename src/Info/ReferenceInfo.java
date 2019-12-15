package Info;

import java.io.BufferedWriter;
import java.io.IOException;

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

    @Override
    public void print_Header1(BufferedWriter writer) {
        String text="<h2>References</h2>";
        write(writer,text);
    }

    @Override
    public void print_Header2(BufferedWriter writer) {
        String text="<div class=\"section\">\n" +
                "\t\t<h2>References</h2>";
        write(writer,text);
    }

    @Override
    public void print_Header3(BufferedWriter writer) {
        String text="\t<div class=\"section\">\n" +
                "\t\t<h2>References</h2>";
        write(writer,text);
    }

    @Override
    public void print_Closer(BufferedWriter writer) {
        String text="</div>";
        write(writer,text);
    }

    @Override
    public void print_1(Reference reference, BufferedWriter writer) {
        String text="<ul>\n" +
                "\t\t<li>"+reference.getName()+", "+reference.getLastname()+", "+reference.getTelNo()+", "+reference.getMailAddress()+"</li>\n" +
                "\t</ul>";
        while(reference.getNextReferenceInfo()!=null) {
            reference= reference.getNextReferenceInfo();
            text += "<ul>\n" + "\t\t<li>" + reference.getName() + ", " + reference.getLastname() + ", " + reference.getTelNo() + ", " + reference.getMailAddress() + "</li>\n" + "\t</ul>";
        }
        write(writer,text);
    }

    @Override
    public void print_2(Reference reference, BufferedWriter writer) {
       print_1(reference,writer);
    }

    @Override
    public void print_3(Reference reference, BufferedWriter writer) {
        String text="<div class=\"content\">\n" +
                "<ul>\n" +
                "\t\t<li>"+reference.getName()+", "+reference.getLastname()+", "+reference.getTelNo()+", "+reference.getMailAddress()+"</li>\n" +
                "\t</ul>"+
                "\t\t</div>";
        while(reference.getNextReferenceInfo()!=null) {
            reference= reference.getNextReferenceInfo();
            text +="<div class=\"content\">\n" + "<ul>\n" + "\t\t<li>" + reference.getName() + ", " + reference.getLastname() + ", " + reference.getTelNo() + ", " + reference.getMailAddress() + "</li>\n" + "\t</ul>"+
                    "\t\t</div>";
        }
        write(writer,text);
    }

    @Override
    public void write(BufferedWriter writer, String text) {
        try {
            writer.write(text);
            writer.newLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
