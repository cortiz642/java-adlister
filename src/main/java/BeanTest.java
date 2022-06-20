import model.Album;
import model.Author;
import model.Quote;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class BeanTest {
    public static void main(String[] args) {
        Date backInBlack = new Date(1980, 01, 15);
        Album ACDC = new Album(1, "AC/DC", "Back in Black", backInBlack, 300, "Metal");

        Quote MayaAngelo = new Quote(1, "You will face many defeats in life, but never let yourself be defeated.", "Maya Angelo");
        Author NikolaTesla = new Author(1, "Nikola", "Tesla");


        Quote NelsonMandela = new Quote(2, "The greatest glory in living lies not in never falling, but in rising every time we fall.", "Nelson Mandela");
        Author AlbertEinstein = new Author(2, "Albert", "Einstein");

        Quote LeonardoDaVinci = new Quote(3, "Learning never exhausts the mind", "Leonardo Da Vinci");
        Author GalileoGalilei = new Author(3, "Galileo", "Galilei");



//        ArrayList<Quote> quotes = new ArrayList<>();
//        quotes.add(MayaAngelo);
//        quotes.add(NelsonMandela);
//        quotes.add(LeonardoDaVinci);

//        for(Quote q : quotes){
//            System.out.println(Quote.getContent());
//            System.out.println(q.getAuthor());
//            System.out.println(q.getId());
//        }
    }
}
