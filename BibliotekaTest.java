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
		System.out.println("4) Djela: Meša Selimović: "); 
		System.out.println("5) Djela: Ivo Andrić: ");
		System.out.println("6) Djela: Marin Držić: ");
		System.out.println("7) Djela: Charles Bukowski: ");
		System.out.println("8) Djela: Hermann Hesse: ");
		System.out.println("9) Izlaz: ");
				
        int	izbor = input.nextInt();
		if(izbor== 0) {
			ArrayList<String> djelaMešaSelimović = new ArrayList<>();
			ArrayList<String> djelaIvoAndrić = new ArrayList<>();
			ArrayList<String> djelaMarinDržić = new ArrayList<>();
			ArrayList<String> djelaCharlesBukowski = new ArrayList<>();  
			ArrayList<String> djelaHermannHesse = new ArrayList<>();
			    djelaMešaSelimović.add("\n1 - Derviš i smrt. " );
				djelaMešaSelimović.add("\n2 - Tišine, 1961. ");
				djelaMešaSelimović.add("\n3 - Uvrijeđeni čovjek, 1947. ");  
				djelaMešaSelimović.add("\n4 - Magla i mjesečina, 1965. ");
				djelaMešaSelimović.add("\n5 - Ostrvo,  1975.");
				djelaMešaSelimović.add("\n6 - Tvrđava, 1970. ");
				djelaMešaSelimović.add("\n7 - Sjećanja. ");
				djelaMešaSelimović.add("\n8 - Krug, 1983. ");
				djelaIvoAndrić.add("\n1 - Lica, 1960."  );
				djelaIvoAndrić.add("\n2- Prokleta avlija, 1954.)");
				djelaIvoAndrić.add("\n3 - Žena na kamenu 1962.");  
				djelaIvoAndrić.add("\n4 - Gospođica, 1945.)");
				djelaIvoAndrić.add("\n5 - Znakovi pored puta ");
				djelaMarinDržić.add("\n1 - Dundo Maroje "   );
				djelaMarinDržić.add("\n2 - Skup "    );
				djelaMarinDržić.add("\n3 - Arkulin ");  
				djelaMarinDržić.add("\n4 - Dundo Maroje "   );
				djelaMarinDržić.add("\n5 - Dundo Maroje "   );
				djelaCharlesBukowski.add("\n1 - Post Office (1971) ");
				djelaCharlesBukowski.add("\n2 - Factotum (1975) " );
				djelaCharlesBukowski.add("\n3 - Reach for the Sun: (1999)");
				djelaHermannHesse.add("\n1 - Stepski vuk" );
				djelaHermannHesse.add("\n2 - Demian" );
				djelaHermannHesse.add("\n3 - Igra staklenim biserima");
				djelaHermannHesse.add("\n4 - Siddhartha"  );
				djelaHermannHesse.add("\n5 - Narcis i Zlatousti");
				djelaHermannHesse.add("\n6 - Knulp");
					
				
				System.out.println( "Ukupno književnih djela: "+ (djelaMešaSelimović.size()+djelaIvoAndrić.size()+djelaMarinDržić.size()+djelaCharlesBukowski.size()+djelaHermannHesse.size()));
				djelaMešaSelimović.remove(0);
				djelaMešaSelimović.remove(1);
				djelaMarinDržić.remove(0);
			    djelaMarinDržić.remove(3);
			    djelaHermannHesse.remove(5);
			    
			    System.out.println( "Preostalo književnih djela: "+ (djelaMešaSelimović.size()+djelaIvoAndrić.size()+djelaMarinDržić.size()+djelaCharlesBukowski.size()+djelaHermannHesse.size()));
			    System.out.println();
			    izbor = input.nextInt();
				System.out.println("\n");
			  
		}		
		
		if(izbor== 1) {
		RacunBiblioteka korisnik1 = new RacunBiblioteka();
		korisnik1.setId(1);
		korisnik1.setIme("Jane ");
		korisnik1.setPrezime("Clark ");
		korisnik1.setBrojPosuđenihKnjiga(1);
		
		    
		
		System.out.println("\nid= " + korisnik1.getId() + "\nime = " + korisnik1.getIme() + "\nprezime = "
				+ korisnik1.getPrezime() + "\nbrojPosuđenihKnjiga = " + korisnik1.getBrojPosuđenihKnjiga());
		
		    LocalDate localDate = LocalDate.of(2018, 8, 12);
		    LocalDate newDate = localDate.plusDays(60);
		    System.out.println("Knjiga je izdata do datuma: "+ newDate);
		    
		    System.out.println("\nKnjiga koja je posuđena: " +"\n1 - Dundo Maroje - djelaMarinDržić ");
		    
		izbor = input.nextInt();
		System.out.println("\n");
		}	
		if (izbor == 2) {
	RacunBiblioteka korisnik2 = new RacunBiblioteka();
		korisnik2.setId(2);
		korisnik2.setIme("Mike ");
		korisnik2.setPrezime("Stone ");
		korisnik2.setBrojPosuđenihKnjiga(0);
		System.out.println("\nid= " + korisnik2.getId() + "\nime = " + korisnik2.getIme() + "\nprezime = "
				+ korisnik2.getPrezime() + "\nbrojPosuđenihKnjiga = " + korisnik2.getBrojPosuđenihKnjiga());
		
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
			korisnik3.setBrojPosuđenihKnjiga(3);
			System.out.println("\nid= " + korisnik3.getId() + "\nime = " + korisnik3.getIme() + "\nprezime = "
					+ korisnik3.getPrezime() + "\nbrojPosuđenihKnjiga = " + korisnik3.getBrojPosuđenihKnjiga());
			
			 LocalDate localDate = LocalDate.of(2018, 8, 12);
			    LocalDate newDate = localDate.plusDays(90);
			    System.out.println("Knjiga je izdata do datuma: "+ newDate);
			    System.out.println("\nKnjiga koja je posuđena: " + "\n4 - Dundo Maroje - djelaMarinDržić "); 
			    System.out.println("\nKnjiga koja je posuđena: " + "\n1 - Derviš i smrt.  - djelaMešaSelimović " );                       
			    System.out.println("\nKnjiga koja je posuđena: " + "\n2 - Tišine, 1961. - djelaMešaSelimović ");
			izbor = input.nextInt();
			System.out.println("\n");
			}				
