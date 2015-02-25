package es.opensigad.model.dao;

import java.util.List;

import es.opensigad.model.vo.AlumnoTutor;
import es.opensigad.model.vo.Tutor;

public interface TutorDAOInterface {
	

	// Recoge un idAlumno y devuelve los tutores asignados a ese alumno
	public List<AlumnoTutor> getListaAlumnoTutor(int idAlumno);

	// recibe 1 idtutor y devuelve ese tutor
	public Tutor getDetalleTutor(int id);

	// borra 1 tutor con el id recibido
	public boolean deleteTutor(int id);

	// modifica un tutor con el id recibido
	public boolean updateTutor(int idAlumno, int idTutor, String nombre, String apellido1, String apellido2, String tipoDocumento, 
			String documento, java.util.Date fechaNac, String parentesco, String sexo, String telefono, String email);

	public boolean insertarTutor(int idAlumno, String nombre, String apellido1, String apellido2, String tipoDocumento,
			String documento, java.util.Date fechaNac, String parentesco, String sexo, String telefono, String email);

}
