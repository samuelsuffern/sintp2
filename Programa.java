package p2;

import org.w3c.dom.Element;

public class Programa implements Comparable<Programa>{
	private String edadMinima;
	private String langs;

	private String horaFin;
	private String nombrePrograma;
	private String categoria;
	private String horaInicio;
	private String duracion;
	private String tvml;
	private String comentario;
	public Programa() {}


	public Programa(String edadMinima, String langs, String nombrePrograma, String categoria, String horaInicio,
			String duracion, String horaFin, String tvml2,String comentario) {
		this.edadMinima = edadMinima;
		this.langs = langs;
		this.nombrePrograma = nombrePrograma;
		this.categoria = categoria;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.horaFin = horaFin;
		this.tvml = tvml2;
		this.comentario = comentario;
	}


	public String getEdadMinima() {
		return edadMinima;
	}


	public void setEdadMinima(String edadMinima) {
		this.edadMinima = edadMinima;
	}


	public String getLangs() {
		return langs;
	}


	public void setLangs(String langs) {
		this.langs = langs;
	}


	public String getNombrePrograma() {
		return nombrePrograma;
	}
	public void setNombrePrograma(String nombrePrograma) {
		this.nombrePrograma = nombrePrograma;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getTvml() {
		return tvml;
	}

	public void setTvml(String tvml) {
		this.tvml = tvml;
	}

	@Override
	public String toString() {
		return "Programa [categoria=" + categoria + ", duracion=" + duracion + ", edadMinima=" + edadMinima
				+ ", horaFin=" + horaFin + ", horaInicio=" + horaInicio + ", langs=" + langs + ", nombrePrograma="
				+ nombrePrograma + ", tvml=" + tvml + "]";
	}

	@Override
	public int compareTo(Programa p2) {
		if(this.nombrePrograma.length() == p2.getNombrePrograma().length()){
			return this.horaInicio.compareTo(p2.getHoraInicio());
		}else if (this.nombrePrograma.length() > p2.getNombrePrograma().length()){
			return 1;
		}else{
			return -1;
		}

	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
