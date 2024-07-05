import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        JFrame frame = new JFrame("Mi aplicación");
        frame.setContentPane(new SQL_POO().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(9000, 9000);
        frame.pack();
        frame.setVisible(true);

    }
}