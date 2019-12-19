import Info.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VolunteerPage  extends JFrame {

    private JPanel panel;

    public VolunteerPage(UserInterface user, EducationInfo eI, WorkExperienceInfo j, SkillsInfo s, VolunteerInfo v,VolunteerInfo firstv, Project p, Certificates c, Reference r, Hobbies h, Boolean[] array){
        this.setVisible(array[5]);
        if(array[5]==Boolean.FALSE){
            new CertificatesPage(user,eI,j,s,v,p,c,c,r,h,array);
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(null);

        JLabel title = new JLabel("Volunteer Projects Info");
        panel.add(title);
        Dimension size = title.getPreferredSize();
        title.setBounds(140, 0, size.width, size.height);


        JLabel projectName = new JLabel("Project Name:");
        panel.add(projectName);
        Dimension size2 = projectName.getPreferredSize();
        projectName.setBounds(0, 50, size2.width, size2.height);

        JTextField inputProjectName = new JTextField(15);
        panel.add(inputProjectName);
        Dimension size8 = inputProjectName.getPreferredSize();
        inputProjectName.setBounds(100, 50, size8.width, size8.height);


        JLabel description = new JLabel("Description:");
        panel.add(description);
        Dimension size6 = description.getPreferredSize();
        description.setBounds(0, 100, size6.width, size6.height);

        JTextField inputDescription = new JTextField(15);
        panel.add(inputDescription);
        Dimension size12 = inputDescription.getPreferredSize();
        inputDescription.setBounds(100, 100, size12.width, size12.height);



        JButton saveButton = new JButton("Next");
        panel.add(saveButton);
        Dimension size7 = saveButton.getPreferredSize();
        saveButton.setBounds(300, 300, size7.width, size7.height);

        JButton buttonAddNew = new JButton("Add New");
        panel.add(buttonAddNew);
        Dimension size13 = buttonAddNew.getPreferredSize();
        buttonAddNew.setBounds(100, 300, size13.width, size13.height);

//        JButton goBackButton = new JButton("Go Back");
//        panel.add(goBackButton);
//        Dimension size14 = goBackButton.getPreferredSize();
//        goBackButton.setBounds(200, 300, size14.width, size14.height);

        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        //   this.setVisible(true);


        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                v.setProjectName(inputProjectName.getText());
                v.setDescription(inputDescription.getText());
                v.setNextVolunteerInfo(null);
                user.setVolunteerInfo(firstv);
                new CertificatesPage(user,eI,j,s,v,p,c,c,r,h,array);
                dispose();
            }
        });

        buttonAddNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                VolunteerInfo newV=new Volunteer();

                v.setProjectName(inputProjectName.getText());
                v.setDescription(inputDescription.getText());
                v.setNextVolunteerInfo(null);

                new VolunteerPage(user,eI,j,s,newV,firstv,p,c,r,h,array);
                dispose();
            }
        });






    }

}
