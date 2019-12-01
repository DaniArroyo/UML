/*******************************************************************************
 * 2019, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)
import java.util.HashSet;
// End of user code

/**
 * Description of Cliente.
 * 
 * @author Daniel
 */
public class Cliente {
	/**
	 * Description of the property cod_cli.
	 */
	private int cod_cli = 0;

	/**
	 * Description of the property nombre.
	 */
	private String nombre = "";

	/**
	 * Description of the property fec_nac.
	 */
	private String fec_nac = "";

	/**
	 * Description of the property tlf.
	 */
	private String tlf = "";

	/**
	 * Description of the property nom_empresa.
	 */
	private String nom_empresa = "";

	/**
	 * Description of the property comision.
	 */
	private float comision = 0F;

	// Start of user code (user defined attributes for Cliente)

	// End of user code

	/**
	 * The constructor.
	 */
	public Cliente() {
		// Start of user code constructor for Cliente)
		super();
		// End of user code
	}

	/**
	 * Description of the method asignar.
	 * @param cd 
	 * @param nom 
	 * @param fn 
	 * @param tlf 
	 * @param ne 
	 * @param com 
	 */
	public void asignar(int cd, String nom, String fn, String tlf, String ne, float com) {
		// Start of user code for method asignar
		// End of user code
	}

	/**
	 * Description of the method obtener.
	 * @return 
	 */
	public Cliente obtener() {
		// Start of user code for method obtener
		Cliente obtener = null;
		return obtener;
		// End of user code
	}

	// Start of user code (user defined methods for Cliente)

	// End of user code
	/**
	 * Returns cod_cli.
	 * @return cod_cli 
	 */
	public int getCod_cli() {
		return this.cod_cli;
	}

	/**
	 * Sets a value to attribute cod_cli. 
	 * @param newCod_cli 
	 */
	public void setCod_cli(int newCod_cli) {
		this.cod_cli = newCod_cli;
	}

	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns fec_nac.
	 * @return fec_nac 
	 */
	public String getFec_nac() {
		return this.fec_nac;
	}

	/**
	 * Sets a value to attribute fec_nac. 
	 * @param newFec_nac 
	 */
	public void setFec_nac(String newFec_nac) {
		this.fec_nac = newFec_nac;
	}

	/**
	 * Returns tlf.
	 * @return tlf 
	 */
	public String getTlf() {
		return this.tlf;
	}

	/**
	 * Sets a value to attribute tlf. 
	 * @param newTlf 
	 */
	public void setTlf(String newTlf) {
		this.tlf = newTlf;
	}

	/**
	 * Returns nom_empresa.
	 * @return nom_empresa 
	 */
	public String getNom_empresa() {
		return this.nom_empresa;
	}

	/**
	 * Sets a value to attribute nom_empresa. 
	 * @param newNom_empresa 
	 */
	public void setNom_empresa(String newNom_empresa) {
		this.nom_empresa = newNom_empresa;
	}

	/**
	 * Returns comision.
	 * @return comision 
	 */
	public float getComision() {
		return this.comision;
	}

	/**
	 * Sets a value to attribute comision. 
	 * @param newComision 
	 */
	public void setComision(float newComision) {
		this.comision = newComision;
	}

}
