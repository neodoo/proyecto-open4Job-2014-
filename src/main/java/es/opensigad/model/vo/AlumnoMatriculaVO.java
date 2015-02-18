package es.opensigad.model.vo;

public class AlumnoMatriculaVO {
	
	private int id;
	private int cursoEscolar;
	private String centro;
	private String ensenanza;
	private String modulo;
	private int curso;
	private int idAlumno;
	
public AlumnoMatriculaVO(){
		
	}

	public AlumnoMatriculaVO(int id,int cursoEscolar,String centro,String ensenanza, String modulo,
			int curso,int idAlumno){
		
		this.id=id;
		this.cursoEscolar=cursoEscolar;
		this.centro=centro;
		this.ensenanza=ensenanza;
		this.modulo=modulo;
		this.curso=curso;
		this.idAlumno=idAlumno;
		
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCursoEscolar() {
		return cursoEscolar;
	}

	public void setCursoEscolar(int cursoEscolar) {
		this.cursoEscolar = cursoEscolar;
	}

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	@Override
	public String toString() {
		return "AlumnoMatriculaVO [id=" + id + ", curso_escolar="
				+ cursoEscolar + ", centro=" + centro + ", ensenanza="
				+ ensenanza + ", modulo=" + modulo + ", curso=" + curso
				+ ", idAlumno=" + idAlumno + "]";
	}



	

}
