package Aplicacion;
public abstract class Usuario {
    // Atributos comunes de los usuarios
    protected String usuario;
    protected String password;

    // Array estático y privado que contiene los usuarios válidos
    private static Usuario[] usuarios = {
        new Usuario_Administrador("admin", "1234"),
        new Usuario_Profesor("profe", "1234"),
        new Usuario_Alumno("alumno", "1234")
    };

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
   public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    
    public void mostrarInformacion() {
        // Implementación por defecto
        System.out.println("Usuario: " + usuario);
    }

    // Método estático y público que verifica el tipo de usuario
    public static Usuario verificarUsuario(String usuario, String password) {
        // Recorre el array y compara el usuario y la contraseña con los del array
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }
 
}

