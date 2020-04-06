//Para este ejercicio se asume que la clase FuncionesUsuario sólo contiene los métodos para realizar los cálculos correspondientes.
//El desarrollador debería en el main llamarlos con los parámetros adecuados.

public class FuncionesUsuario{

	public double calculoDeIpuestos(int hijos, int edad){
		//Determinación de la base impositiva
		double impuesto = 2000;
		double tasaDeduccion = 0.03;
		if(edad < 18){
			return 0;
		}
		else if(edad > 30 && edad <= 65){
			impuesto = 7000;	
		}
		//Deduciones
		if ((impuestos*hijos*tasaDeduccion) >= impuesto/2){
			impuesto = (impuesto/2);
		}
		else {
			impuesto = impuesto - (impuestos*hijos*tasaDeduccion);
		}
		return impuesto;
	}

	public void cobroDeSueldo(Usuario usuario, double impuesto, int salario){
		int saldo = usuario.getSaldo();
		saldo = saldo + (salario - impuesto);
		usuario.setSaldo(saldo);
	}
}