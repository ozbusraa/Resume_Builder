package Info;

import java.io.BufferedWriter;

public interface Certificates {


    void setCertificateName(String certificateName);
    void setYear(String year);
    void setGivenOrganisation(String givenOrganisation);

    void setNextCertificate(Certificates nextCertificate);

    String getCertificateName();
    String getYear();
    String getGivenOrganisation();
    Certificates getNextCertificate();

    void print_Header1(BufferedWriter writer);
    void print_Header2(BufferedWriter writer);
    void print_Header3(BufferedWriter writer);
    void print_Closer(BufferedWriter writer);
    void print_1(Certificates certificates, BufferedWriter writer);
    void print_2(Certificates certificates, BufferedWriter writer);
    void print_3(Certificates certificates, BufferedWriter writer);
    void write(BufferedWriter writer,String text);
}
