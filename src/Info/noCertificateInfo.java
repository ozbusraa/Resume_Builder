package Info;

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
}
