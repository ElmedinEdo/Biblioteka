import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class BibliotekaTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner input= new Scanner(System.in);
		System.out.println("0 - Ukupno  književnih djela: ");
		System.out.println("Unesite id 1, 2 ili 3 za:");
		System.out.println("1) korisnik1 ");
		System.out.println("2) korisnik2 ");
		System.out.println("3) korisnik3 ");  
		System.out.println("4) Djela: Meša Selimoviæ: "); 
		System.out.println("5) Djela: Ivo Andriæ: ");
		System.out.println("6) Djela: Marin Držiæ: ");
		System.out.println("7) Djela: Charles Bukowski: ");
		System.out.println("8) Djela: Hermann Hesse: ");
		System.out.println("9) Izlaz: ");
				
        int	izbor = input.nextInt();
		if(izbor== 0) {
			ArrayList<String> djelaMešaSelimoviæ = new ArrayList<>();
			ArrayList<String> djelaIvoAndriæ = new ArrayList<>();
			ArrayList<String> djelaMarinDržiæ = new ArrayList<>();
			ArrayList<String> djelaCharlesBukowski = new ArrayList<>();  
			ArrayList<String> djelaHermannHesse = new ArrayList<>();
			    djelaMešaSelimoviæ.add("\n1 - Derviš i smrt. " );
				djelaMešaSelimoviæ.add("\n2 - Tišine, 1961. ");
				djelaMešaSelimoviæ.add("\n3 - Uvrijeðeni èovjek, 1947. ");  
				djelaMešaSelimoviæ.add("\n4 - Magla i mjeseèina, 1965. ");
				djelaMešaSelimoviæ.add("\n5 - Ostrvo,  1975.");
				djelaMešaSelimoviæ.add("\n6 - Tvrðava, 1970. ");
				djelaMešaSelimoviæ.add("\n7 - Sjeæanja. ");
				djelaMešaSelimoviæ.add("\n8 - Krug, 1983. ");
				djelaIvoAndriæ.add("\n1 - Lica, 1960."  );
				djelaIvoAndriæ.add("\n2- Prokleta avlija, 1954.)");
				djelaIvoAndriæ.add("\n3 - Žena na kamenu 1962.");  
				djelaIvoAndriæ.add("\n4 - Gospoðica, 1945.)");
				djelaIvoAndriæ.add("\n5 - Znakovi pored puta ");
				djelaMarinDržiæ.add("\n1 - Dundo Maroje "   );
				djelaMarinDržiæ.add("\n2 - Skup "    );
				djelaMarinDržiæ.add("\n3 - Arkulin ");  
				djelaMarinDržiæ.add("\n4 - Dundo Maroje "   );
				djelaMarinDržiæ.add("\n5 - Dundo Maroje "   );
				djelaCharlesBukowski.add("\n1 - Post Office (1971) ");
				djelaCharlesBukowski.add("\n2 - Factotum (1975) " );
				djelaCharlesBukowski.add("\n3 - Reach for the Sun: (1999)");
				djelaHermannHesse.add("\n1 - Stepski vuk" );
				djelaHermannHesse.add("\n2 - Demian" );
				djelaHermannHesse.add("\n3 - Igra staklenim biserima");
				djelaHermannHesse.add("\n4 - Siddhartha"  );
				djelaHermannHesse.add("\n5 - Narcis i Zlatousti");
				djelaHermannHesse.add("\n6 - Knulp");
					
				
				System.out.println( "Ukupno književnih djela: "+ (djelaMešaSelimoviæ.size()+djelaIvoAndriæ.size()+djelaMarinDržiæ.size()+djelaCharlesBukowski.size()+djelaHermannHesse.size()));
				djelaMešaSelimoviæ.remove(0);
				djelaMešaSelimoviæ.remove(1);
				djelaMarinDržiæ.remove(0);
			    djelaMarinDržiæ.remove(3);
			    djelaHermannHesse.remove(5);
			    
			    System.out.println( "Preostalo književnih djela: "+ (djelaMešaSelimoviæ.size()+djelaIvoAndriæ.size()+djelaMarinDržiæ.size()+djelaCharlesBukowski.size()+djelaHermannHesse.size()));
			    System.out.println();
			    izbor = input.nextInt();
				System.out.println("\n");
			  
		}		
		
		if(izbor== 1) {
		RacunBiblioteka korisnik1 = new RacunBiblioteka();
		korisnik1.setId(1);
		korisnik1.setIme("Jane ");
		korisnik1.setPrezime("Clark ");
		korisnik1.setBrojPosuðenihKnjiga(1);
		
		    
		
		System.out.println("\nid= " + korisnik1.getId() + "\nime = " + korisnik1.getIme() + "\nprezime = "
				+ korisnik1.getPrezime() + "\nbrojPosuðenihKnjiga = " + korisnik1.getBrojPosuðenihKnjiga());
		
		    LocalDate localDate = LocalDate.of(2018, 8, 12);
		    LocalDate newDate = localDate.plusDays(60);
		    System.out.println("Knjiga je izdata do datuma: "+ newDate);
		    
		    System.out.println("\nKnjiga koja je posuðena: " +"\n1 - Dundo Maroje - djelaMarinDržiæ ");
		    
		izbor = input.nextInt();
		System.out.println("\n");
		}	
		if (izbor == 2) {
	RacunBiblioteka korisnik2 = new RacunBiblioteka();
		korisnik2.setId(2);
		korisnik2.setIme("Mike ");
		korisnik2.setPrezime("Stone ");
		korisnik2.setBrojPosuðenihKnjiga(0);
		System.out.println("\nid= " + korisnik2.getId() + "\nime = " + korisnik2.getIme() + "\nprezime = "
				+ korisnik2.getPrezime() + "\nbrojPosuðenihKnjiga = " + korisnik2.getBrojPosuðenihKnjiga());
		
		    LocalDate localDate = LocalDate.of(2018, 8, 12);
		    LocalDate newDate = localDate.plusDays(0);
		    System.out.println("Knjiga je izdata do datuma: "+ newDate);
		
		
		
		izbor = input.nextInt();
		System.out.println("\n");

			
	}	
	
	if(izbor == 3) {
		
			
		RacunBiblioteka korisnik3 = new RacunBiblioteka();
			korisnik3.setId(3);
			korisnik3.setIme("Mike ");
			korisnik3.setPrezime("Stone ");
			korisnik3.setBrojPosuðenihKnjiga(3);
			System.out.println("\nid= " + korisnik3.getId() + "\nime = " + korisnik3.getIme() + "\nprezime = "
					+ korisnik3.getPrezime() + "\nbrojPosuðenihKnjiga = " + korisnik3.getBrojPosuðenihKnjiga());
			
			 LocalDate localDate = LocalDate.of(2018, 8, 12);
			    LocalDate newDate = localDate.plusDays(90);
			    System.out.println("Knjiga je izdata do datuma: "+ newDate);
			    System.out.println("\nKnjiga koja je posuðena: " + "\n4 - Dundo Maroje - djelaMarinDržiæ "); 
			    System.out.println("\nKnjiga koja je posuðena: " + "\n1 - Derviš i smrt.  - djelaMešaSelimoviæ " );                       
			    System.out.println("\nKnjiga koja je posuðena: " + "\n2 - Tišine, 1961. - djelaMešaSelimoviæ ");
			izbor = input.nextInt();
			System.out.println("\n");
			}				
