package es.opensigad.model.dao;

import java.util.ArrayList;

import es.opensigad.model.vo.Alumno;
import es.opensigad.model.vo.AlumnoMatricula;
import es.opensigad.model.vo.Centro;
import es.opensigad.model.vo.Ensenanza;

public interface AlumnoMatriculaDAOInterfaz {

	public boolean insertarMatricula(Alumno idAlumno,int cursoEscolar, Centro centro,
			Ensenanza ensenanza, String modulo, int curso);

	public boolean borrarMatricula(int idMatricula);

	public boolean modificarMatricula(int idAlumno, int cursoEscolar,
			String centro, String ensenanza, String modulo,
			int curso, int idMatricula);

	public ArrayList<AlumnoMatricula> getListadoMatricula(int idAlumno);
	
	public AlumnoMatricula getListaFichaMatricula(int idMatricula);

}
