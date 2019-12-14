import Info.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ChooseInfo extends JFrame {
    JPanel panel;

    public ChooseInfo(UserInterface user){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(null);

        JLabel title = new JLabel("Choose Info");
        panel.add(title);
        Dimension size = title.getPreferredSize();
        title.setBounds(140, 50, size.width, size.height);


        JCheckBox education = new JCheckBox("Education");
        education.setBounds(50,100, 150,25);
        JCheckBox job = new JCheckBox("Job");
        job.setBounds(50,125, 50,25);
        JCheckBox projects = new JCheckBox("Projects");
        projects.setBounds(50,150, 75,25);
        JCheckBox skills = new JCheckBox("Skills");
        skills.setBounds(50,175, 100,25);
        JCheckBox hobbies = new JCheckBox("Hobbies");
        hobbies.setBounds(50,200, 150,25);
        JCheckBox volunteer = new JCheckBox("Volunteer Works");
        volunteer.setBounds(50,225, 250,25);
        JCheckBox certificate = new JCheckBox("Certificates");
        certificate.setBounds(50,250, 150,25);
        JCheckBox reference = new JCheckBox("References");
        reference.setBounds(50,275, 150,25);
        JButton next = new JButton("Next");
        next.setBounds(250,290,100,25);
        this.add(education);
        this.add(job);
        this.add(skills);
        this.add(projects);
        this.add(hobbies);
        this.add(volunteer);
        this.add(certificate);
        this.add(reference);
        this.add(next);

        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!education.isSelected()&&!job.isSelected()&&!skills.isSelected()&&!projects.isSelected()&&!hobbies.isSelected()
                    &&!volunteer.isSelected()&&!certificate.isSelected()&&!reference.isSelected()){
                    String message = "Select at least one to go to the next step";
                    JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    EducationInfo eI;
                    WorkExperienceInfo j;
                    SkillsInfo s;
                    VolunteerInfo v;
                    Project p;
                    Certificates c;
                    Reference r;
                    Hobbies h;
                    // ArrayList<Integer> array= new ArrayList<Integer>(8);
                    Boolean[] array = new Boolean[8];
                    if(education.isSelected()){
                        eI=new SchoolInfo();
                        array[0] = Boolean.TRUE;

                    }else{
                        eI=new noSchoolInfo();
                        array[0] =Boolean.FALSE;
                    }
                    if(job.isSelected()){
                        j=new WorkExperience();
                        array[1] = Boolean.TRUE;
                    }else{
                        j=new noWorkExperienceInfo();
                        array[1] = Boolean.FALSE;
                    }
                    if(skills.isSelected()){
                        s=new Skills();
                        array[2] = Boolean.TRUE;
                    }else{
                        s=new noSkillInfo();
                        array[2] = Boolean.FALSE;
                    }
                    if(volunteer.isSelected()){
                        v= new Volunteer();
                        array[5] = Boolean.TRUE;
                    }else{
                        v= new noVolunteerInfo();
                        array[5] = Boolean.FALSE;
                    }
                    if(projects.isSelected()){
                        p=new ProjectInfo();
                        array[3] = Boolean.TRUE;
                    }else{
                        p= new noProjectInfo();
                        array[3] = Boolean.FALSE;
                    }
                    if(certificate.isSelected()){
                        c=new CertificateInfo();
                        array[6] = Boolean.TRUE;
                    }else{
                        c=new noCertificateInfo();
                        array[6] = Boolean.FALSE;
                    }
                    if(reference.isSelected()){
                        r=new ReferenceInfo();
                        array[7] = Boolean.TRUE;
                    }else{
                        r=new noReferenceInfo();
                        array[7] = Boolean.FALSE;
                    }
                    if(hobbies.isSelected()){
                        h=new HobbiesInfo();
                        array[4] = Boolean.TRUE;
                    }else{
                        h=new noHobbyInfo();
                        array[4] = Boolean.FALSE;
                    }

                    new EducationalInfo(user,eI,j,s,v,p,c,r,h,array);


                    dispose();
                }
            }
        });
    }



}
