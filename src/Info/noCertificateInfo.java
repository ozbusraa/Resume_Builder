package Info;

import java.io.BufferedWriter;

public class noCertificateInfo implements Certificates {
    String certificateName="";
    String year="";
    String givenOrganisation="";
    Certificates nextCertificate=null;

    public void setCertificateName(String certificateName) {    }
    public void setYear(String year) {    }
    public void setGivenOrganisation(String givenOrganisation) {    }
    public void setNextCertificate(Certificates nextCertificate) {    }

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
    public void print_1(Certificates certificates, BufferedWriter writer) {

    }

    @Override
    public void print_2(Certificates certificates, BufferedWriter writer) {

    }

    @Override
    public void print_3(Certificates certificates, BufferedWriter writer) {

    }

    @Override
    public void write(BufferedWriter writer, String text) {

    }
}
