package dominio;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class ej14_9 {
    public static String concatenarCadenas(List<String> al){
        return Stream.iterate(0,i->i+1).limit(al.size()).map(i->al.get(i)).reduce("",(a,b)->a+b);
    }
}
