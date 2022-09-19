package com.company;
import java.util.Date;
import java.util.ArrayList;
import java.util.Random;
import java.security.MessageDigest;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gui implements ActionListener {
    JFrame big=new JFrame();
    JButton bank=new JButton("Bank");
    JButton bill =new JButton("Bills");
    JButton hotel=new JButton("Hotel");
    JButton btn2a=new JButton("Room 1");
    JButton btn2b=new JButton("Room2");
    JFrame f3= new JFrame();
    JFrame f = new JFrame();
    JFrame f2 = new JFrame();

    JFrame f1=new JFrame();

    JButton btn1 = new JButton("Check Bookings");
    JButton btn2 = new JButton("Book Room");
    JLabel l=new JLabel("Choose any room you like");
    JTextField t7=new JTextField();
    JTextField t8=new JTextField();
    JTextField t9=new JTextField();
    JTextField t1=new JTextField();
    JTextField t2=new JTextField();
    JTextField t3=new JTextField();
    JTextField t4=new JTextField();
    JTextField t5=new JTextField();
    JTextField t6=new JTextField();
    JButton back=new JButton("Go Back");

    JLabel l1=new JLabel("Single Bed Room");
    JLabel l2=new JLabel("Double Bed Room");
    JLabel l3=new JLabel("Family Suite");
    JLabel l7=new JLabel("Enter Amount");
    JLabel l8=new JLabel("Enter Amount");
    JLabel l9=new JLabel("Enter Amount");
    JButton btn1a = new JButton("Room 1");
    JButton btn1b = new JButton("Room 2");
    JLabel l1a=new JLabel("Enter your First Name:");
    JLabel l1b=new JLabel("Enter your Last Name:");
    JLabel l1c=new JLabel("Enter your Age:");
    JButton done1=new JButton("Book");
    JButton back2 = new JButton("Menu");
    JButton back3 = new JButton("Menu");
    JButton wapis=new JButton("Main Menu");
    JFrame bill1=new JFrame();
    JButton phone=new JButton("Phone Bill");
    JButton elec=new JButton("Electricity Bill");
    JButton wapis2=new JButton("Main Menu");
    JFrame pf=new JFrame();
    JFrame ef=new JFrame();
    JButton b1=new JButton("Data Bill: Due Amount 800");
    JButton b2=new JButton("Calls Bill: Due Amount 600");
    JButton b3=new JButton("International roaming: Due Amount 200");
    JButton pay1=new JButton("Pay");
    JButton pay2=new JButton("Pay");
    JButton pay3=new JButton("Pay");
    JButton mai=new JButton("Go Back");




    gui() {
        big.setSize(800,800);
        big.setVisible(true);
        big.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        big.setLayout(null);
        hotel.setBounds(100, 100, 150, 150);
        bill.setBounds(300, 100, 150, 150);
        bank.setBounds(250, 300, 150, 150);

        hotel.addActionListener(this);
        bank.addActionListener(this);
        hotel.addActionListener(this);
        bill.addActionListener(this);

        big.add(hotel);
        big.add(bill);
        big.add(bank);
        big.setLayout(null);





    }

    public void actionPerformed(ActionEvent a) {
        int r1=0;
        int r2=0;
        if(a.getSource()==wapis){
            big.setVisible(true);
        }
        if(a.getSource()==hotel){
            f.setSize(800,800);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setLayout(null);
            btn1.setBounds(100, 100, 200, 200);
            btn2.setBounds(400, 100, 200, 200);
            wapis.addActionListener(this);
            f.add(wapis);
            btn1.addActionListener(this);
            btn2.addActionListener(this);
            f.add(btn1);
            wapis.setBounds(250,350,150,150);
            f.add(btn2);
            f.setLayout(null);

        }
        if(a.getSource()==btn2) {
            JLabel l4 = new JLabel("");
            f1.setSize(800, 600);
            btn1a.addActionListener(this);
            btn1b.addActionListener(this);


            btn1a.setBounds(250, 100, 150, 80);
            btn1b.setBounds(250, 200, 150, 80);

            l.setBounds(20, 20, 150, 20);
            l1.setBounds(100, 100, 150, 80);
            l2.setBounds(100, 200, 150, 80);
            back3.setBounds(400,400,150,80);
            back3.addActionListener(this);

            f1.add(btn1a);
            f1.add(btn1b);
            f1.add(back3);

            f1.add(l);
            f1.add(l1);
            f1.add(l2);
            f1.add(l4);


            f1.setVisible(true);
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if(a.getSource()==btn1a && r1==0) {

            f2.setSize(800, 600);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            t1.setBounds(300,100,150,80);
            t2.setBounds(300,200,150,80);
            t3.setBounds(300,300,150,80);
            t1.setFont(new Font("Times New Roman", Font.BOLD, 12));
            t2.setFont(new Font("Times New Roman",Font.BOLD, 12));
            t3.setFont(new Font("Times New Roman",Font.BOLD, 12));
            back.setBounds(400,400,150,80);
            t1.addActionListener(this);
            t2.addActionListener(this);
            t3.addActionListener(this);
            back2.addActionListener(this);

            l1a.setBounds(100, 100, 150, 80);
            l1b.setBounds(100, 200, 150, 80);
            l1c.setBounds(100, 300, 150, 80);
            done1.setBounds(200, 400, 150, 80);
            done1.addActionListener(this);
            back.addActionListener(this);
            f2.add(t1);
            f2.add(t2);
            f2.add(t3);
            f2.add(l1a);
            f2.add(l1b);
            f2.add(l1c);
            f2.add(done1);
            f2.add(back);
            f2.add(back2);
        }
        if(a.getSource()==back){
            f1.setVisible(true);
        }
        if(a.getSource()==done1) {
            JOptionPane.showMessageDialog(null, "Room is booked");
            r1 = r1 + 1;
        }




        if(a.getSource()==btn1 && r1==1){
            JOptionPane.showMessageDialog(null, "Room is already booked");

        }
        if(a.getSource()==btn1b){
            f2.setSize(800, 600);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            t4.setBounds(300,100,150,80);
            t5.setBounds(300,200,150,80);
            t6.setBounds(300,300,150,80);
            t4.setFont(new Font("Times New Roman", Font.BOLD, 12));
            t5.setFont(new Font("Times New Roman",Font.BOLD, 12));
            t6.setFont(new Font("Times New Roman",Font.BOLD, 12));
            back.setBounds(400,400,150,80);

            l1a.setBounds(100, 100, 150, 80);
            l1b.setBounds(100, 200, 150, 80);
            l1c.setBounds(100, 300, 150, 80);
            done1.setBounds(200, 400, 150, 80);
            done1.addActionListener(this);
            f2.add(t4);
            f2.add(t5);
            f2.add(t6);
            f2.add(l1a);
            f2.add(l1b);
            f2.add(l1c);
            f2.add(done1);
            back.addActionListener(this);
            f2.add(back);

        }
        if(a.getSource()==btn1){
            f3.setSize(800,800);
            f3.setVisible(true);
            f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f3.setLayout(null);
            btn2a.setBounds(100, 100, 200, 200);
            btn2b.setBounds(400, 100, 200, 200);
            back2.setBounds(400,400,150,80);
            btn2a.addActionListener(this);
            btn2b.addActionListener(this);
            back2.addActionListener(this);
            f3.add(btn2a);
            f3.add(btn2b);
            f3.add(back2);
            f3.setLayout(null);

        }

        if(a.getSource()==back2){
            f.setVisible(true);
        }
        if(a.getSource()==back3){
            f.setVisible(true);
        }
        if(a.getSource()==btn2a){

            String s1=t1.getText();
            String s2 = t2.getText();
            String s3 = t3.getText();


            if(s1!=null) {

                JOptionPane.showMessageDialog(null, s1 + " " + s2 + " " + s3);
            }
            if(s1.contains("")){
                JOptionPane.showMessageDialog(null, "Room is Available");

            }

        }
        if(a.getSource()==btn2b){

            String s4=t4.getText();
            String s5 = t5.getText();
            String s6 = t6.getText();
            if(s4.contains("")){
                JOptionPane.showMessageDialog(null, "Room is Available");

            }
            else {

                JOptionPane.showMessageDialog(null, s4 + " " + s5 + " " + s6);
            }

        }
        if(a.getSource()==bill){
            bill1.setSize(800,600);
            bill1.setLayout(null);
            bill1.setVisible(true);
            phone.setBounds(100, 100, 200, 80);
            elec.setBounds(300, 100, 200, 80);
            wapis.setBounds(250,400,150,150);
            wapis.addActionListener(this);
            bill1.add(wapis);
            wapis.addActionListener(this);
            bill1.add(wapis);
            phone.addActionListener(this);
            elec.addActionListener(this);
            bill1.add(phone);


        }
        if(a.getSource()==phone){
            pf.setSize(800,600);
            pf.setVisible(true);
            pf.setLayout(null);
            pay1.setBounds(100, 100, 150, 80);
            pay2.setBounds(100, 200, 150, 80);
            pay3.setBounds(100, 300, 150, 80);
            t7.setBounds(450, 100, 150, 80);
            t8.setBounds(450, 200, 150, 80);
            t9.setBounds(450, 300, 150, 80);
            b1.setBounds(250, 100, 200, 80);
            b2.setBounds(250, 200, 200, 80);
            b3.setBounds(250, 300, 250, 80);
            pay1.addActionListener(this);
            pay2.addActionListener(this);
            pay3.addActionListener(this);
            t7.addActionListener(this);
            t8.addActionListener(this);
            t9.addActionListener(this);
            mai.setBounds(500,100,150,80);
            mai.addActionListener(this);
            pf.add(mai);

            pf.add(pay1);
            pf.add(pay2);
            pf.add(pay3);

            pf.add(t7);
            pf.add(t8);
            pf.add(t9);

            pf.add(b1);
            pf.add(b2);
            pf.add(b3);


        }
        if(a.getSource()==pay1){
            String h1=t7.getText();
            if (h1.contains("800")) {
                JOptionPane.showMessageDialog(null, "Bill Paid");


            }
            else{
                JOptionPane.showMessageDialog(null, "Not Sufficient Amount");
            }
        }
        if(a.getSource()==pay2){
            String h2=t8.getText();
            if (h2.contains("600")) {
                JOptionPane.showMessageDialog(null, "Bill Paid");


            }
            else{
                JOptionPane.showMessageDialog(null, "Not Sufficient Amount");
            }
        }
        if(a.getSource()==pay3){
            String h3=t9.getText();
            if (h3.contains("200")) {
                JOptionPane.showMessageDialog(null, "Bill Paid");


            }
            else{
                JOptionPane.showMessageDialog(null, "Not Sufficient Amount");
            }
        }
        if(a.getSource()==mai){
            bill1.setVisible(true);
        }
        if(a.getSource()==elec){
            ef.setSize(800,600);
            ef.setVisible(true);
            ef.setLayout(null);

        }
        if(a.getSource()==bank){
            ATM.main(null);
            big.setVisible(false);
        }
    }


}








class Bank {
    private String name ;
    private ArrayList<User> users ;
    private ArrayList<Account > accounts ;

    public Bank(String name ){
        this.name = name ;
        accounts = new ArrayList<Account>();
        users = new ArrayList<User> ();
    }


    public void addAccount(Account acc){
        this.accounts.add(acc);
    }

    public String getNewUserUUID(){
        Random rng = new Random();
        boolean nonUnique  ;
        String uuid  ;
        int len = 6 ;


        do {
            uuid = "" ;
            for (int c = 0 ; c<len ; c++){
                uuid +=( (Integer)rng.nextInt(10)).toString() ;

            }
            nonUnique = false ;
            for (User u : this.users){
                if (uuid.compareTo(u.getUUID()) == 0){
                    nonUnique = true ;
                    break ;
                }
            }

        }while (nonUnique);
        return uuid ;
    }
    public String getNewAccountUUID(){
        Random rng = new Random();
        boolean nonUnique  ;
        String uuid  ;
        int len = 10 ;


        do {
            uuid = "" ;
            for (int c = 0 ; c<len ; c++){
                uuid +=( (Integer)rng.nextInt(10)).toString() ;

            }
            nonUnique = false ;
            for (Account a : this.accounts){
                if (uuid.compareTo(a.getUUID()) == 0){
                    nonUnique = true ;
                    break ;
                }
            }

        }while (nonUnique);
        return uuid ;

    }

    public User addUser(String firstName , String lastName , String pin){
        User newUser = new User ( firstName ,  lastName ,  pin , this);
        this.users.add(newUser);

        Account newAccount = new Account("savings" , newUser , this);
        this.accounts.add(newAccount);
        newUser.addAccount(newAccount);
        return newUser;



    }
    public User userLogin (String userID , String pin){
        for (User u :this.users){
            if (u.getUUID().compareTo(userID) ==0 &&u.validatePin(pin) )
                return u ;



        }

        return null ;
    }
    public String getName(){
        return this.name;
    }



}

class Transaction {
    private double amount ;
    private Date timestamp ;
    private String memo ;
    private Account inAccount ;

    public Transaction(double amount , Account inAccount){
        this.amount = amount ;
        this.inAccount = inAccount ;
        this.timestamp = new Date();
        this.memo = "";
    }
    public Transaction(double amount, String memo, Account inAccount) {

        this(amount, inAccount);
        this.memo = memo;

    }

    public double getMoney(){
        return this.amount;
    }
    public void transactionInfo(){
        System.out.println(this.amount + " " +this.inAccount +  " " + this.memo + " "+ this.timestamp);
    }

}
class User {
    private String firstName ;
    private String lastName ;
    private String uuid ;
    private byte pinHash[];
    private ArrayList<Account> accounts ;



    public User (String firstName , String lastName , String pin , Bank theBank){
        this.firstName = firstName ;
        this.lastName = lastName ;

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());

        } catch (Exception e) {
            System.out.println("error , caught exception:"+ e.getMessage());
            System.exit(1);
        }
        this.uuid = theBank.getNewUserUUID();
        this.accounts = new ArrayList <Account> ();

        System.out.printf("New user %s %s with ID %s created.\n",
                firstName, lastName, this.uuid);

    }



    public boolean validatePin(String apin){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return MessageDigest.isEqual(md.digest(apin.getBytes()), this.pinHash);
        } catch (Exception e) {
            System.out.println("error , no such algorithm found");
            System.exit(1);
        }

        return false ;




    }

    String getUUID() {
        return this.uuid ;

    }

    public void addAccount(Account newAccount) {
        this.accounts.add(newAccount);
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void printAccountsSummary(){
        System.out.printf("\n\n%s's accounts summary\n", this.firstName);

        for (int a =0 ; a <this.accounts.size() ; a++){
            String line = this.accounts.get(a).getSummaryLine();
            System.out.println(line);
        }
    }
    public int numAccounts() {
        return this.accounts.size();
    }
    public double getAcctBalance(int acctIdx) {
        return this.accounts.get(acctIdx).getBalance();
    }
    public String getAcctUUID(int acctIdx) {
        return this.accounts.get(acctIdx).getUUID();
    }

    public void addAcctTransaction(int acctIdx, double amount, String memo) {
        this.accounts.get(acctIdx).addTransaction(amount, memo);
    }

    public void printAcctTransHistory(int acc){
        this.accounts.get(acc).showTransactions();

    }



}
class Account {
    private String name ;
    private String uuid ;
    private User holder ;
    private ArrayList<Transaction> transactions ;

