package Info;

public interface Certificates {


    void setCertificateName(String certificateName);
    void setYear(String year);
    void setGivenOrganisation(String givenOrganisation);

    void setNextCertificate(Certificates nextCertificate);

    String getCertificateName();
    String getYear();
    String getGivenOrganisation();
    Certificates getNextCertificate();
}
