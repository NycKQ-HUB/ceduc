package Aplicacion;
public class Usuario_Alumno extends Usuario {
    public Usuario_Alumno(String usuario, String password) {
        super(usuario, password);
    }
    @Override
    public void mostrarInformacion() {
        // Personaliza la implementación para Alumno
        System.out.println("Alumno: " + usuario);
    }
    }
