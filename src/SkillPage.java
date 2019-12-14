import Info.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SkillPage extends JFrame {

    private JPanel panel;

    public SkillPage(UserInterface user, EducationInfo eI, WorkExperienceInfo j, SkillsInfo s, VolunteerInfo v, Project p, Certificates c, Reference r, Hobbies h, Boolean[] array){
        this.setVisible(array[2]);
        if(array[2]==Boolean.FALSE){new ProjectsPage(user,eI,j,s,v,p,c,r,h,array);}

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(null);

        JLabel title = new JLabel("Skills Info");
        panel.add(title);
        Dimension size = title.getPreferredSize();
        title.setBounds(140, 0, size.width, size.height);


        JLabel language = new JLabel("Known Languages:");
        panel.add(language);
        Dimension size2 = language.getPreferredSize();
        language.setBounds(0, 50, size2.width, size2.height);

        JTextField inputLanguage = new JTextField(15);
        panel.add(inputLanguage);
        Dimension size8 = inputLanguage.getPreferredSize();
        inputLanguage.setBounds(100, 50, size8.width, size8.height);



        JLabel program = new JLabel("Known Programs:");
        panel.add(program);
        Dimension size3 = program.getPreferredSize();
        program.setBounds(0, 100, size3.width, size3.height);

        JTextField inputProgram = new JTextField(15);
        panel.add(inputProgram);
        Dimension size9 = inputProgram.getPreferredSize();
        inputProgram.setBounds(100, 100, size9.width, size9.height);



        JLabel other = new JLabel("Other:");
        panel.add(other);
        Dimension size4 = other.getPreferredSize();
        other.setBounds(0, 150, size4.width, size4.height);

        JTextField inputOther = new JTextField(15);
        panel.add(inputOther);
        Dimension size10 = inputOther.getPreferredSize();
        inputOther.setBounds(100, 150, size10.width, size10.height);



        JButton saveButton = new JButton("Next");
        panel.add(saveButton);
        Dimension size7 = saveButton.getPreferredSize();
        saveButton.setBounds(300, 300, size7.width, size7.height);

        JButton goBackButton = new JButton("Go Back");
        panel.add(goBackButton);
        Dimension size14 = goBackButton.getPreferredSize();
        goBackButton.setBounds(200, 300, size14.width, size14.height);

        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        //   this.setVisible(true);


        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                s.setLanguages(inputLanguage.getText());
                s.setProgramKnowledge(inputProgram.getText());
                s.setOther(inputOther.getText());

                new ProjectsPage(user,eI,j,s,v,p,c,r,h,array);
                dispose();
            }
        });


    }

}



