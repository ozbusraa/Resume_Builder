import Info.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectsPage extends JFrame{
    private JPanel panel;

    public ProjectsPage(UserInterface user, EducationInfo eI, WorkExperienceInfo j, SkillsInfo s, VolunteerInfo v, Project p,Project firstp, Certificates c, Reference r, Hobbies h,Boolean[] array){
        this.setVisible(array[3]);
        if(array[3]==Boolean.FALSE){new HobbiesPage(user,eI,j,s,v,p,c,r,h,array);}

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) getContentPane();
        panel.setLayout(null);

        JLabel title = new JLabel("Projects Info");
        title.setBounds(140,50, 150,25);
        JLabel name = new JLabel("Name:");
        Dimension size2 = name.getPreferredSize();
        name.setBounds(0, 100, size2.width, size2.height);
        JLabel description = new JLabel("Description:");
        Dimension size3 = description.getPreferredSize();
        description.setBounds(0, 150, size3.width, size3.height);

        JTextField inputName = new JTextField(15);
        Dimension size4 = inputName.getPreferredSize();
        inputName.setBounds(100, 100, size4.width, size4.height);
        JTextField inputDescription = new JTextField(15);
        Dimension size5 = inputDescription.getPreferredSize();
        inputDescription.setBounds(100, 150, size5.width, size5.height);


        JButton saveButton = new JButton("Next");
        panel.add(saveButton);
        Dimension size6 = saveButton.getPreferredSize();
        saveButton.setBounds(300, 300, size6.width, size6.height);

        JButton buttonAddNew = new JButton("Add New");
        panel.add(buttonAddNew);
        Dimension size7 = buttonAddNew.getPreferredSize();
        buttonAddNew.setBounds(100, 300, size7.width, size7.height);

        JButton goBackButton = new JButton("Go Back");
        panel.add(goBackButton);
        Dimension size14 = goBackButton.getPreferredSize();
        goBackButton.setBounds(200, 300, size14.width, size14.height);

        add(title);
        add(name);
        add(description);
        add(inputName);
        add(inputDescription);

        setSize(400, 400);
        setLocationRelativeTo(null);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.setDescription(inputDescription.getText());
                p.setProjectName(inputName.getText());
                p.setNextProject(null);
                user.setProject(firstp);
                new HobbiesPage(user,eI,j,s,v,p,c,r,h,array);
                dispose();
            }
        });

        buttonAddNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Project newP=new ProjectInfo();
                p.setDescription(inputDescription.getText());
                p.setProjectName(inputName.getText());
                p.setNextProject(newP);

                new ProjectsPage(user,eI,j,s,v,newP,firstp,c,r,h,array);
                dispose();
            }
        });
    }
}
