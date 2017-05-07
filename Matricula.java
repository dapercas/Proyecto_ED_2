package juandegaray.matricula;
 
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
 
public class Matricula {
 
	public long id = 0;
	private Estudiante estudiante = new Estudiante("", "", "");
	private int curso = 0;
	private Collection asignaturas;
 
	public Matricula(long id,Estudiante estudiante, int curso, Collection asignaturas) {
		this.id = id;
		this.estudiante=estudiante;
		this.curso = curso;
		this.asignaturas = asignaturas;
	}
 
	public float costeMatricula(){
 
		float coste = 0;
		int creditos = 0;
 
		for (Iterator iter = asignaturas.iterator(); iter.hasNext();) {
			Asignatura element = (Asignatura) iter.next();
			creditos = creditos + element.creditos;
		}
 
		coste = creditos * 15;
		return coste;
	}
}