if(izbor == 4) {
	    System.out.println("4. Djela Meša Selimoviæ : ");
	    ArrayList<String> djelaMešaSelimoviæ = new ArrayList<>();
	    djelaMešaSelimoviæ.add("\n1 - Derviš i smrt. "  );
		djelaMešaSelimoviæ.add("\n2 - Tišine, 1961. ");
		djelaMešaSelimoviæ.add("\n3 - Uvrijeðeni èovjek, 1947. ");  
		djelaMešaSelimoviæ.add("\n4 - Magla i mjeseèina, 1965. ");
		djelaMešaSelimoviæ.add("\n5 - Ostrvo,  1975.");
		djelaMešaSelimoviæ.add("\n6 - Tvrðava, 1970. ");
		djelaMešaSelimoviæ.add("\n7 - Sjeæanja. ");
		djelaMešaSelimoviæ.add("\n8 - Krug, 1983. ");
		System.out.println();
		for(String e:djelaMešaSelimoviæ) {
		System.out.print(e + " ");
		}
		System.out.println();
		System.out.println("Ukupno djela: "+ djelaMešaSelimoviæ.size());
		            
	  	   
		System.out.print("Preostalo djela: ");
		djelaMešaSelimoviæ.remove(0);
		djelaMešaSelimoviæ.remove(1);	
		
		System.out.println(djelaMešaSelimoviæ.size());
		System.out.println("");
	    izbor = input.nextInt();
		System.out.println("\n");
		}	
