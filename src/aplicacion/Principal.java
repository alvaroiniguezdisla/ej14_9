package aplicacion;
import java.util.List;
import dominio.ej14_9;
public class Principal {
    public static void main(String[] args) {
        List<String> al = List.of("Hola"," ","mundo"," ","cruel");
        System.out.println(ej14_9.concatenarCadenas(al));
    }
}
