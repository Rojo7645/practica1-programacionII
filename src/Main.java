import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //cliente
        Cliente carlos = new Cliente(1,"Carlos","Peres","Vargas");

        //ciudad
        Ciudad cochabamba = new Ciudad(1,"Cochabamba");
        Ciudad samtaCruz = new Ciudad(2,"santaCruz");
        Ciudad tarija = new Ciudad(3,"tarija");

        //categoria
        Categoria turista = new Categoria(1,"turista");

        //aeropuertos
        Aeropuerto jorgeWilstermann = new Aeropuerto("jw","Aeropuerto Internacional Jorge Wilstermann Camacho",cochabamba);
        Aeropuerto viruViru = new Aeropuerto("vv","VIRU VIRU", samtaCruz);
        Aeropuerto orielLea = new Aeropuerto("OL","orielLea", tarija);

        //vuelos
        List<Vuelo> vuelos = new ArrayList<>();
        Vuelo cochabambaSantaCruz = new Vuelo("BOA-158",Calendar.getInstance().getTime(), jorgeWilstermann, viruViru);
        vuelos.add(cochabambaSantaCruz);
        Vuelo santaCruzTarija = new Vuelo("BOA-159",Calendar.getInstance().getTime(), viruViru, orielLea);
        vuelos.add(santaCruzTarija);

        //billete
        Billete billete = new Billete(1,Calendar.getInstance().getTime(), 650.5, carlos, cochabamba, tarija, turista, vuelos);

        System.out.println("billete");
        System.out.println("*******************");
        System.out.println("id"+billete.getIdBillete());
        System.out.println("fecha"+ billete.getFechaEmision());
        System.out.println("precio" + billete.getPrecioTotal());
        System.out.println("cliente" + billete.getCliente());
        System.out.println("origen" + billete.getOrigem().getNombre());
        System.out.println("destino" + billete.getDestino().getNombre());
        System.out.println("categoria" +billete.getCategoria().getNombre());
        System.out.println("vuelos");
        for (Vuelo vuelo:billete.getVuelos()) {

            System.out.println("codigo vuelo" + vuelo.getCodigoVuelo()+ "| salida" + vuelo.getSalida() + "| origen" + vuelo.getOrigen());
        }

    }
}
