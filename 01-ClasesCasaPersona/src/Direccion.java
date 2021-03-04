public class Direccion {

	private String tipoVia;
	private String nombreVia;
	private int cp;

	public Direccion(String tipoVia, String nombreVia, int cp) {
		super();
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.cp = cp;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", cp=" + cp + "]";
	}

}
