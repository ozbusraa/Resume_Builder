import Info.*;

import javax.swing.*;
import java.awt.*;

public class HobbiesPage extends JFrame {
    private JPanel panel;

    public HobbiesPage(UserInterface user, EducationInfo eI, WorkExperienceInfo j, SkillsInfo s, VolunteerInfo v, Project p, Certificates c, Reference r, Hobbies h, Boolean[] array){
        this.setVisible(array[1]);
        //if(array[4]==Boolean.FALSE){new SkillPage(user,eI,j,s,v,p,c,r,h,array);}
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) getContentPane();
        panel.setLayout(null);

        JLabel title = new JLabel("Hobies Info");
        title.setBounds(140,50, 150,25);
        JLabel label = new JLabel("Hobies:");
        Dimension size2 = label.getPreferredSize();
        label.setBounds(0, 100, size2.width, size2.height);

        JTextField inputHobies = new JTextField(20);
        Dimension size4 = inputHobies.getPreferredSize();
        inputHobies.setBounds(100, 100, size4.width, size4.height);

        JButton saveButton = new JButton("Save");
        panel.add(saveButton);
        Dimension size6 = saveButton.getPreferredSize();
        saveButton.setBounds(300, 300, size6.width, size6.height);

        JButton buttonAddNew = new JButton("Add New");
        panel.add(buttonAddNew);
        Dimension size7 = buttonAddNew.getPreferredSize();
        buttonAddNew.setBounds(100, 300, size7.width, size7.height);

        add(title);
        add(label);
        add(inputHobies);

        setSize(400, 400);
        setLocationRelativeTo(null);
}}
