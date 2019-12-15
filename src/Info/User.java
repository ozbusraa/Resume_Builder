package Info;

import java.io.BufferedWriter;
import java.io.IOException;

public class User implements UserInterface {
    String choosenResumeType;
    String name;
    String lastName;
    String email;
    String telNo;
    String address;
    EducationInfo educationInfo;
    WorkExperienceInfo workExperienceInfo;
    SkillsInfo skillsInfo;
    VolunteerInfo volunteerInfo;
    Hobbies hobbies;
    Project project;
    Certificates certificates;
    Reference reference;

    public void setHobbies(Hobbies hobbies) {
        this.hobbies = hobbies;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setCertificates(Certificates certificates) {
        this.certificates = certificates;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    @Override
    public void printEducationInfo1(BufferedWriter writer) {
        educationInfo.print_Header1(writer);
        educationInfo.print_1(educationInfo,writer);
    }

    @Override
    public void printEducationInfo2(BufferedWriter writer) {
        educationInfo.print_Header2(writer);
        educationInfo.print_2(educationInfo,writer);
        educationInfo.print_Closer2(writer);
    }

    @Override
    public void printEducationInfo3(BufferedWriter writer) {
        educationInfo.print_Header3(writer);
        educationInfo.print_3(educationInfo,writer);
        educationInfo.print_Closer3(writer);
    }

    @Override
    public void printWorkInfo1(BufferedWriter writer) {
        workExperienceInfo.print_Header1(writer);
        workExperienceInfo.print_1(workExperienceInfo,writer);
    }

    @Override
    public void printWorkInfo2(BufferedWriter writer) {
        workExperienceInfo.print_Header2(writer);
        workExperienceInfo.print_2(workExperienceInfo,writer);
        workExperienceInfo.print_Closer2(writer);
    }

    @Override
    public void printWorkInfo3(BufferedWriter writer) {
        workExperienceInfo.print_Header3(writer);
        workExperienceInfo.print_3(workExperienceInfo,writer);
        workExperienceInfo.print_Closer3(writer);
    }


    @Override
    public void printCertificateInfo1(BufferedWriter writer) {
        certificates.print_Header1(writer);
        certificates.print_1(certificates,writer);

    }

    @Override
    public void printCertificateInfo2(BufferedWriter writer) {
        certificates.print_Header2(writer);
        certificates.print_2(certificates,writer);
        certificates.print_Closer(writer);
    }

    @Override
    public void printCertificateInfo3(BufferedWriter writer) {
        certificates.print_Header3(writer);
        certificates.print_3(certificates,writer);
        certificates.print_Closer(writer);
    }

    @Override
    public void printReferenceInfo1(BufferedWriter writer) {
        reference.print_Header1(writer);
        reference.print_1(reference,writer);

    }

    @Override
    public void printReferenceInfo2(BufferedWriter writer) {
        reference.print_Header2(writer);
        reference.print_2(reference,writer);
        reference.print_Closer(writer);
    }

    @Override
    public void printReferenceInfo3(BufferedWriter writer) {
        reference.print_Header3(writer);
        reference.print_3(reference,writer);
        reference.print_Closer(writer);
    }

    @Override
    public void printVolunteerInfo1(BufferedWriter writer) {
         volunteerInfo.print_Header1(writer);
         volunteerInfo.print_1(volunteerInfo,writer);
    }

    @Override
    public void printVolunteerInfo2(BufferedWriter writer) {
        volunteerInfo.print_Header2(writer);
        volunteerInfo.print_2(volunteerInfo,writer);
        volunteerInfo.print_Closer(writer);

    }

    @Override
    public void printVolunteerInfo3(BufferedWriter writer) {
        volunteerInfo.print_Header3(writer);
        volunteerInfo.print_3(volunteerInfo,writer);
        volunteerInfo.print_Closer(writer);
    }

    @Override
    public void printSkillInfo1(BufferedWriter writer) {
        skillsInfo.print_Header1(writer);
        skillsInfo.print_1(skillsInfo,writer);

    }

    @Override
    public void printSkillInfo2(BufferedWriter writer) {
        skillsInfo.print_Header2(writer);
        skillsInfo.print_2(skillsInfo,writer);
        skillsInfo.print_Closer(writer);
    }

    @Override
    public void printSkillInfo3(BufferedWriter writer) {
        skillsInfo.print_Header3(writer);
        skillsInfo.print_3(skillsInfo,writer);
        skillsInfo.print_Closer(writer);
    }

    @Override
    public void printHobbyInfo1(BufferedWriter writer) {
        hobbies.print_Header1(writer);
        hobbies.print_1( hobbies,writer);
    }

    @Override
    public void printHobbyInfo2(BufferedWriter writer) {
        hobbies.print_Header2(writer);
        hobbies.print_2( hobbies,writer);
        hobbies.print_Closer(writer);
    }

    @Override
    public void printHobbyInfo3(BufferedWriter writer) {
        hobbies.print_Header3(writer);
        hobbies.print_3( hobbies,writer);
        hobbies.print_Closer(writer);
    }

    @Override
    public void printProjectInfo1(BufferedWriter writer) {
        project.print_Header2(writer);
        project.print_2(  project,writer);
    }

    @Override
    public void printProjectInfo2(BufferedWriter writer) {
        project.print_Header2(writer);
        project.print_2(  project,writer);
        project.print_Closer2(writer);
    }

    @Override
    public void printProjectInfo3(BufferedWriter writer) {
        project.print_Header3(writer);
        project.print_3( project,writer);
        project.print_Closer3(writer);
    }

    @Override
    public void printPersonalInfo1(BufferedWriter writer) {
        String text="<h1>"+name+" "+lastName+"</h1>\n" +
                "\t<div id=\"address\">\n" +
                "\t\t<div id=\"first\">\n" +
                "\t\t\t<h3>Credentials</h3>\n" +
                "\t\t\t3A, Your Major, <abbr title=\"University of Waterloo\">UW</abbr><br>\n" +
                "\t\t\t<a href=\"mailto:"+email+"\">"+email+"</a><br>\n" +
                "\t\t\t<a href="+telNo+">"+telNo+"</a>\n" +
                "\t\t</div>\n" +
                "\t\t<div>\n" +
                "\t\t\t<h3>Address</h3>\n" +
                "\t\t\t"+address+"\n" +
                "\t\t</div>\n" +
                "\t</div>";
        try {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void printPersonalInfo2(BufferedWriter writer) {
        String text= "<div id=\"address\">"+address+"</div>\n" +
                "\t<h1>"+name+" "+lastName+"</h1>\n" +
                "\t<div id=\"contact\">"+telNo+" <a href=\"mailto:"+email+"\">"+email+"</a></div>";
        try {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void printPersonalInfo3(BufferedWriter writer) {
String text="<h1>"+name+" "+lastName+"</h1>\n" +
        "\t<div id=\"address\">\n" +
        "\t\t<div>\n" +
        "\t\t\t<h3>Local Address</h3>\n" +
        "\t\t\t"+address+"<br>\n" +
        "\t\t</div>\n" +
        "\t\t<div id=\"first\">\n" +
        "\t\t\t<h3>Mail</h3>\n" +
        "\t\t\t<a href=\\\"mailto:"+email+"\">"+email+"</a><br>\n" +
        "\t\t</div>\n" +
        "\t\t<div>\n" +
        "\t\t\t<h3>Phone</h3>\n" +
        "\t\t\t"+telNo+"\n" +
        "\t\t</div>\n" +
        "\t</div>\n" +
        "\t";
        try {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setChoosenResumeType(String choosenResumeType) {
        this.choosenResumeType = choosenResumeType;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getChoosenResumeType() {
        return choosenResumeType;
    }

    public void setEducationInfo(EducationInfo educationInfo) {
        this.educationInfo = educationInfo;
    }

    public void setWorkExperienceInfo(WorkExperienceInfo workExperienceInfo) {
        this.workExperienceInfo = workExperienceInfo;
    }

    public void setSkillsInfo(SkillsInfo skillsInfo) {
        this.skillsInfo = skillsInfo;
    }

    public void setVolunteerInfo(VolunteerInfo volunteerInfo) {
        this.volunteerInfo = volunteerInfo;
    }
    public void createNewEducationInfo(EducationInfo a){
        EducationInfo educationInfo1;
    }

    @Override
    public void save() {
        System.out.println("User is created");
    }
}
