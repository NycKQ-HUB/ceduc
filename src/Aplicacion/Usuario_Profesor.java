package Aplicacion;
public class Usuario_Profesor extends Usuario {
    public Usuario_Profesor(String usuario, String password) {
        super(usuario, password);
    }

    @Override
    public void mostrarInformacion() {
        // Personaliza la implementación para Profesor
        System.out.println("Profesor: " + usuario);
    }
    public static void main(String[] args) {
Usuario_Profesor user = (Usuario_Profesor) Usuario.verificarUsuario("profe", "1234");    }
}
