import Info.EducationInfo;
import Info.ProxyUser;
import Info.SchoolInfo;
import Info.UserInterface;

import Info.UserInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PersonalInfo extends JFrame {

    private JPanel panel;


    public PersonalInfo(UserInterface user){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(null);

        JLabel title = new JLabel("Personal Info");
        panel.add(title);
        Dimension size = title.getPreferredSize();
        title.setBounds(140, 0, size.width, size.height);
        JLabel name = new JLabel("Name:");
        panel.add(name);
        Dimension size2 = name.getPreferredSize();
        name.setBounds(0, 50, size2.width, size2.height);
        JLabel surname = new JLabel("Surname:");
        panel.add(surname);
        Dimension size3 = surname.getPreferredSize();
        surname.setBounds(0, 100, size3.width, size3.height);
        JLabel phoneNumber = new JLabel("Phone Number:");
        panel.add(phoneNumber);
        Dimension size4 = phoneNumber.getPreferredSize();
        phoneNumber.setBounds(0, 150, size4.width, size4.height);
        JLabel mail = new JLabel("E-Mail:");
        panel.add(mail);
        Dimension size5 = mail.getPreferredSize();
        mail.setBounds(0, 200, size5.width, size5.height);
        JLabel address = new JLabel("Address:");
        panel.add(address);
        Dimension size6 = address.getPreferredSize();
        address.setBounds(0, 250, size6.width, size6.height);
        JButton button = new JButton("Save");
        panel.add(button);
        Dimension size7 = button.getPreferredSize();
        button.setBounds(300, 300, size7.width, size7.height);
        JTextField inputName = new JTextField(15);
        panel.add(inputName);
        Dimension size8 = inputName.getPreferredSize();
        inputName.setBounds(100, 50, size8.width, size8.height);
        JTextField inputSurname = new JTextField(15);
        panel.add(inputSurname);
        Dimension size9 = inputSurname.getPreferredSize();
        inputSurname.setBounds(100, 100, size9.width, size9.height);
        JTextField inputPhoneNumber = new JTextField(15);
        panel.add(inputPhoneNumber);
        Dimension size10 = inputPhoneNumber.getPreferredSize();
        inputPhoneNumber.setBounds(100, 150, size10.width, size10.height);
        JTextField inputMail = new JTextField(15);
        panel.add(inputMail);
        Dimension size11 = inputMail.getPreferredSize();
        inputMail.setBounds(100, 200, size11.width, size11.height);
        JTextField inputAddress = new JTextField(15);
        panel.add(inputAddress);
        Dimension size12 = inputAddress.getPreferredSize();
        inputAddress.setBounds(100, 250, size12.width, size12.height);


        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                user.setName(inputName.getText());
                user.setLastName(inputSurname.getText());
                user.setTelNo(inputPhoneNumber.getText());
                user.setAddress(inputAddress.getText());
                user.setEmail(inputMail.getText());
                //EducationInfo eI=new SchoolInfo();
                //new EducationalInfo(user,eI).setVisible(true);
                new ChooseInfo().setVisible(true);
                dispose();
            }
        });

    }
}

