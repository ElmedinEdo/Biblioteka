import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class BibliotekaTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner input= new Scanner(System.in);
		System.out.println("0 - Ukupno  knji�evnih djela: ");
		System.out.println("Unesite id 1, 2 ili 3 za:");
		System.out.println("1) korisnik1 ");
		System.out.println("2) korisnik2 ");
		System.out.println("3) korisnik3 ");  
		System.out.println("4) Djela: Me�a Selimovi�: "); 
		System.out.println("5) Djela: Ivo Andri�: ");
		System.out.println("6) Djela: Marin Dr�i�: ");
		System.out.println("7) Djela: Charles Bukowski: ");
		System.out.println("8) Djela: Hermann Hesse: ");
		System.out.println("9) Izlaz: ");
				
        int	izbor = input.nextInt();
		if(izbor== 0) {
			ArrayList<String> djelaMe�aSelimovi� = new ArrayList<>();
			ArrayList<String> djelaIvoAndri� = new ArrayList<>();
			ArrayList<String> djelaMarinDr�i� = new ArrayList<>();
			ArrayList<String> djelaCharlesBukowski = new ArrayList<>();  
			ArrayList<String> djelaHermannHesse = new ArrayList<>();
			    djelaMe�aSelimovi�.add("\n1 - Dervi� i smrt. " );
				djelaMe�aSelimovi�.add("\n2 - Ti�ine, 1961. ");
				djelaMe�aSelimovi�.add("\n3 - Uvrije�eni �ovjek, 1947. ");  
				djelaMe�aSelimovi�.add("\n4 - Magla i mjese�ina, 1965. ");
				djelaMe�aSelimovi�.add("\n5 - Ostrvo,  1975.");
				djelaMe�aSelimovi�.add("\n6 - Tvr�ava, 1970. ");
				djelaMe�aSelimovi�.add("\n7 - Sje�anja. ");
				djelaMe�aSelimovi�.add("\n8 - Krug, 1983. ");
				djelaIvoAndri�.add("\n1 - Lica, 1960."  );
				djelaIvoAndri�.add("\n2- Prokleta avlija, 1954.)");
				djelaIvoAndri�.add("\n3 - �ena na kamenu 1962.");  
				djelaIvoAndri�.add("\n4 - Gospo�ica, 1945.)");
				djelaIvoAndri�.add("\n5 - Znakovi pored puta ");
				djelaMarinDr�i�.add("\n1 - Dundo Maroje "   );
				djelaMarinDr�i�.add("\n2 - Skup "    );
				djelaMarinDr�i�.add("\n3 - Arkulin ");  
				djelaMarinDr�i�.add("\n4 - Dundo Maroje "   );
				djelaMarinDr�i�.add("\n5 - Dundo Maroje "   );
				djelaCharlesBukowski.add("\n1 - Post Office (1971) ");
				djelaCharlesBukowski.add("\n2 - Factotum (1975) " );
				djelaCharlesBukowski.add("\n3 - Reach for the Sun: (1999)");
				djelaHermannHesse.add("\n1 - Stepski vuk" );
				djelaHermannHesse.add("\n2 - Demian" );
				djelaHermannHesse.add("\n3 - Igra staklenim biserima");
				djelaHermannHesse.add("\n4 - Siddhartha"  );
				djelaHermannHesse.add("\n5 - Narcis i Zlatousti");
				djelaHermannHesse.add("\n6 - Knulp");
					
				
				System.out.println( "Ukupno knji�evnih djela: "+ (djelaMe�aSelimovi�.size()+djelaIvoAndri�.size()+djelaMarinDr�i�.size()+djelaCharlesBukowski.size()+djelaHermannHesse.size()));
				djelaMe�aSelimovi�.remove(0);
				djelaMe�aSelimovi�.remove(1);
				djelaMarinDr�i�.remove(0);
			    djelaMarinDr�i�.remove(3);
			    djelaHermannHesse.remove(5);
			    
			    System.out.println( "Preostalo knji�evnih djela: "+ (djelaMe�aSelimovi�.size()+djelaIvoAndri�.size()+djelaMarinDr�i�.size()+djelaCharlesBukowski.size()+djelaHermannHesse.size()));
			    System.out.println();
			    izbor = input.nextInt();
				System.out.println("\n");
			  
		}		
		
		if(izbor== 1) {
		RacunBiblioteka korisnik1 = new RacunBiblioteka();
		korisnik1.setId(1);
		korisnik1.setIme("Jane ");
		korisnik1.setPrezime("Clark ");
		korisnik1.setBrojPosu�enihKnjiga(1);
		
		    
		
		System.out.println("\nid= " + korisnik1.getId() + "\nime = " + korisnik1.getIme() + "\nprezime = "
				+ korisnik1.getPrezime() + "\nbrojPosu�enihKnjiga = " + korisnik1.getBrojPosu�enihKnjiga());
		
		    LocalDate localDate = LocalDate.of(2018, 8, 12);
		    LocalDate newDate = localDate.plusDays(60);
		    System.out.println("Knjiga je izdata do datuma: "+ newDate);
		    
		    System.out.println("\nKnjiga koja je posu�ena: " +"\n1 - Dundo Maroje - djelaMarinDr�i� ");
		    
		izbor = input.nextInt();
		System.out.println("\n");
		}	
		if (izbor == 2) {
	RacunBiblioteka korisnik2 = new RacunBiblioteka();
		korisnik2.setId(2);
		korisnik2.setIme("Mike ");
		korisnik2.setPrezime("Stone ");
		korisnik2.setBrojPosu�enihKnjiga(0);
		System.out.println("\nid= " + korisnik2.getId() + "\nime = " + korisnik2.getIme() + "\nprezime = "
				+ korisnik2.getPrezime() + "\nbrojPosu�enihKnjiga = " + korisnik2.getBrojPosu�enihKnjiga());
		
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
			korisnik3.setBrojPosu�enihKnjiga(3);
			System.out.println("\nid= " + korisnik3.getId() + "\nime = " + korisnik3.getIme() + "\nprezime = "
					+ korisnik3.getPrezime() + "\nbrojPosu�enihKnjiga = " + korisnik3.getBrojPosu�enihKnjiga());
			
			 LocalDate localDate = LocalDate.of(2018, 8, 12);
			    LocalDate newDate = localDate.plusDays(90);
			    System.out.println("Knjiga je izdata do datuma: "+ newDate);
			    System.out.println("\nKnjiga koja je posu�ena: " + "\n4 - Dundo Maroje - djelaMarinDr�i� "); 
			    System.out.println("\nKnjiga koja je posu�ena: " + "\n1 - Dervi� i smrt.  - djelaMe�aSelimovi� " );                       
			    System.out.println("\nKnjiga koja je posu�ena: " + "\n2 - Ti�ine, 1961. - djelaMe�aSelimovi� ");
			izbor = input.nextInt();
			System.out.println("\n");
			}				
