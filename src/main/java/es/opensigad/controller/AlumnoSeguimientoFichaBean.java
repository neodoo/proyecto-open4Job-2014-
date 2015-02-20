package es.opensigad.controller;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import es.opensigad.model.dao.AlumnoSeguimientoDAO;
import es.opensigad.model.vo.AlumnoSeguimiento;

@ManagedBean
@RequestScoped
public class AlumnoSeguimientoFichaBean {

	private int id;
	private int idMatricula;
	private Date fecha;
	private String sesion;
	private String materia;
	private String tipo;
	private String justificado;
	private String observaciones;

	private AlumnoSeguimiento seguimiento = new AlumnoSeguimiento();
	private List<AlumnoSeguimiento> seguimientos;

	

	public long getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public long getIdMatricula() {
		return idMatricula;
	}


	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getSesion() {
		return sesion;
	}


	public void setSesion(String sesion) {
		this.sesion = sesion;
	}


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getJustificado() {
		return justificado;
	}


	public void setJustificado(String justificado) {
		this.justificado = justificado;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	
	public AlumnoSeguimiento getSeguimiento() {
		return seguimiento;
	}


	public void setSeguimiento(AlumnoSeguimiento seguimiento) {
		this.seguimiento = seguimiento;
	}


	public List<AlumnoSeguimiento> getSeguimientos() {
		return seguimientos;
	}


	public void setSeguimientos(List<AlumnoSeguimiento> seguimientos) {
		this.seguimientos = seguimientos;
	}


	public String getDetalleAlumnoSeguimiento() {
		String pagina = "AlumnoFalta";
		AlumnoSeguimientoDAO seguimientoDAO = new AlumnoSeguimientoDAO();
		seguimiento = seguimientoDAO.getDetalleAlumnoSeguimiento(id);
		
		return pagina;
	}
	
	public String getListaAlumnoSeguimiento() {
		String pagina = "AlumnoFaltaListado";
		AlumnoSeguimientoDAO seguimientoDAO = new AlumnoSeguimientoDAO();
		seguimientos = seguimientoDAO.getListaAlumnoSeguimiento(idMatricula);

		return pagina;
	}
	
	public String insertarAlumnoSeguimiento() {
		String pagina=null;
		AlumnoSeguimientoDAO alumnoSeguimientoDAO = new AlumnoSeguimientoDAO();

		long count = alumnoSeguimientoDAO.insertarAlumnoSeguimiento(seguimiento);
		if (count == 1){
			pagina = "insertarAlumnoFaltaExito";
		}else{
			pagina = "insertarAlumnoFaltaFallo";
		}
		return pagina;
	}
	
	public String actualizarAlumnoSeguimiento() {
		String pagina=null;
		AlumnoSeguimientoDAO alumnoSeguimientoDAO = new AlumnoSeguimientoDAO();

		long count = alumnoSeguimientoDAO.actualizarAlumnoSeguimiento(seguimiento);
		
		if (count == 1){
			pagina = "actualizarAlumnoFaltaExito";
		}else{
			pagina = "actualizarAlumnoFaltaFallo";
		}
		return pagina;
	}

	public String eliminarAlumnoSeguimiento() {
		String pagina=null;
		AlumnoSeguimientoDAO alumnoSeguimientoDAO = new AlumnoSeguimientoDAO();
	
		long count = alumnoSeguimientoDAO.eliminarAlumnoSeguimiento(seguimiento.getId());
		
		if (count == 1){
			pagina = "eliminarAlumnoFaltaExito";
		}else{
			pagina = "eliminarAlumnoFaltaFallo";
		}
		return pagina;
	}
}