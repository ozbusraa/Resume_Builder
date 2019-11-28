import Info.EducationInfo;
import Info.HighSchoolInfo;
import Info.User;
import Info.noInfo;
import Resume.Resume;
import Resume.ResumeFactory;

public class Main {
    public static void main(String[] args) {

        User user=new User();
        ResumeFactory rf= new ResumeFactory();

        Resume resume= rf.produceResume(user.choosenResumeType);

        resume.use();

        user.setEducationInfo(new noInfo());
        user.showEducationInfo();

        user.setEducationInfo(new HighSchoolInfo());
        user.showEducationInfo();

    }
}
