package es.opensigad.model.dao;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.opensigad.model.vo.Alumno;
import es.opensigad.model.vo.AlumnoContacto;
import es.opensigad.model.vo.AlumnoDireccion;

public class AlumnoDAO implements AlumnoDAOInterfaz {

	public static final Logger logger = Logger
			.getLogger(Alumno.class.getName());

	public final static String ENTITY_MANAGER = "opensigadUnit";

	public EntityManagerFactory emf = null;
	public EntityManager em = null;

	public AlumnoDAO() {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory(ENTITY_MANAGER);
		EntityManager em = emf.createEntityManager();

	}

	public List<Alumno> getListAlumno() {

		return null;
	
	}

	public Alumno getDetalleAlumno(int numExpediente) {

		return null;
	
	}

	public boolean insertAlumno(Alumno alumno) {

		return false;
	
	}

	public boolean deleteAlumno(int idAlumno) {

		return false;
	}

	public boolean modifyAlumno(Alumno alumno) {

		return false;
	}

	public boolean insertAlumnoContacto(AlumnoContacto alumnoContacto) {

		return false;
	}

	public boolean deleteAlumnoContacto(int idContacto) {

		return false;
	}

	public boolean modifyAlumnoContacto(AlumnoContacto alumnoContacto) {

		return false;
	}

	public AlumnoContacto getDetalleAlumnoContacto(int idContacto) {

		return null;
	}

	public List<AlumnoContacto> getListAlumnoContacto(int idAlumno) {

		return null;
	
	}

	public boolean insertAlumnoDireccion(AlumnoDireccion alumnoDireccion) {

		return false;
	
	}

	public boolean deleteAlumnoDireccion(int idDireccion) {

		return false;
	
	}

	public boolean modifyAlumnoDireccion(AlumnoDireccion alumnoDireccion) {

		return false;
	
	}

	public AlumnoDireccion getDetalleAlumnoDireccion(int idDireccion) {

		return null;
	
	}

	public List<AlumnoDireccion> getListAlumnoDireccion(int idAlumno) {

		return null;

	}

}
