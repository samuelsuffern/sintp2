package p2;

import java.util.ArrayList;

import org.w3c.dom.Element;

public class Canal implements Comparable<Canal>{
	private String lang;

	private String idCanal;

	private String nombreCanal;
    private String grupo;

		private ArrayList<Programa> programas = new ArrayList<Programa>();



	public Canal(){}

	public Canal(String lang, String idCanal, String nombreCanal, String grupo, ArrayList<Programa> programas) {
		this.lang = lang;
		this.idCanal = idCanal;
		this.nombreCanal = nombreCanal;
		this.grupo = grupo;
		this.programas = programas;
	}


	public static Canal getCanalByName(ArrayList<Canal> listaCanal,String name){
		for (Canal canal : listaCanal) {
			if(canal.getNombreCanal().equals(name)){
				return canal;
			}
		}
		return null;

	}
	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getIdCanal() {
		return idCanal;
	}

	public void setIdCanal(String idCanal) {
		this.idCanal = idCanal;
	}
	public String getNombreCanal() {
		return nombreCanal;
	}
	public void setNombreCanal(String nombreCanal) {
		this.nombreCanal = nombreCanal;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public ArrayList<Programa> getProgramas() {
		return programas;
	}

	public void setProgramas(ArrayList<Programa> programas) {
		this.programas = programas;
	}

	@Override
	public String toString() {
		return "Canal [grupo=" + grupo + ", idCanal=" + idCanal + ", lang=" + lang + ", nombreCanal=" + nombreCanal
				+ ", programas=" + programas + "]";
	}

	@Override
	public int compareTo(Canal canal2) {
		return this.nombreCanal.compareTo(canal2.getNombreCanal());
	}






}
