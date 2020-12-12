/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;


import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Henry
 */
@WebService(serviceName = "NewWebService")
@Stateless()
public class NewWebService {

    /**
     * This is a sample web service operation
     */
   // @WebMethod(operationName = "hello")
    //public String hello(@WebParam(name = "name") String txt) {
      //  return "Hello " + txt + " !";
    //}

    /**
     * Web service operation
     */
    //@WebMethod(operationName = "suma")
    //public Integer suma(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
      
    //return a+b;
    //}

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public List<String> operation(@WebParam(name = "ci") int ci) {

        Connection conexion=null;
        String pass="123456";
        String user="postgres";
        List<String> datos = new ArrayList<String>();

      try{
          Class.forName("org.postgresql.Driver");
          conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/materias",user,pass);
          java.sql.Statement st=conexion.createStatement();
          String sql="SELECT ci, materiauno,materiados,materiatres FROM materia WHERE ci=" + ci;
          ResultSet res=st.executeQuery(sql);
          while(res.next()){
                datos.add(res.getString("ci"));
                datos.add(res.getString("materiauno"));
                datos.add(res.getString("materiados"));
                datos.add(res.getString("materiatres"));
           }
          res.close();
          st.close();
          conexion.close();
           
       }
      catch(Exception e){
         System.err.println( e.getMessage() );
      }
      return datos;
   }

    /**
     * Web service operation
     */


}