    public Account (String name , User holder, Bank theBank){
        this.name = name ;
        this.holder = holder ;
        this.uuid = theBank.getNewAccountUUID ();
        this.transactions = new ArrayList<Transaction> ();


    }


    public String getUUID() {
        return uuid;
    }

    public String  getSummaryLine(){
        double balance = this.getBalance();

        if (balance >= 0) {
            return String.format("%s : $%.02f : %s", this.uuid, balance,
                    this.name);
        } else {
            return String.format("%s : $(%.02f) : %s", this.uuid, balance,
                    this.name);
        }


    }

    public double getBalance(){
        double balance = 0;
        for (Transaction t :this.transactions){
            balance += t.getMoney();
        }
        return balance ;
    }
    public void addTransaction(double amount, String memo) {

        // create new transaction and add it to our list
        Transaction newTrans = new Transaction(amount, memo, this);
        this.transactions.add(newTrans);

    }

    public void showTransactions(){
        for (Transaction t : transactions){
            t.transactionInfo();
        }
    }




}
class ATM {

    public static void main(String[] args) {
        gui g=new gui();

        Scanner sc = new Scanner(System.in);
        Bank theBank = new Bank("bank sir,");
        User newUser = theBank.addUser("aditya", "shukla", "1234");
        Account newAccount = new Account("savings", newUser, theBank);
        newUser.addAccount(newAccount);
        theBank.addAccount(newAccount);
        User curUser;
        while (true) {
            curUser = ATM.menuPrompt(theBank, sc);

            ATM.printUserMenu(curUser, sc);
        }


    }

