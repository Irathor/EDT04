/**
 * @author Juanma
 *
 */
public class CCuenta {

	/**
	 * parámetros privados
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    /**el nombre de la variable ha sido cambiada*/
    private double tipoInteros;

    public CCuenta()
    {
    }
    /**
     * método público para meter valores
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Método para recoger el saldo
     * @return
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * método para ingresar dinero
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * método para retirar dinero
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * getter de nombre
     * @return
     */
	private String getNombre() {
		return nombre;
	}

	/**
	 * setter de nombre
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * getter de cuenta
	 * @return
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * setter de cuenta
	 * @param cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * getter de saldo
	 * @return
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * setter de saldo
	 * @param saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * getter de tipoInteros
	 * @return
	 */
	private double getTipoInteros() {
		return tipoInteros;
	}

	/**
	 * setter de tipoInteros
	 * @param tipoInteros
	 */
	private void setTipoInteros(double tipoInteros) {
		this.tipoInteros = tipoInteros;
	}
}
