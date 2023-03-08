package eva2_4_formato_apa;

/**
 *
 * @author Armando Bueno
 */
public class EVA2_4_FORMATO_APA {

    public static void main(String[] args) {
        //Libro
        Libro myLibro = new Libro();
        myLibro.setAuthor("Charles Darwin");
        myLibro.setTitle("El Origen de las Especies");
        myLibro.setYear(1859);
        myLibro.setMonth(11);
        myLibro.setDay(24);
        myLibro.setCity("Londres");
        myLibro.setEdition(6);
        myLibro.setEditor("John Murray");
        System.out.println("DATOS DEL LIBRO:");
        System.out.println("Autor: "+myLibro.getAuthor());
        System.out.println("Título: "+myLibro.getTitle());
        System.out.println("Año: "+myLibro.getYear());
        System.out.println("Mes: "+myLibro.getMonth());
        System.out.println("Día: "+myLibro.getDay());
        System.out.println("**Edición: "+myLibro.getEdition());
        System.out.println("**Editorial: "+myLibro.getEditor());
        
        //Articulo
        Articulo myArtcl = new Articulo();
        myArtcl.setAuthor("José Ramón Casar Corredera");
        myArtcl.setTitle("El ciberespacio. Nuevo escenario de confrontación");
        myArtcl.setYear(2014);
        myArtcl.setMonth(12);
        myArtcl.setDay(13);
        myArtcl.setCity("Ciudad de México");
        myArtcl.setMagazine("Anuario Mexicano de Derecho Internacional");
        myArtcl.setArtNumber("ISSN 1870-4654");
        System.out.println("\nDATOS DEL ARTÍCULO:");
        System.out.println("Autor: "+myArtcl.getAuthor());
        System.out.println("Título: "+myArtcl.getTitle());
        System.out.println("Año: "+myArtcl.getYear());
        System.out.println("Mes: "+myArtcl.getMonth());
        System.out.println("Día: "+myArtcl.getDay());
        System.out.println("Revista: "+myArtcl.getMagazine());
        System.out.println("Número de artículo: "+myArtcl.getArtNumber());
        
        //Informe
        Informe myInfome = new Informe();
        myInfome.setAuthor("Doctora Olivia López Arellano");
        myInfome.setTitle("Tnforme de Salud");
        myInfome.setYear(2021);
        myInfome.setMonth(7);
        myInfome.setDay(15);
        myInfome.setCity("Monterrey");
        myInfome.setIdentNumber("IF21948");
        myInfome.setCollabs("Juan Jacinto Jiménez, Cardelio Cardenas");
        System.out.println("\nDATOS DEL INFORME:");
        System.out.println("Autor: "+myInfome.getAuthor());
        System.out.println("Título: "+myInfome.getTitle());
        System.out.println("Año: "+myInfome.getYear());
        System.out.println("Mes: "+myInfome.getMonth());
        System.out.println("Día: "+myInfome.getDay());
        System.out.println("Número de Identificación: "+myInfome.getIdentNumber());
        System.out.println("Colaboradores: "+myInfome.getCollabs());
        
        //SitioWeb
        SitioWeb mySite = new SitioWeb();
        mySite.setAuthor("Linus Torvalds");
        mySite.setTitle("LINUX.ORG");
        mySite.setYear(1991);
        mySite.setMonth(9);
        mySite.setDay(17);
        mySite.setCity("Palo Alto California");
        mySite.setUrl("https://www.linux.org/");
        mySite.setAccessDate("08/03/2022");
        System.out.println("\nDATOS DEL SITIO WEB:");
        System.out.println("Autor: "+mySite.getAuthor());
        System.out.println("Título: "+mySite.getTitle());
        System.out.println("Año: "+mySite.getYear());
        System.out.println("Mes: "+mySite.getMonth());
        System.out.println("Día: "+mySite.getDay());
        System.out.println("URL: "+mySite.getUrl());
        System.out.println("Fecha de Acceso: "+mySite.getAccessDate());
    }
    
}
