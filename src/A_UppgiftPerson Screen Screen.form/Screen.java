package javaFCC.GUI_03;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Screen extends JDialog {
    private JPanel  contentPane;
    private JButton newPerson;
    private JButton newSavePerson;
    private JButton update;
    private JButton                 cancel;
    private JList   listPeople;
    private JTextField name;
    private JTextField surname;
    private JTextField birthday;
    private JTextField email;
    private       JTextField        tel;
    private JLabel nameError;
    private JLabel surNameError;
    private JLabel birthdayError;
    private JLabel emailError;
    private JLabel telephoneError;
    private  ArrayList<Person> people;
    private DefaultListModel  listPeopleModel;

    public Screen() {
        setContentPane(contentPane);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setModal(true);
        getRootPane().setDefaultButton(newPerson);

        onInit();

        //
        people = new ArrayList<Person>();
        listPeopleModel = new DefaultListModel();
        listPeople.setModel(listPeopleModel);

        newSavePerson.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {onSavePerson();}
        });

        update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {onUpdate();}
        });

        // call onUpdate() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onUpdate();
            }
        });

        // call onUpdate() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onUpdate();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        listPeople.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                onValueChanged();
            }
        });
        newPerson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onNewPerson();
            }
        });
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });
        name.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                nameError.setText("NameError");
            }
        });
    }

    private void onCancel() {
        // buttons status
        update.setEnabled(false);
        newPerson.setEnabled(true);
        newSavePerson.setEnabled(false);
        cancel.setEnabled(false);

        // fields status
        name.setEnabled(false);
        surname.setEnabled(false);
        birthday.setEnabled(false);
        email.setEnabled(false);
        tel.setEnabled(false);

        // fields set text
        name.setText("! New/Select");
        email.setText("! New/Select");
        tel.setText("! New/Select");
        birthday.setText("! New/Select");

        refreshPeopleList();
    }

    private void onInit() {

        // buttons status
        update.setEnabled(false);
        newPerson.setEnabled(true);
        newSavePerson.setEnabled(false);
        cancel.setEnabled(false);

        // fields status
        name.setEnabled(false);
        surname.setEnabled(false);
        birthday.setEnabled(false);
        email.setEnabled(false);
        tel.setEnabled(false);


    }

    private void onNewPerson() {

        //buttons status
        update.setEnabled(false);
        newPerson.setEnabled(false);
        newSavePerson.setEnabled(true);
        cancel.setEnabled(true);


        // text fields
        name.setText("");
        email.setText("");
        tel.setText("");
        birthday.setText("");

        // fields status
        name.setEnabled(true);
        surname.setEnabled(true);
        birthday.setEnabled(true);
        email.setEnabled(true);
        tel.setEnabled(true);

        refreshPeopleList();


    }

    private void onSavePerson() {

        try{
            Person p  = new Person(
                    name.getText(),
                    email.getText(),
                    tel.getText(),
                    birthday.getText()
            );
            people.add(p);

        // fields status
        name.setEnabled(false);
        surname.setEnabled(false);
        birthday.setEnabled(false);
        email.setEnabled(false);
        tel.setEnabled(false);

            refreshPeopleList();

        } catch (Exception e){
        }

        }


    private void onUpdate() {

        try{
            int personIndex = listPeople.getSelectedIndex();
            Person p = people.get(personIndex);

            p.setName(name.getText());
            p.setEmail(email.getText());
            p.setPhoneNumber(tel.getText());
            System.out.println("tel: " + tel.getText());
            p.setDateOfBirth(birthday.getText());

            // text fields
            name.setText("");
            email.setText("");
            tel.setText("");
            birthday.setText("");

            // fields status
            name.setEnabled(false);
            surname.setEnabled(false);
            birthday.setEnabled(false);
            email.setEnabled(false);
            tel.setEnabled(false);

            // buttons Status
            update.setEnabled(false);
            newPerson.setEnabled(true);
            newSavePerson.setEnabled(false);
            cancel.setEnabled(false);

            refreshPeopleList();

        } catch (Exception e){
    }


    }

    private void onValueChanged() {
        // add your code here if necessary
        int personIndex = listPeople.getSelectedIndex();
        if (personIndex >=0){
            Person p = people.get(personIndex);
            name.setText(p.getName());
            email.setText(p.getEmail());
            tel.setText(p.getPhoneNumber());
            birthday.setText(p.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

            // buttons Status
            update.setEnabled(true);
            newPerson.setEnabled(true);
            newSavePerson.setEnabled(false);
            cancel.setEnabled(true);

            // fields status
            name.setEnabled(true);
            surname.setEnabled(true);
            birthday.setEnabled(true);
            email.setEnabled(true);
            tel.setEnabled(true);

        }
    }

    private void addPerson(Person p) {
        people.add(p);
        refreshPeopleList();

    }

    private void refreshPeopleList() {
       listPeopleModel.removeAllElements();
       for(Person p:people){
           System.out.println("Adding person to list: " + p.getName());
           listPeopleModel.addElement(p.getName());
       }

    }

    public void validateString(JTextField field, JLabel label, String name){
        if(field.getText().trim().isEmpty()){
            label.setText("Empty field " + name);
        }
    }


    public static void main(String[] args) {
        Screen dialog = new Screen();
        dialog.pack();

        // dump Persons
        Person sheldon = new Person("Sheldon Lee Cooper", "sheldon@gmail.com", "555 0001", "26/02/1980");
        Person howard = new Person("Howard Joel Wolowitz", "howard@gmail.com", "555 0002", "01/03/1981");
        Person bernadette = new Person("Bernadette Rostenkowski-Wolowitz", "bernadette@gmail.com", "555 0002", "01/01/1984");
        Person raj = new Person("Rajesh Ramayan Koothrappali", "raj@gmail.com", "555 0003", "06/10/1981");
        Person penny = new Person("Penny Hofstadter", "penny@gmail.com", "555 0004", "02/12/1985");
        Person leonard = new Person("Leonard Hofstadter", "leonard@gmail.com", "555 0004", "17/05/1980");
        Person amy = new Person("Amy Farrah Fowler", "amy@gmail.com", "555 0005", "17/12/1979");

        dialog.addPerson(sheldon);
        dialog.addPerson(howard);
        dialog.addPerson(bernadette);
        dialog.addPerson(raj);
        dialog.addPerson(penny);
        dialog.addPerson(leonard);
        dialog.addPerson(amy);

        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
