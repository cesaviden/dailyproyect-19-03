package es.cesaviden.IoC;

public class DirectorEmpleado implements Empleados {
	
	//Creaci�n de campo tipo Creaci�nInforme (interfaz)
	
	private CreacionInformes informeNuevo;
	
	// M�todo Init. Ejecutar tareas antes de que el bean est� disponible.
	
	public void metodoInicial() {
		
		System.out.println("Dentro del m�todo init. Aqu� ir�an las tareas a ejecutar" + 
		
		"antes del que el bean est� listo");
		
	}
	
	
	// M�todo Destroy. Ejecutar tareas despu�s de que el bean haya sido utilizado.
	
public void metodoFinal() {
		
		System.out.println("Dentro del m�todo destroy. Aqu� ir�an las tareas a ejecutar" + 
		
		"despu�s de utilizar el bean");
		
	}
	
	
    private String email;
    
    private String nombreEmpresa;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	
	// Creaci�n de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	
	}
	

	@Override
	public String getTareas() {
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director : " + informeNuevo.getInforme();
	}
}
