import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Estudiantes {
    public JButton okButton;
    public JPanel panel1;
    public JTextField consultaTxt;
    public JLabel resultadoTxt;
    public JTextArea bcrCedula;
    public JTextField consulta12Txt;
    public JTextArea bcrNombre;
    public JButton okbutton2;


    public Estudiantes() {

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String url = "jdbc:mysql://localhost:3306/estudiantes2024a";
                    String user = "root";
                    String password = "123456";

                    try (Connection connection = DriverManager.getConnection(url, user, password)) {
                        System.out.println("Conectado a la base de datos");
                        String query = "SELECT * FROM estudiantes WHERE cedula='" + consultaTxt.getText() + "'";

                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(query);

                        if (resultSet.next()) {
                            String nombre = resultSet.getString("nombre");
                            String cedula = resultSet.getString("cedula");
                            double bimestreUno = resultSet.getInt("b1");
                            double bimestreDos = resultSet.getInt("b2");

                            double sumaBimestres = bimestreUno + bimestreDos;
                            double promedio = sumaBimestres / 2;

                            resultadoTxt.setText("<html>Nombre del estudiante: " + nombre + "<br>" +
                                    "Cedula: " + cedula + "<br>" +
                                    "Nota 1: " + bimestreUno + "<br>" +
                                    "Nota 2: " + bimestreDos + "<br>" +
                                    "Promedio: " + promedio + "</html>");
                        } else {
                            resultadoTxt.setText("Estudiante no encontrado");
                        }
                    } catch (SQLException ex) {
                        System.out.println("Error al ejecutar la consulta: " + ex.getMessage());
                }
            }
        });

        consultaTxt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        consulta12Txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });


        okbutton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String url = "jdbc:mysql://localhost:3306/estudiantes2024a";
                    String user = "root";
                    String password = "123456";

                    try (Connection connection = DriverManager.getConnection(url, user, password)) {
                        System.out.println("Conectado a la base de datos");
                        String query = "SELECT * FROM estudiantes WHERE nombre='" + consulta12Txt.getText() + "'";

                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(query);

                        if (resultSet.next()) {
                            String nombre = resultSet.getString("nombre");
                            String cedula = resultSet.getString("cedula");
                            double  bimestreUno = resultSet.getInt("b1");
                            double bimestreDos = resultSet.getInt("b2");

                            double sumaBimestres = bimestreUno + bimestreDos;
                            double promedio = sumaBimestres / 2;

                            resultadoTxt.setText("<html>Nombre del estudiante: " + nombre + "<br>" +
                                    "Cedula: " + cedula + "<br>" +
                                    "Nota 1: " + bimestreUno + "<br>" +
                                    "Nota 2: " + bimestreDos + "<br>" +
                                    "Promedio: " + promedio + "</html>");
                        } else {
                            resultadoTxt.setText("Estudiante no encontrado");
                        }
                    } catch (SQLException ex) {
                        System.out.println("Error al ejecutar los datos!." + ex.getMessage());
                    }
            }
        });
    }

}




