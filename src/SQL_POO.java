import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Scanner;

public class SQL_POO {
    public JButton APLASTAButton;
    public JPanel panel1;

    public SQL_POO() {
        APLASTAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                String urls = "jdbc:mysql://localhost:3306/estudiantes2024A";
                String user = "root";
                String password = "123456";

                try (Connection connection = DriverManager.getConnection(urls, user, password)) {
                    System.out.println("Conectado a la base de datos");
                    String query = "select * from estudiante";
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);
                    while (resultSet.next()) {

                        Scanner sc = new Scanner(System.in);
                        System.out.println("Ingrese la cedula del estudiante: ");
                        String cedula = sc.nextLine();

                        if(cedula.equals(resultSet.getString("cedula"))) {
                            System.out.println("Nombre del estudiante: " + resultSet.getString("nombre"));
                            System.out.println("Cedula: " +resultSet.getString("cedula"));
                            System.out.println("Nota 1: " + resultSet.getString("bimestreUno"));
                            System.out.println("Nota 2: " + resultSet.getString("bimestreDos"));

                            int bimestreUno = resultSet.getInt("bimestreUno");
                            int bimestreDos = resultSet.getInt("bimestreUno");
                            int sumaBimestres = bimestreDos + bimestreUno;
                            int promedio = sumaBimestres / 2;

                            if(sumaBimestres >= 28) {
                                System.out.println("El estudiante " + resultSet.getString("nombre") + " aprobo con un promedio de: " + sumaBimestres);
                                System.out.println("Promedio total: " + promedio);
                            } else {
                                System.out.println("El estudiante " + resultSet.getString("nombre") + " reprobo con un promedio de: " + sumaBimestres);
                                System.out.println("Promedio total: " + promedio);
                            }
                        }
                    }
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        });*/
                String url = "jdbc:mysql://localhost:3306/estudiantes2024a";
                String user = "root";
                String password = "";

                try (Connection connection = DriverManager.getConnection(url, user, password)) {
                    System.out.println("Conectado a la base de datos");
                    String query = "select * from estudiantes where cedula=1736492203";
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("nombre"));
                        nombreTxt.setText(resultSet.getString("nombre"));
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });



    }
}




