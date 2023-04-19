package es.studium.CartaMasAlta;

public class Principal
{
	public static void main(String[] args)
	{
		//MVC
		// Modelo = conectar base datos, hacer un insert, 
		// Siempre TODO lo relacionado con la Base de Datos.
		// 
		Modelo modelo = new Modelo();
		// Vista = Pantallas, menus, cuadro dialogos...
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		// Controlador = Funcionalidad
		// podemos tener un controlador por cada vista...
		// Controlador controlador = new Controlador(modelo,menuPrincipal);
		// Lo podemos simplificar como sigue...
		new Controlador(modelo, menuPrincipal);
		
	}
}
