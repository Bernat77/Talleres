
package redtaller;
import java.util.ArrayList;


public class Cliente {
    
    private int dni;
    private String nombre;
    private String fechalta;
    private int telefono;
    private RedTaller redtaller;
    private ArrayList<Vehiculo> coches;

    public Cliente(int dni, String nombre, String fechalta, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechalta = fechalta;
        this.telefono = telefono;
        coches = new ArrayList<Vehiculo>();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechalta() {
        return fechalta;
    }

    public void setFechalta(String fechalta) {
        this.fechalta = fechalta;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public RedTaller getRedtaller() {
        return redtaller;
    }

    public void setRedtaller(RedTaller redtaller) {
        this.redtaller = redtaller;
    }

    public ArrayList<Vehiculo> getCoches() {
        return coches;
    }
    
    public void addVehiculo(Vehiculo coche){
        coches.add(coche);
        coche.setCliente(this);
    }
    
    public void removeVehiculo(Vehiculo coche){
        coches.remove(coche);
        coche.setCliente(null);
    }
    
    public void reportVehiculos(){
        for(int i = 0;i<coches.size();i++){
            System.out.print(coches.get(i).getMarca() +
                    " "+ coches.get(i).getModelo());
        }
    }
    
    public void clienteInfo(Cliente cliente){
        System.out.println("DNI: "+cliente.getDni()+
                " Nombre: "+cliente.getNombre()+"Telefono: "+cliente.getTelefono());
    }
    
    
    
} 
