import Info.*;
import Resume.Resume;
import Resume.ResumeFactory;

public class Main {
    public static void main(String[] args) {

        //User user=new User();
        UserInterface user=new ProxyUser();
        ResumeFactory rf= new ResumeFactory();

        Resume resume= rf.produceResume(user.getChoosenResumeType());
        resume.use();

        // user education,job,projects seçti, skill seçmedi.
        user.setEducationInfo(new noInfo());
        user.setEducationInfo(new HighSchoolInfo());




    }
}