    public static User menuPrompt(Bank theBank, Scanner sc) {
        String userID;
        String pin;
        User authUser;
        do {
            System.out.printf("\n\nWelcome to %s\n\n", theBank.getName());

            System.out.println("enter your ID : ");
            userID = sc.nextLine();

            System.out.println("enter your pin : ");
            pin = sc.nextLine();
            authUser = theBank.userLogin(userID, pin);
            if (authUser == null) {
                System.out.println("the combination of id and pin not correct please try again");
            }
        } while (authUser == null);

        return authUser;


    }

    public static void printUserMenu(User theUser, Scanner sc) {
        int choice;

        do {
            System.out.println("welcome mr " + theUser.getFirstName());
            theUser.printAccountsSummary();

            System.out.println("What would you like to do?");
            System.out.println("  1) Show account transaction history");
            System.out.println("  2) Withdraw");
            System.out.println("  3) Deposit");
            System.out.println("  4) Transfer");
            System.out.println("  5) Quit");
            System.out.println();
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice < 0 || choice > 5) {
                System.out.println("invalid input try again ");
            }
        } while (choice < 0 || choice > 5);

        switch (choice) {
            case 1:
                ATM.showAccountTransactionHistory(theUser, sc);
                break;

            case 2:
                ATM.withdrawFunds(theUser, sc);
                break;

            case 3:
                ATM.depositeFunds(theUser, sc);
                break;
            case 4:
                ATM.transferFunds(theUser, sc);
                break;
        }
        if (choice != 5)
            printUserMenu(theUser, sc);

    }

    public static void transferFunds(User theUser, Scanner sc) {
        int fromAcct;
        int toAcct;
        double amount;
        double acctBal;

        // get account to transfer from
        do {
            System.out.printf("Enter the number (1-%d) of the account to " +
                    "transfer from: ", theUser.numAccounts());
            fromAcct = sc.nextInt() - 1;
            if (fromAcct < 0 || fromAcct >= theUser.numAccounts()) {
                System.out.println("Invalid account. Please try again.");
            }
        } while (fromAcct < 0 || fromAcct >= theUser.numAccounts());
        acctBal = theUser.getAcctBalance(fromAcct);

        // get account to transfer to
        do {
            System.out.printf("Enter the number (1-%d) of the account to " +
                    "transfer to: ", theUser.numAccounts());
            toAcct = sc.nextInt() - 1;
            if (toAcct < 0 || toAcct >= theUser.numAccounts()) {
                System.out.println("Invalid account. Please try again.");
            }
        } while (toAcct < 0 || toAcct >= theUser.numAccounts());

        // get amount to transfer
        do {
            System.out.printf("Enter the amount to transfer (max $%.02f): $",
                    acctBal);
            amount = sc.nextDouble();
            if (amount < 0) {
                System.out.println("Amount must be greater than zero.");
            } else if (amount > acctBal) {
                System.out.printf("Amount must not be greater than balance " +
                        "of $.02f.\n", acctBal);
            }
        } while (amount < 0 || amount > acctBal);

        // finally, do the transfer
        theUser.addAcctTransaction(fromAcct, -1 * amount, String.format(
                "Transfer to account %s", theUser.getAcctUUID(toAcct)));
        theUser.addAcctTransaction(toAcct, amount, String.format(
                "Transfer from account %s", theUser.getAcctUUID(fromAcct)));

    }

    public static void withdrawFunds(User theUser, Scanner sc) {
        int fromAcct;
        double amount;
        double acctBal;
        String memo;

        do {
            System.out.printf("Enter the number (1-%d) of the account to " +
                    "withdraw from: ", theUser.numAccounts());
            fromAcct = sc.nextInt() - 1;
            if (fromAcct < 0 || fromAcct >= theUser.numAccounts()) {
                System.out.println("Invalid account. Please try again.");
            }
        } while (fromAcct < 0 || fromAcct >= theUser.numAccounts());
        acctBal = theUser.getAcctBalance(fromAcct);

        do {
            System.out.printf("Enter the amount to withdraw (max $%.02f): $",
                    acctBal);
            amount = sc.nextDouble();
            if (amount < 0) {
                System.out.println("Amount must be greater than zero.");
            } else if (amount > acctBal) {
                System.out.printf("Amount must not be greater than balance " +
                        "of $%.02f.\n", acctBal);
            }
        } while (amount < 0 || amount > acctBal);

        sc.nextLine();

        System.out.print("Enter a memo: ");
        memo = sc.nextLine();


        theUser.addAcctTransaction(fromAcct, -amount, memo);


    }

    public static void depositeFunds(User theUser, Scanner sc) {
        int toAcct;
        double amount;
        double acctBal;
        String memo;

        do {
            System.out.printf("Enter the number (1-%d) of the account to " +
                    "deposite from: ", theUser.numAccounts());
            toAcct = sc.nextInt() - 1;
            if (toAcct < 0 || toAcct >= theUser.numAccounts()) {
                System.out.println("Invalid account. Please try again.");
            }
        } while (toAcct < 0 || toAcct >= theUser.numAccounts());
        acctBal = theUser.getAcctBalance(toAcct);

        do {
            System.out.printf("Enter the amount to deposite (max $%.02f): $",
                    acctBal);
            amount = sc.nextDouble();
            if (amount < 0) {
                System.out.println("Amount must be greater than zero.");

            }
        } while (amount < 0);

        sc.nextLine();

        System.out.print("Enter a memo: ");
        memo = sc.nextLine();


        theUser.addAcctTransaction(toAcct, amount, memo);

    }

    public static void showAccountTransactionHistory(User theUser, Scanner sc) {
        int theAcc;
        do {
            System.out.printf("Enter the number (1-%d) of the account  " +
                    ": ", theUser.numAccounts());
            theAcc = sc.nextInt() - 1;
            if (theAcc < 0 || theAcc >= theUser.numAccounts()) {
                System.out.println("Invalid account. Please try again.");
            }


        } while (theAcc < 0 || theAcc >= theUser.numAccounts());
        theUser.printAcctTransHistory(theAcc);


    }
}
