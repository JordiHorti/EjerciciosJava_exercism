/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordi
 */
public class LogLevels {
    public static final String INFO = "INFO";
    public static final String WARNING  = "WARNING";
    public static final String ERROR = "ERROR";

    public static String message(String logLine) {
        String[] parts = logLine.split(": ", 2);

        if (parts.length == 2) {
            String message = parts[1].trim(); // Elimina espacios en blanco iniciales y finales
            return message;
        } else {
            return logLine; // Si el formato no coincide, devuelve la línea original.
        }
    }

    public static String logLevel(String logLine) {
        String[] parts = logLine.split(": ", 2);

        if (parts.length == 2) {
            String level = parts[0].substring(1, parts[0].length() - 1).toLowerCase();
            return level;
        } else {
            return ""; // Si el formato no coincide o no hay nivel, devuelve una cadena vacía.
        }
    }

    public static String reformat(String logLine) {
        // Divide la línea de registro en dos partes, usando ":" como separador
        String[] parts = logLine.split(": ");
        
        if (parts.length == 2) {
            String message = parts[1].trim(); // El segundo elemento es el mensaje
            String level = parts[0].substring(1,parts[0].length() -1).toLowerCase();   // El primer elemento es el nivel de registro

            // Formatea la línea de registro con el mensaje primero y el nivel después entre paréntesis
            return message + " (" + level + ")";
        } else {
            // Si la línea de registro no se puede dividir en dos partes, devuelve la línea original
            return logLine;
        }
    } 
    public static void main(String[] args) {
        String message1 = LogLevels.message("[ERROR]: Invalid operation");
        String message2 = LogLevels.message("[WARNING]:  Disk almost full\r\n");
        String LogLevel = LogLevels.logLevel("[ERROR]: Invalid operation");
        String reformat = LogLevels.reformat("[INFO]: Operation completed");
        
        System.out.println(message1 + "\n" + message2 + "\n" + LogLevel + "\n" + reformat);
    }
}

