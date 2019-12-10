import Info.*;
import Resume.Resume;
import Resume.ResumeFactory;

public class Main {
    public static void main(String[] args) {

        //User user=new User();
        UserInterface user=new ProxyUser();


        // PAge 1: (enter personal info)
            user.setName("Büşra");
            user.setEmail("dfsdf");
            user.setAddress("dslfklks");
            user.setTelNo("flsdkjfl");
            // Press save

        //Page 2: (choose infos)
            // user education,job,projects seçti, skill seçmedi.
                SkillsInfo s=new noSkillInfo();
                EducationInfo e=new SchoolInfo();
                WorkExperienceInfo j=new WorkExperience();
                VolunteerInfo w= new Volunteer();

        //Page 3: (Enter Education Info)

            e.setSchoolName("Erbakır Fen Lisesi");

            //if press Add new
            EducationInfo u=new SchoolInfo();
            u.setSchoolName("sabanj");
            e.setNextEducationInfo(u);

            // if press next
            u.setNextEducationInfo(null);

        //PAge 4: (Enter Job Info)

        //Page 5: (Enter Volunteer)



        // user education,job,projects seçti, skill seçmedi.
        user.setEducationInfo(e);
        user.setWorkExperienceInfo(j);
        user.setSkillsInfo(s);
        user.setVolunteerInfo(w);

        user.save();

        // Page 6: (Choose CV type)
            ResumeFactory rf= new ResumeFactory();
            Resume resume= rf.produceResume(user.getChoosenResumeType());
            resume.use();

        // Page 7: (Choose Layout)


        // PAge 8: (CV)

    }
}
