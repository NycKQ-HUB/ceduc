package Aplicacion;
public class Usuario_Administrador extends Usuario{
    public Usuario_Administrador(String usuario, String password) {
        super(usuario, password);
    }

    @Override
    public void mostrarInformacion() {
        // Personaliza la implementación para Administrador
        System.out.println("Administrador: " + usuario);
    }
}


