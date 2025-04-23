package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
    private Boolean estaAbierta = true;
    private Integer password;

    public Boolean estaAbierta() {
        return estaAbierta;
    }

    public void cerrar(Integer password) {
        if (this.estaAbierta) {
            this.password = password;
            this.estaAbierta = false;
        }
    }

    public void abrir(Integer password) {
        if (password.equals(this.password)) {
            this.estaAbierta = true;
        }
    }

}
