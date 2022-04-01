import java.util.Scanner;
import java.util.ArrayList;;

public class tarea1 {
	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nombre = "", mail = "", numero = "", busqueda;
    boolean nombrebool, numerobool, mailbool, nom;
    ArrayList<Contacto> contactos = new ArrayList<>();

    System.out.println("|-------------------AGENDA-------------------|");
    System.out.println("|-1 Ingresar un contacto                     |");
    System.out.println("|-2 Consultar un contacto ya existente       |");
    System.out.println("|--------------------------------------------|");
    System.out.println("");
    System.out.println("Ingrese una opcion");

    int menu = entrada.nextInt();
    switch (menu) {
      case 1:
      nombrebool = true;
      numerobool = true;
      mailbool = true;
      nom=true;
      while(nombrebool) {

        if(!nom){
        System.out.println("Ingrese el nombre del contacto [obligatorio]");
        }
        nombre = entrada.nextLine();
        if(nombre.length() < 1) {
            if(nom){
              nom=false;
            } else {
            System.out.println("No ingreso nada pruebe denuevo");
          }
        } else {
            nombrebool = false;
        }
      }
      while(numerobool) {
        System.out.println("Ingrese el numero del contacto");
        numero = entrada.nextLine();
        if(numero.length() < 1) {
            System.out.println("No ingreso nada pruebe denuevo");
        } else {
            numerobool = false;
        }
      }
      while(mailbool) {

      System.out.println("Ingrese el mail del contacto [opcional]");
      mail = entrada.nextLine();
      if(mail.length() > 0){
        if(mail.contains("@") && mail.contains(".")) {
          mailbool = false;
        } else {
        System.out.println("Este no es un mail valido");}
      } else {
        mailbool = false;
      }
    }
        Contacto contacto = new Contacto( nombre, numero, mail);
        contactos.add(contacto);
        System.out.println(contacto);
        break;
      case 2:
      System.out.println("Ingrese el nombre del contacto");
      System.out.println(contactos.size());
      busqueda = entrada.next();
      for (int i=0; i < contactos.size() ; i++) {
        System.out.println(contactos.get(i).getNombre());
      }
      break;
      default:
        break;
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
}
