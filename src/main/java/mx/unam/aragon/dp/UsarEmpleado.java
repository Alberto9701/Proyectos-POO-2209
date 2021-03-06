
package mx.unam.aragon.dp;

public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado emp1=new Empleado(1, "Sistemas", 45000.0f, 15);
        emp1.setNombre("Alberto");
        emp1.setApPaterno("Mejia");
        emp1.setApMaterno("Martinez");
        emp1.setEdad(24);
        emp1.setCurp("MEMA010809HDFJL6");
        System.out.println("infor:" + emp1);
        
        
    }
}