if(izbor == 5) {   
		System.out.println("5.Djela Ivo Andriæ: ");
		ArrayList<String> djelaIvoAndriæ = new ArrayList<>();
		djelaIvoAndriæ.add("\n1 - Lica, 1960."  );
		djelaIvoAndriæ.add("\n2- Prokleta avlija, 1954.)");
		djelaIvoAndriæ.add("\n3 - Žena na kamenu 1962.");  
		djelaIvoAndriæ.add("\n4 - Gospoðica, 1945.)");
		djelaIvoAndriæ.add("\n5 - Znakovi pored puta ");
		System.out.println();
		for(String e:djelaIvoAndriæ) {
		System.out.print(e + " ");
		}
		System.out.println();
		System.out.println("Ukupno djela: "+djelaIvoAndriæ.size());
		             
	    System.out.print("Preostalo djela: ");
		System.out.println(djelaIvoAndriæ.size());
		System.out.println("");
		izbor = input.nextInt();
		System.out.println("\n");
		}	
if(izbor == 6) {	
		System.out.println("6.Djela Marin Držiæ  ");
		ArrayList<String> djelaMarinDržiæ = new ArrayList<>();
		djelaMarinDržiæ.add("\n1 - Dundo Maroje "   );
		djelaMarinDržiæ.add("\n2 - Skup "    );
		djelaMarinDržiæ.add("\n3 - Arkulin ");  
		djelaMarinDržiæ.add("\n4 - Dundo Maroje "   );
		djelaMarinDržiæ.add("\n5 - Dundo Maroje "   );
		System.out.println();
		for(String e:djelaMarinDržiæ) {
		System.out.print(e + " ");
		}
		
		System.out.println();
		System.out.println("Ukupno djela: "+djelaMarinDržiæ.size());
		djelaMarinDržiæ.remove(0);
	    djelaMarinDržiæ.remove(3);  
				
		System.out.print("Preostalo djela: ");
		System.out.println(djelaMarinDržiæ.size());
		System.out.println("");
		izbor = input.nextInt();
		System.out.println("\n");
		}	
if(izbor == 7) {	
		System.out.println("7.Djela Charles Bukowski: ");
		ArrayList<String> djelaCharlesBukowski = new ArrayList<>();
		djelaCharlesBukowski.add("\n1 - Post Office (1971) ");
		djelaCharlesBukowski.add("\n2 - Factotum (1975) " );
		djelaCharlesBukowski.add("\n3 - Reach for the Sun: (1999)");
		System.out.println();
		for(String e:djelaCharlesBukowski) {
		System.out.print(e + " ");
		}
		
		System.out.println();
		System.out.println("Ukupno djela: "+djelaCharlesBukowski.size());
		             
		System.out.print("Preostalo djela: ");
		System.out.println(djelaCharlesBukowski.size());
		System.out.println("");
		izbor = input.nextInt();
		System.out.println("\n");
		}	
if(izbor == 8) {
			System.out.println("8.Djela Hermann Hesse: ");
			ArrayList<String> djelaHermannHesse = new ArrayList<>();
			djelaHermannHesse.add("\n1 - Stepski vuk" );
			djelaHermannHesse.add("\n2 - Demian" );
			djelaHermannHesse.add("\n3 - Igra staklenim biserima");
			djelaHermannHesse.add("\n4 - Siddhartha"  );
			djelaHermannHesse.add("\n5 - Narcis i Zlatousti");
			djelaHermannHesse.add("\n6 - Knulp");
			System.out.println();	
			for(String e:djelaHermannHesse) {
			System.out.print(e + " ");
			}
			
			System.out.println();
			System.out.println("Ukupno djela: "+djelaHermannHesse.size());
						 djelaHermannHesse.remove(5);
			System.out.print("Preostalo djela: ");
			System.out.println(djelaHermannHesse.size());
		    System.out.println("");
			izbor = input.nextInt();
			System.out.println("\n");
			}	
			if(izbor == 9) {
			   System.out.println("<<<< Izlaz >>>>");
			    
			}	
	}	

}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	

	