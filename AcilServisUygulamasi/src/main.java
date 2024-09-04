
import java.util.PriorityQueue;
import java.util.Queue;

public class main {  
    public static void main(String[] args) {
       /* Acil Servis Uygulaması
        
        Hastalar Acil Serviste şikayetlerine göre kuyrukta en önlere geçecek(PriorityQueue).
        
        Apandisit ----> En yüksek öncelik
        Yanık -------> Orta Öncelik
        Baş Ağrısı ---> En düşük öncelik
        
        */
       
       Queue<Hasta> acilservis = new PriorityQueue<Hasta>();
        
       acilservis.offer( new Hasta("Murat Bey","Yanik"));
       acilservis.offer( new Hasta("Okan Bey","Bas Agrisi"));
       acilservis.offer(new Hasta("Elif Hanim","Apandisit"));
       acilservis.offer( new Hasta("Oğuz Bey","Yanik"));
       acilservis.offer(new Hasta("Merve Hanim","Yanik"));
       acilservis.offer( new Hasta("Gizem Hanim","Apandisit"));
       
       int i = 1;
       
       while(!acilservis.isEmpty()){
           System.out.println("****************");
           System.out.println(i+".sirada");
           System.out.println(acilservis.poll());
           System.out.println("****************");
           i++;
       }
        
       
    }
    
}
