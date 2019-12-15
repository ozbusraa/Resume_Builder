import Info.*;
import Resume.Resume;
import Resume.ResumeFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = (JPanel) frame.getContentPane();
        panel.setLayout(null);


        JLabel title = new JLabel("Resume Builder");
        panel.add(title);
        Dimension size = title.getPreferredSize();
        title.setBounds(140, 0, size.width, size.height);
        JLabel getStarted = new JLabel("Get Started");
        panel.add(getStarted);
        Dimension size1 = title.getPreferredSize();
        getStarted.setBounds(150, 150, size1.width, size1.height);
        JButton button = new JButton("Start!");
        panel.add(button);
        Dimension size2 = button.getPreferredSize();
        button.setBounds(150, 300, size2.width, size2.height);
        UserInterface user=new ProxyUser();


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PersonalInfo(user).setVisible(true);
                frame.setVisible(false);
            }
        });

        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

       // user.printEducationInfo1();
        //User user=new User();
        //UserInterface user=new ProxyUser();

        // Page 1: (enter personal info)
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
            user.setEducationInfo(e);
            e.setSchoolName("Erbakır Fen Lisesi");
e.setGpa("dsf");
e.setStartDate("df");
e.setFinishDate("sdf");
e.setDepartment("sdf");
user.save();
        user.printEducationInfo1();
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
            //resume.use();

        // Page 7: (Choose Layout)


        // PAge 8: (CV)

    }
}