if(izbor == 4) {
	    System.out.println("4. Djela Meša Selimović : ");
	    ArrayList<String> djelaMešaSelimović = new ArrayList<>();
	    djelaMešaSelimović.add("\n1 - Derviš i smrt. "  );
		djelaMešaSelimović.add("\n2 - Tišine, 1961. ");
		djelaMešaSelimović.add("\n3 - Uvrijeđeni čovjek, 1947. ");  
		djelaMešaSelimović.add("\n4 - Magla i mjesečina, 1965. ");
		djelaMešaSelimović.add("\n5 - Ostrvo,  1975.");
		djelaMešaSelimović.add("\n6 - Tvrđava, 1970. ");
		djelaMešaSelimović.add("\n7 - Sjećanja. ");
		djelaMešaSelimović.add("\n8 - Krug, 1983. ");
		System.out.println();
		for(String e:djelaMešaSelimović) {
		System.out.print(e + " ");
		}
		System.out.println();
		System.out.println("Ukupno djela: "+ djelaMešaSelimović.size());
		            
	  	   
		System.out.print("Preostalo djela: ");
		djelaMešaSelimović.remove(0);
		djelaMešaSelimović.remove(1);	
		
		System.out.println(djelaMešaSelimović.size());
		System.out.println("");
	    izbor = input.nextInt();
		System.out.println("\n");
		}	
if(izbor == 5) {   
		System.out.println("5.Djela Ivo Andrić: ");
		ArrayList<String> djelaIvoAndrić = new ArrayList<>();
		djelaIvoAndrić.add("\n1 - Lica, 1960."  );
		djelaIvoAndrić.add("\n2- Prokleta avlija, 1954.)");
		djelaIvoAndrić.add("\n3 - Žena na kamenu 1962.");  
		djelaIvoAndrić.add("\n4 - Gospođica, 1945.)");
		djelaIvoAndrić.add("\n5 - Znakovi pored puta ");
		System.out.println();
		for(String e:djelaIvoAndrić) {
		System.out.print(e + " ");
		}
		System.out.println();
		System.out.println("Ukupno djela: "+djelaIvoAndrić.size());
		             
	    System.out.print("Preostalo djela: ");
		System.out.println(djelaIvoAndrić.size());
		System.out.println("");
		izbor = input.nextInt();
		System.out.println("\n");
		}	
if(izbor == 6) {	
		System.out.println("6.Djela Marin Držić  ");
		ArrayList<String> djelaMarinDržić = new ArrayList<>();
		djelaMarinDržić.add("\n1 - Dundo Maroje "   );
		djelaMarinDržić.add("\n2 - Skup "    );
		djelaMarinDržić.add("\n3 - Arkulin ");  
		djelaMarinDržić.add("\n4 - Dundo Maroje "   );
		djelaMarinDržić.add("\n5 - Dundo Maroje "   );
		System.out.println();
		for(String e:djelaMarinDržić) {
		System.out.print(e + " ");
		}
		
		System.out.println();
		System.out.println("Ukupno djela: "+djelaMarinDržić.size());
		djelaMarinDržić.remove(0);
	    djelaMarinDržić.remove(3);  
				
		System.out.print("Preostalo djela: ");
		System.out.println(djelaMarinDržić.size());
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	

	