
package com.menesestech.sistemainventario.models;

public class Main {
    public static void main(String[] args) {
        ConnectionMySQL sql = new ConnectionMySQL();
        
        if (sql.getConnection() != null) {
            System.out.println("Se logro");
        }else{
            System.out.println("Vuelva a intentarlo");
        }
    }
}
