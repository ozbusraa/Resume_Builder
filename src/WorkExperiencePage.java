import Info.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WorkExperiencePage extends JFrame {

    private JPanel panel;

    public WorkExperiencePage(UserInterface user, EducationInfo eI, WorkExperienceInfo j, SkillsInfo s, VolunteerInfo v, Project p, Certificates c, Reference r, Hobbies h){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(null);

        JLabel title = new JLabel("Work Experience Info");
        panel.add(title);
        Dimension size = title.getPreferredSize();
        title.setBounds(140, 0, size.width, size.height);


        JLabel name = new JLabel("Company Name:");
        panel.add(name);
        Dimension size2 = name.getPreferredSize();
        name.setBounds(0, 50, size2.width, size2.height);

        JTextField inputCompanyName = new JTextField(15);
        panel.add(inputCompanyName);
        Dimension size8 = inputCompanyName.getPreferredSize();
        inputCompanyName.setBounds(100, 50, size8.width, size8.height);



        JLabel position = new JLabel("Position:");
        panel.add(position);
        Dimension size3 = position.getPreferredSize();
        position.setBounds(0, 100, size3.width, size3.height);

        JTextField inputPosition = new JTextField(15);
        panel.add(inputPosition);
        Dimension size9 = inputPosition.getPreferredSize();
        inputPosition.setBounds(100, 100, size9.width, size9.height);



        JLabel startDate = new JLabel("Start Date:");
        panel.add(startDate);
        Dimension size4 = startDate.getPreferredSize();
        startDate.setBounds(0, 150, size4.width, size4.height);

        JTextField inputstartDate = new JTextField(15);
        panel.add(inputstartDate);
        Dimension size10 = inputstartDate.getPreferredSize();
        inputstartDate.setBounds(100, 150, size10.width, size10.height);



        JLabel finishDate = new JLabel("Finish Date:");
        panel.add(finishDate);
        Dimension size5 = finishDate.getPreferredSize();
        finishDate.setBounds(0, 200, size5.width, size5.height);

        JTextField inputfinishDate = new JTextField(15);
        panel.add(inputfinishDate);
        Dimension size11 = inputfinishDate.getPreferredSize();
        inputfinishDate.setBounds(100, 200, size11.width, size11.height);



        JLabel description = new JLabel("Description:");
        panel.add(description);
        Dimension size6 = description.getPreferredSize();
        description.setBounds(0, 250, size6.width, size6.height);

        JTextField inputDescription = new JTextField(15);
        panel.add(inputDescription);
        Dimension size12 = inputDescription.getPreferredSize();
        inputDescription.setBounds(100, 250, size12.width, size12.height);



        JButton saveButton = new JButton("Save");
        panel.add(saveButton);
        Dimension size7 = saveButton.getPreferredSize();
        saveButton.setBounds(300, 300, size7.width, size7.height);

        JButton buttonAddNew = new JButton("Add New");
        panel.add(buttonAddNew);
        Dimension size13 = buttonAddNew.getPreferredSize();
        buttonAddNew.setBounds(100, 300, size13.width, size13.height);

        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                j.setCompanyName(inputCompanyName.getText());
                j.setPosition(inputPosition.getText());
                j.setFinishDate(inputfinishDate.getText());
                j.setStartDate(inputstartDate.getText());
                j.setDescription(inputDescription.getText());
                j.setNextWorkExperience(null);

                //new PersonalInfo().setVisible(true);
                dispose();
            }
        });

        buttonAddNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                WorkExperienceInfo newJ=new WorkExperience();

                j.setCompanyName(inputCompanyName.getText());
                j.setPosition(inputPosition.getText());
                j.setFinishDate(inputfinishDate.getText());
                j.setStartDate(inputstartDate.getText());
                j.setDescription(inputDescription.getText());
                j.setNextWorkExperience(newJ);

                new WorkExperiencePage(user,eI,newJ,s,v,p,c,r,h).setVisible(true);
                dispose();
            }
        });






    }

}



