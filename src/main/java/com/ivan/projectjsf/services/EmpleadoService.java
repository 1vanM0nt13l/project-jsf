/**
 * 
 */
package com.ivan.projectjsf.services;

import java.util.List;
import java.util.ArrayList;

import com.ivan.projectjsf.entity.Empleado;

/**
 * @author omar_montiel
 *Clase que permite realizar la logica de negocios para empleados.
 */
public class EmpleadoService {
	/**
	 * Metodo que permite consultar la lista de empleados de empresas de TI
	 * @return  {@link Empleado} lista de empleados.
	 */
	public List<Empleado> consultarEmpleados(){
		
		//Generamos la lista de empleados
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("Lopez");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Ivan");
		empleadoMicrosoft.setPrimerApellido("Montiel");
		empleadoMicrosoft.setSegundoApellido("Huitron");
		empleadoMicrosoft.setPuesto("junior Developer Java");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Oscar");
		empleadoApple.setPrimerApellido("Sanchez");
		empleadoApple.setSegundoApellido("Lopez");
		empleadoApple.setPuesto("Senior Developer");
		empleadoApple.setEstatus(false);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
	}

}