if(izbor == 4) {
	    System.out.println("4. Djela Me�a Selimovi� : ");
	    ArrayList<String> djelaMe�aSelimovi� = new ArrayList<>();
	    djelaMe�aSelimovi�.add("\n1 - Dervi� i smrt. "  );
		djelaMe�aSelimovi�.add("\n2 - Ti�ine, 1961. ");
		djelaMe�aSelimovi�.add("\n3 - Uvrije�eni �ovjek, 1947. ");  
		djelaMe�aSelimovi�.add("\n4 - Magla i mjese�ina, 1965. ");
		djelaMe�aSelimovi�.add("\n5 - Ostrvo,  1975.");
		djelaMe�aSelimovi�.add("\n6 - Tvr�ava, 1970. ");
		djelaMe�aSelimovi�.add("\n7 - Sje�anja. ");
		djelaMe�aSelimovi�.add("\n8 - Krug, 1983. ");
		System.out.println();
		for(String e:djelaMe�aSelimovi�) {
		System.out.print(e + " ");
		}
		System.out.println();
		System.out.println("Ukupno djela: "+ djelaMe�aSelimovi�.size());
		            
	  	   
		System.out.print("Preostalo djela: ");
		djelaMe�aSelimovi�.remove(0);
		djelaMe�aSelimovi�.remove(1);	
		
		System.out.println(djelaMe�aSelimovi�.size());
		System.out.println("");
	    izbor = input.nextInt();
		System.out.println("\n");
		}	
if(izbor == 5) {   
		System.out.println("5.Djela Ivo Andri�: ");
		ArrayList<String> djelaIvoAndri� = new ArrayList<>();
		djelaIvoAndri�.add("\n1 - Lica, 1960."  );
		djelaIvoAndri�.add("\n2- Prokleta avlija, 1954.)");
		djelaIvoAndri�.add("\n3 - �ena na kamenu 1962.");  
		djelaIvoAndri�.add("\n4 - Gospo�ica, 1945.)");
		djelaIvoAndri�.add("\n5 - Znakovi pored puta ");
		System.out.println();
		for(String e:djelaIvoAndri�) {
		System.out.print(e + " ");
		}
		System.out.println();
		System.out.println("Ukupno djela: "+djelaIvoAndri�.size());
		             
	    System.out.print("Preostalo djela: ");
		System.out.println(djelaIvoAndri�.size());
		System.out.println("");
		izbor = input.nextInt();
		System.out.println("\n");
		}	
if(izbor == 6) {	
		System.out.println("6.Djela Marin Dr�i�  ");
		ArrayList<String> djelaMarinDr�i� = new ArrayList<>();
		djelaMarinDr�i�.add("\n1 - Dundo Maroje "   );
		djelaMarinDr�i�.add("\n2 - Skup "    );
		djelaMarinDr�i�.add("\n3 - Arkulin ");  
		djelaMarinDr�i�.add("\n4 - Dundo Maroje "   );
		djelaMarinDr�i�.add("\n5 - Dundo Maroje "   );
		System.out.println();
		for(String e:djelaMarinDr�i�) {
		System.out.print(e + " ");
		}
		
		System.out.println();
		System.out.println("Ukupno djela: "+djelaMarinDr�i�.size());
		djelaMarinDr�i�.remove(0);
	    djelaMarinDr�i�.remove(3);  
				
		System.out.print("Preostalo djela: ");
		System.out.println(djelaMarinDr�i�.size());
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	

	