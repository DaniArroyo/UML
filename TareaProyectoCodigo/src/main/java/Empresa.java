/*******************************************************************************
 * 2019, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)
import java.util.HashSet;
// End of user code

/**
 * Description of Empresa.
 * 
 * @author Daniel
 */
public class Empresa {
	/**
	 * Description of the property direccion.
	 */
	private String direccion = "";

	/**
	 * Description of the property razon_social.
	 */
	private String razon_social = "";

	/**
	 * Description of the property tlf.
	 */
	private String tlf = "";

	/**
	 * Description of the property clientes.
	 */
	public HashSet<Cliente> clientes = new HashSet<Cliente>();

	/**
	 * Description of the property CIF.
	 */
	private String CIF = "";

	// Start of user code (user defined attributes for Empresa)

	// End of user code

	/**
	 * The constructor.
	 */
	public Empresa() {
		// Start of user code constructor for Empresa)
		super();
		// End of user code
	}

	/**
	 * Description of the method asignar.
	 * @param cif 
	 * @param rs 
	 * @param dir 
	 * @param tlf 
	 */
	public void asignar(String cif, String rs, String dir, String tlf) {
		// Start of user code for method asignar
		// End of user code
	}

	/**
	 * Description of the method obtener.
	 * @return 
	 */
	public Empresa obtener() {
		// Start of user code for method obtener
		Empresa obtener = null;
		return obtener;
		// End of user code
	}

	// Start of user code (user defined methods for Empresa)

	// End of user code
	/**
	 * Returns direccion.
	 * @return direccion 
	 */
	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * Sets a value to attribute direccion. 
	 * @param newDireccion 
	 */
	public void setDireccion(String newDireccion) {
		this.direccion = newDireccion;
	}

	/**
	 * Returns razon_social.
	 * @return razon_social 
	 */
	public String getRazon_social() {
		return this.razon_social;
	}

	/**
	 * Sets a value to attribute razon_social. 
	 * @param newRazon_social 
	 */
	public void setRazon_social(String newRazon_social) {
		this.razon_social = newRazon_social;
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
	 * Returns clientes.
	 * @return clientes 
	 */
	public HashSet<Cliente> getClientes() {
		return this.clientes;
	}

	/**
	 * Returns CIF.
	 * @return CIF 
	 */
	public String getCIF() {
		return this.CIF;
	}

	/**
	 * Sets a value to attribute CIF. 
	 * @param newCIF 
	 */
	public void setCIF(String newCIF) {
		this.CIF = newCIF;
	}

}
