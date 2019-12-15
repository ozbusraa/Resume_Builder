import Info.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReferencePage extends JFrame {

    private JPanel panel;

    public ReferencePage(UserInterface user, EducationInfo eI, WorkExperienceInfo j, SkillsInfo s, VolunteerInfo v, Project p, Certificates c, Reference r, Reference firstr,Hobbies h, Boolean[] array){
        this.setVisible(array[7]);
        if(array[7]==Boolean.FALSE){
            new ChooseType(user,eI,j,s,v,p,c,r,h,array).setVisible(true);
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(null);

        JLabel title = new JLabel("References Info");
        panel.add(title);
        Dimension size = title.getPreferredSize();
        title.setBounds(140, 0, size.width, size.height);


        JLabel name = new JLabel("Name:");
        panel.add(name);
        Dimension size2 = name.getPreferredSize();
        name.setBounds(0, 50, size2.width, size2.height);

        JTextField inputName = new JTextField(15);
        panel.add(inputName);
        Dimension size8 = inputName.getPreferredSize();
        inputName.setBounds(100, 50, size8.width, size8.height);



        JLabel surname = new JLabel("Surname:");
        panel.add(surname);
        Dimension size3 = surname.getPreferredSize();
        surname.setBounds(0, 100, size3.width, size3.height);

        JTextField inputSurname = new JTextField(15);
        panel.add(inputSurname);
        Dimension size9 = inputSurname.getPreferredSize();
        inputSurname.setBounds(100, 100, size9.width, size9.height);



        JLabel telNo = new JLabel("Tel No:");
        panel.add(telNo);
        Dimension size4 = telNo.getPreferredSize();
        telNo.setBounds(0, 150, size4.width, size4.height);

        JTextField inputTelNo = new JTextField(15);
        panel.add(inputTelNo);
        Dimension size10 = inputTelNo.getPreferredSize();
        inputTelNo.setBounds(100, 150, size10.width, size10.height);



        JLabel mail = new JLabel("E-mail:");
        panel.add(mail);
        Dimension size5 = mail.getPreferredSize();
        mail.setBounds(0, 200, size5.width, size5.height);

        JTextField inputMail = new JTextField(15);
        panel.add(inputMail);
        Dimension size11 = inputMail.getPreferredSize();
        inputMail.setBounds(100, 200, size11.width, size11.height);



        JButton saveButton = new JButton("Save");
        panel.add(saveButton);
        Dimension size7 = saveButton.getPreferredSize();
        saveButton.setBounds(300, 300, size7.width, size7.height);

        JButton buttonAddNew = new JButton("Add New");
        panel.add(buttonAddNew);
        Dimension size13 = buttonAddNew.getPreferredSize();
        buttonAddNew.setBounds(100, 300, size13.width, size13.height);

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

             r.setLastname(inputSurname.getText());
             r.setMailAddress(inputMail.getText());
             r.setName(inputName.getText());
             r.setTelNo(inputTelNo.getText());
             r.setNextReferenceInfo(null);
             user.setReference(firstr);
               // new SkillPage(user,eI,j,s,v,p,c,r,h,array);
             new ChooseType(user,eI,j,s,v,p,c,r,h,array).setVisible(true);
             dispose();


            }
        });

        buttonAddNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reference newR=new ReferenceInfo();

                r.setLastname(inputSurname.getText());
                r.setMailAddress(inputMail.getText());
                r.setName(inputName.getText());
                r.setTelNo(inputTelNo.getText());
                r.setNextReferenceInfo(newR);

                new ReferencePage(user,eI,j,s,v,p,c,newR,firstr,h,array);
                dispose();
            }
        });






    }

}



