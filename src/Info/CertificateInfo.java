package Info;

import java.io.BufferedWriter;
import java.io.IOException;

public class CertificateInfo implements Certificates {

    String certificateName="";
    String year="";
    String givenOrganisation="";
    Certificates nextCertificate=null;

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void setGivenOrganisation(String givenOrganisation) {
        this.givenOrganisation = givenOrganisation;
    }
    public void setNextCertificate(Certificates nextCertificate) {
        this.nextCertificate = nextCertificate;
    }

    public String getCertificateName() {
        return certificateName;
    }
    public String getYear() {
        return year;
    }
    public String getGivenOrganisation() {
        return givenOrganisation;
    }
    public Certificates getNextCertificate() {
        return nextCertificate;
    }

    @Override
    public void print_Header1(BufferedWriter writer) {
        String text= "<h2>Certificates</h2>";
         write(writer,text);
    }

    @Override
    public void print_Header2(BufferedWriter writer) {
        String text="<div class=\"section\">\n" +
                "\t\t<h2>Certificates</h2>\n" +
                "\t\t\t<ul>";
        write(writer,text);
    }

    @Override
    public void print_Header3(BufferedWriter writer) {
        String text="<div class=\"section\">\n" +
                "\t\t<h2>Certificates</h2>";

        write(writer,text);
    }

    @Override
    public void print_Closer(BufferedWriter writer) {
        String text="</div>";
        write(writer,text);
    }

    @Override
    public void print_1(Certificates certificates, BufferedWriter writer) {
        String text="<ul>\n" +
                "\t\t<li>"+certificates.getCertificateName()+", "+certificates.getYear()+", "+certificates.getGivenOrganisation()+"</li>\n" +
                "\t</ul>";
        while(certificates.getNextCertificate()!=null) {
            certificates = certificates.getNextCertificate();
            text=text+"<ul>\n" +
                    "\t\t<li>"+certificates.getCertificateName()+", "+certificates.getYear()+", "+certificates.getGivenOrganisation()+"</li>\n" +
                    "\t</ul>";
        }
        write(writer,text);
    }

    @Override
    public void print_2(Certificates certificates, BufferedWriter writer) {
        String text="<li>"+certificates.getCertificateName()+", "+certificates.getYear()+", "+certificates.getGivenOrganisation()+"</li>";

        while(certificates.getNextCertificate()!=null) {
            certificates = certificates.getNextCertificate();
            text=text+"<li>"+certificates.getCertificateName()+", "+certificates.getYear()+", "+certificates.getGivenOrganisation()+"</li>";
        }
        write(writer,text);
    }

    @Override
    public void print_3(Certificates certificates, BufferedWriter writer) {
        String text="<div class=\"content\">\n" +
                "\t\t\t<ul>\n" +
                "\t\t\t\t<li>"+certificates.getCertificateName()+", "+certificates.getYear()+", "+certificates.getGivenOrganisation()+"</li>\n" +
                "\t\t\t</ul>\n" +
                "\t\t</div>";
            while(certificates.getNextCertificate()!=null) {
                certificates = certificates.getNextCertificate();
                text=text+"<div class=\"content\">\n" +
                        "\t\t\t<ul>\n" +
                        "\t\t\t\t<li>"+certificates.getCertificateName()+", "+certificates.getYear()+", "+certificates.getGivenOrganisation()+"</li>\n" +
                        "\t\t\t</ul>\n" +
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
