package com.example;

import org.apache.log4j.Logger;
import com.google.gson.Gson;

import java.sql.*;
import java.util.ArrayList;

public class DB {

    public DB(){

    }

    final static Logger log = Logger.getLogger(PB.class);
    private static Connection con;
    private static Statement st;
    private static ResultSet rs;
    private static String query;

    public ArrayList user(){
        ArrayList<User> usr = new ArrayList<>();
        Gson gson = new Gson();
        String URL = "jdbc:mysql://localhost:3306/test";

        try {
            con = DriverManager.getConnection(URL, "root", "1004");
            st = con.createStatement();
            query = "SELECT * FROM user";
            rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String fio = rs.getString("fio");
                String phone = rs.getString("phone");
                String address = rs.getString("address");

                usr.add(new User(fio, phone, address));
            }
        }
        catch (SQLException error){
            log.error("SQLException", error);
        }

        return usr;
    }

    public ArrayList fiz(){
        ArrayList<Fiz> fiz = new ArrayList<>();
        Gson gson = new Gson();
        String URL = "jdbc:mysql://localhost:3306/test";

        try {
            con = DriverManager.getConnection(URL, "root", "1004");
            st = con.createStatement();
            query = "SELECT * FROM fiz";
            rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String fio = rs.getString("fio");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String number = rs.getString("number");

                fiz.add(new Fiz(fio, phone, address, number));
            }
        }
        catch (SQLException error){
            log.error("SQLException", error);
        }

        return fiz;
    }

    public ArrayList ur(){
        ArrayList<Ur> ur = new ArrayList<>();
        Gson gson = new Gson();
        String URL = "jdbc:mysql://localhost:3306/test";

        try {
            con = DriverManager.getConnection(URL, "root", "1004");
            st = con.createStatement();
            query = "SELECT * FROM ur";
            rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String fio = rs.getString("fio");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String inn = rs.getString("inn");

                ur.add(new Ur(fio, phone, address, inn));
            }
        }
        catch (SQLException error){
            log.error("SQLException", error);
        }

        return ur;
    }
}
