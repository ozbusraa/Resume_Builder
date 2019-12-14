import Info.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CertificatesPage extends JFrame {
    private JPanel panel;

    public CertificatesPage(UserInterface user, EducationInfo eI, WorkExperienceInfo j, SkillsInfo s, VolunteerInfo v, Project p, Certificates c, Reference r, Hobbies h, Boolean[] array){
        this.setVisible(array[6]);
        if(array[6]==Boolean.FALSE){
            new ReferencePage(user,eI,j,s,v,p,c,r,h,array);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) getContentPane();
        panel.setLayout(null);

        JLabel title = new JLabel("Certificates Info");
        title.setBounds(140,50, 150,25);
        JLabel name = new JLabel("Certificate Name:");
        Dimension size2 = name.getPreferredSize();
        name.setBounds(0, 100, size2.width, size2.height);
        JLabel date = new JLabel("Date:");
        Dimension size3 = date.getPreferredSize();
        date.setBounds(0, 150, size3.width, size3.height);
        JLabel institution = new JLabel("Institution:");
        Dimension size4 = institution.getPreferredSize();
        institution.setBounds(0, 200, size4.width, size4.height);

        JTextField inputName = new JTextField(15);
        Dimension size5 = inputName.getPreferredSize();
        inputName.setBounds(150, 100, size5.width, size5.height);

        JTextField inputDate = new JTextField(15);
        Dimension size6 = inputDate.getPreferredSize();
        inputDate.setBounds(150, 150, size6.width, size6.height);

        JTextField inputInstitution = new JTextField(15);
        Dimension size7 = inputInstitution.getPreferredSize();
        inputInstitution.setBounds(150, 200, size7.width, size7.height);


        JButton saveButton = new JButton("Next");
        panel.add(saveButton);
        Dimension size8 = saveButton.getPreferredSize();
        saveButton.setBounds(300, 300, size8.width, size8.height);

        JButton buttonAddNew = new JButton("Add New");
        panel.add(buttonAddNew);
        Dimension size9 = buttonAddNew.getPreferredSize();
        buttonAddNew.setBounds(100, 300, size9.width, size9.height);

        JButton goBackButton = new JButton("Go Back");
        panel.add(goBackButton);
        Dimension size14 = goBackButton.getPreferredSize();
        goBackButton.setBounds(200, 300, size14.width, size14.height);

        add(title);
        add(name);
        add(date);
        add(institution);
        add(inputName);
        add(inputDate);
        add(inputInstitution);

        setSize(400, 400);
        setLocationRelativeTo(null);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            c.setCertificateName(inputName.getText());
            c.setGivenOrganisation(inputInstitution.getText());
            c.setYear(inputDate.getText());
            c.setNextCertificate(null);

                new ReferencePage(user,eI,j,s,v,p,c,r,h,array);
                dispose();
            }
        });

        buttonAddNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Certificates newC=new CertificateInfo();

                c.setCertificateName(inputName.getText());
                c.setGivenOrganisation(inputInstitution.getText());
                c.setYear(inputDate.getText());
                c.setNextCertificate(newC);

                new CertificatesPage(user,eI,j,s,v,p,newC,r,h,array);
                dispose();
            }
        });
    }
}
