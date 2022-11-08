/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Jaime
 */
public class Fecha {
    


public static String darMesCompleto(){
        Calendar fecha= new GregorianCalendar();
String anho= Integer.toString(fecha .get(Calendar.YEAR));
String mes= Integer .toString(fecha.get(Calendar.MONTH));



String dia= Integer.toString(fecha. get(Calendar.DATE));
String fechaCompleta="Hoy es " +dia+"/"+mes+"/"+anho;
String mesString="";

if(mes.equals("1")){
    
mesString="Enero";
}else if(mes.equals("2")){

mesString="Febrero";
}else if(mes.equals("3")){

mesString="Marzo";
}else if(mes.equals("4")){

mesString="Abril";
}else if(mes.equals("5")){

mesString="Mayo";
}else if(mes.equals("6")){

mesString="Junio";
}else if(mes.equals("7")){

mesString="Julio";
}else if(mes.equals("8")){

mesString="Agosto";
}else if(mes.equals("9")){

mesString="Septiembre";
}else if(mes.equals("10")){

mesString="Octubre";
}else if(mes.equals("11")){

mesString="Noviembre";
}else if(mes.equals("12")){

mesString="Diciembre";
}
 return "Hoy es "+dia+" de "+mesString+" del "+anho;   
}
}
