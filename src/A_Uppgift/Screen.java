package A_Uppgift;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Screen extends JDialog {
    private JPanel  contentPane;
    private JButton newPerson;
    private JButton newSavePerson;
    private JButton update;
    private JButton cancel;
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
        // Instansieras Swing panel
        setContentPane(contentPane);

        // Fönster Beteende
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setModal(true);
        getRootPane().setDefaultButton(newPerson);

        onInit(); // start modell

        // Spara kontakt list
        people = new ArrayList<Person>();
        listPeopleModel = new DefaultListModel();
        listPeople.setModel(listPeopleModel);

        newSavePerson.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {onSavePerson();}
        });

        update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {onUpdate();}
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

                // Validering

                // mönster
                String regex = "(^[A-Za-z]{3,16})([ ]{0,1})([A-Za-z]{3,16})?([ ]{0,1})?([A-Za-z]{3,16})?([ ]{0,1})?([A-Za-z]{3,16})";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(name.getText());

                // Skrivs fält meddelande i label
                nameError.setText(email.getText() +" : "+ matcher.matches());

                // a/Aktivera och skriva om knappar och fält beroende av validering och villkor.
                if(!matcher.matches()){
                    nameError.setText("No valid name");
                    newSavePerson.setEnabled(false);
                    newSavePerson.setEnabled(false);
                }else {
                    nameError.setText("");
                    newSavePerson.setEnabled(true);
                    newSavePerson.setEnabled(true);
                }

            }
        });

        KeyAdapter listener = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        };
        nameError.addKeyListener(listener);
        surNameError.addKeyListener(listener);
        birthdayError.addKeyListener(listener);
        telephoneError.addKeyListener(listener);
        emailError.addKeyListener(listener);

        // Validering

        // mönster
        surname.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Validering

                // mönster
                String regex = "(^[A-Za-z]{3,16})([ ]{0,1})([A-Za-z]{3,16})?([ ]{0,1})?([A-Za-z]{3,16})?([ ]{0,1})?([A-Za-z]{3,16})";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(name.getText());

                // Skrivs fält meddelande i label
                surNameError.setText(surname.getText() +" : "+ matcher.matches());

                // a/Aktivera och skriva om knappar och fält beroende av validering och villkor.
                if(!matcher.matches()){
                    surNameError.setText("No valid surname");
                    newSavePerson.setEnabled(false);
                    newSavePerson.setEnabled(false);
                }else {
                    surNameError.setText("");
                    newSavePerson.setEnabled(true);
                    newSavePerson.setEnabled(true);
                }
            }
        });

        birthday.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Validering

                // mönster
                String regex = "^(((0[1-9]|[12][0-9]|3[01])[- /.](0[13578]|1[02])|(0[1-9]|[12][0-9]|30)[- /.]" +
                               "(0[469]|11)|(0[1-9]|1\\d|2[0-8])[- /.]02)[- /.]\\d{4}|29[- /.]02[- /.](\\d{2}" +
                               "(0[48]|[2468][048]|[13579][26])|([02468][048]|[1359][26])00))$";
                Pattern pattern = Pattern.compile(regex);

                // Skrivs fält meddelande i label
                Matcher matcher = pattern.matcher(birthday.getText());
                birthdayError.setText(birthday.getText() +" : "+ matcher.matches());

                // a/Aktivera och skriva om knappar och fält beroende av validering och villkor.
                if(!matcher.matches()){
                    birthdayError.setText("No valid date \nDD/MM/YYYY");
                    newSavePerson.setEnabled(false);
                    newSavePerson.setEnabled(false);
                }else {
                    birthday.setText("");
                    newSavePerson.setEnabled(true);
                    newSavePerson.setEnabled(true);
                }
            }
        });
        email.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Validering

                // mönster
                String regex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9]" +
                               "(?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(email.getText());

                // Skrivs fält meddelande i label
                emailError.setText(email.getText() +" : "+ matcher.matches());

                // a/Aktivera och skriva om knappar och fält beroende av validering och villkor.
                if(!matcher.matches()){
                    emailError.setText("No valid e-mail \nname@exemple.com");
                    newSavePerson.setEnabled(false);
                    newSavePerson.setEnabled(false);
                }else {
                    emailError.setText("");
                    newSavePerson.setEnabled(true);
                    newSavePerson.setEnabled(true);
                }
            }
        });
        tel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Validering

                // mönster
                String regex = "^\\+(?:[0-9] ?){6,14}[0-9]$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(tel.getText());

                // Skrivs fält meddelande i label
                telephoneError.setText(tel.getText() +" : "+ matcher.matches());

                // a/Aktivera och skriva om knappar och fält beroende av validering och villkor.
                if(!matcher.matches()){
                    telephoneError.setText("No valid telephone \n+45 72 543 4353");
                    newSavePerson.setEnabled(false);
                    newSavePerson.setEnabled(false);
                }else {
                    telephoneError.setText("");
                    newSavePerson.setEnabled(true);
                    newSavePerson.setEnabled(true);
                }
            }
        });
    }

    // Beteende beroende av Listeners
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
        surname.setText("! New/Select");
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

            Person p  = new Person(
                    name.getText(),
                    surname.getText(),
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
        }

    private void onUpdate() {

            int personIndex = listPeople.getSelectedIndex();
            Person p = people.get(personIndex);

            p.setName(name.getText());
            p.setName(surname.getText());
            p.setEmail(email.getText());
            p.setPhoneNumber(tel.getText());
            System.out.println("tel: " + tel.getText());
            p.setDateOfBirth(birthday.getText());

            // text fields
            name.setText("");
            surname.setText("");
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

    }

    private void onValueChanged() {
        int personIndex = listPeople.getSelectedIndex();
        if (personIndex >=0){
            Person p = people.get(personIndex);
            name.setText(p.getName());
            surname.setText(p.getName());
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

            // clean error validation
            birthdayError.setText("");

        }
    }

    private void addPerson(Person p) {
        people.add(p);
        refreshPeopleList();

    }

    private void refreshPeopleList() {
       listPeopleModel.removeAllElements();
       for(Person p:people){
           listPeopleModel.addElement(p.getName() + ", " + p.getSurname());
       }

    }

    public static void main(String[] args) {
        Screen dialog = new Screen();
        dialog.pack();

        // dump Persons
        Person sheldon = new Person("Sheldon", "Lee Cooper", "sheldon@gmail.com", "555 0001", "26/02/1980");
        Person howard = new Person("Howard", "Joel Wolowitz", "howard@gmail.com", "555 0002", "01/03/1981");
        Person bernadette = new Person("Bernadette", "Rostenkowski-Wolowitz", "bernadette@gmail.com", "555 0002", "01/01/1984");
        Person raj = new Person("Rajesh", "Ramayan Koothrappali", "raj@gmail.com", "555 0003", "06/10/1981");
        Person penny = new Person("Penny", "Hofstadter", "penny@gmail.com", "555 0004", "02/12/1985");
        Person leonard = new Person("Leonard", "Hofstadter", "leonard@gmail.com", "555 0004", "17/05/1980");
        Person amy = new Person("Amy", "Farrah Fowler", "amy@gmail.com", "555 0005", "17/12/1979");

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

}

