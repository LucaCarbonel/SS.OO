import java.util.Scanner;
import java.util.ArrayList;;

// Cuida la indentacion!
public class tarea1 {
	public static void main(String[] args) {
    // las variables definilas cerca del codigo donde la usas.\
    // No es nada buena practica definirlas arriba.

    // tenes que pensar en el scope, que para contactos entrada tiene 
    // sentido que persista en cada iteracion del loop principal
    Scanner entrada = new Scanner(System.in);
    ArrayList<Contacto> contactos = new ArrayList<>();
    
    // te falta una pieza clave que es el while
    while (true) {
    System.out.println("|-------------------AGENDA-------------------|");
    System.out.println("|-1 Ingresar un contacto                     |");
    System.out.println("|-2 Consultar un contacto ya existente       |");
    System.out.println("|--------------------------------------------|\n\nIngrese una opcion");

    int menu = entrada.nextInt();
    switch (menu) {
      case 1:
      // Que complicaados todos esas flagas! Vamos por algo simple...
      System.out.println("Ingrese el nombre del contacto [obligatorio]");
      String nombre;
      do {
        nombre = entrada.nextLine();
      } while (nombre.isEmpty());

      // idem para telefono....
      while(numerobool) {
        System.out.println("Ingrese el numero del contacto");
        numero = entrada.nextLine();
        if(numero.length() < 1) {
            System.out.println("No ingreso nada pruebe denuevo");
        } else {
            numerobool = false;
        }
      }
      // super complejo. Esto que te parece?
      String mail;
      do {
        mail = input.nextLine();
      } while (!nombre.isEmpty() && !mailIsValid(mail)); // supongo que defini esa funcion arriba mailIsValid 

        Contacto contacto = new Contacto( nombre, numero, mail);
        contactos.add(contacto);
        System.out.println(contacto);
        break;
      case 2:
      System.out.println("Ingrese el nombre del contacto");
      System.out.println(contactos.size());
      String busqueda = entrada.nextLine();
      for (int i=0; i < contactos.size() ; i++) {
        // Aca falto otra pieza clave que es...
        if (contactos.get(i).getNombre().equals(busqueda)) {
          System.out.println(contactos.get(i).presentate());
        }
      }
      break;
      default:
        break;
    }
    }
  }
}

  class Contacto {
    private String nombre, mail;
	private String numero;
	public Contacto(String nombre, String numero, String mail) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.mail = mail;

	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

  // para que se imprime
  public String presentate() {
    return "Contacto [nombre=" + nombre + ", mail=" + mail + ", numero=" + numero + "]";
  }
}
