package RGAlim.model;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.postgresql.geometric.PGpoint;

import RGAlim.users.connexionForm;

public class AjoutRph extends connexionForm {
	private CaracAnatomique getAnatomique (HttpServletRequest request) {
		String typeRacine = getValeurChamp(request, "typeRacine"); 
		 String	feuille = getValeurChamp(request, "feuille");
		 String	graine = getValeurChamp(request, "graine");
		 String fleure = getValeurChamp(request, "fleure");
		 String	fruit = getValeurChamp(request, "fruit");
		 String tige = getValeurChamp(request, "tige");
		 CaracAnatomique caracAnatomique = new CaracAnatomique();
		 caracAnatomique.setFeuille(feuille);
		 caracAnatomique.setFleur(fleure);
		 caracAnatomique.setFruit(fruit);
		 caracAnatomique.setGraine(graine);
		 caracAnatomique.setTige(tige);
		 caracAnatomique.setTypeRacine(typeRacine);
		 return caracAnatomique;
	}
	private Phane getPhane (HttpServletRequest request) {
		Phane phane = new Phane ();
		phane.setCaracFeuille(getValeurChamp(request, "caracFeuille"));
		phane.setCaracTige(getValeurChamp(request, "caracTige"));
		phane.setDescripPort(getValeurChamp(request, "descriptionPort"));
		return phane;
	}
	private CaracMorphologique getMorphologique (HttpServletRequest request) {
		CaracMorphologique caracMorphologique =  new CaracMorphologique();
		caracMorphologique.setCouleurFleur(getValeurChamp(request, "couleurFleure"));
		caracMorphologique.setGerme(getValeurChamp(request, "germe"));
		caracMorphologique.setMaturité(getValeurChamp(request, "maturite"));
		caracMorphologique.setTubercule(getValeurChamp(request, "tubercule"));
		caracMorphologique.setPhane(getPhane(request));
		return caracMorphologique;
		
	}
	private List<Ecosysteme_res_phyto> getEcosysteme (HttpServletRequest request){
		
		java.util.Enumeration <String>enum1 = request.getParameterNames();
		int i = 2;
		List<Ecosysteme_res_phyto> list = new ArrayList<Ecosysteme_res_phyto>();
		while (enum1.hasMoreElements()) {
			if (enum1.nextElement().equals("temperature"+ Integer.toString(i)))i++;
		}
		for (int j = 1 ; j<i ; j++) {
			Ecosysteme_res_phyto eco = new Ecosysteme_res_phyto();
			
			eco.setDegréGravité(getValeurChamp(request, "degreGravite" + Integer.toString(j)));
			eco.setDegréRadiation(getValeurChamp(request, "degreRadiation" + Integer.toString(j)));
			eco.setdPh(getValeurChamp(request, "degrePh" + Integer.toString(j)));
			eco.setIonsMiniraux(getValeurChamp(request, "ionsMinereaux" + Integer.toString(j)));
			eco.setqCo2(getValeurChamp(request, "quantiteCo2" + Integer.toString(j)));
			eco.setqEau(getValeurChamp(request, "quantiteEau" + Integer.toString(j)));
			eco.setqOxygene(getValeurChamp(request, "quantiteOxygene" + Integer.toString(j)));
			eco.setTempérature(getValeurChamp(request, "temperature" + Integer.toString(j)));
			list.add(eco);
			
		}
		return list;
            
	}
	private List <Geolocalisation> getLocalisation (HttpServletRequest request){
		java.util.Enumeration <String>enum1 = request.getParameterNames();
		int i = 2;
		List<Geolocalisation> list = new ArrayList<Geolocalisation>();
		while (enum1.hasMoreElements()) {
			if (enum1.nextElement().equals("region"+ Integer.toString(i)))i++;
		}
		for (int j = 1 ; j<i ; j++) {
			Geolocalisation geolocalisation = new Geolocalisation();
			geolocalisation.setRegion(getValeurChamp(request, "region" +  Integer.toString(j)));
			geolocalisation.setVille(getValeurChamp(request, "ville"+ Integer.toString(j)));
			geolocalisation.setWilaya(getValeurChamp(request, "wilaya" +  Integer.toString(j)));
			PGpoint p = new PGpoint();
			double x = Double.parseDouble(getValeurChamp(request, "longitude" + Integer.toString(j)));
			double y = Double.parseDouble(getValeurChamp(request, "latitude" + Integer.toString(j)));
			geolocalisation.setLongitude(x);
			geolocalisation.setLatitude(y);
			list.add(geolocalisation);
		}
		return list;
	}

	public RessourcePhytogenetique getResouPhytogenetique (HttpServletRequest request,List<Rgclassification> rgclassification) {
		RessourcePhytogenetique phytogenetique = new RessourcePhytogenetique();
		phytogenetique.setArrosage(getValeurChamp(request, "arrosage"));
		phytogenetique.setDescription(getValeurChamp(request, "descriptionRessource"));
		phytogenetique.setHauteurMaturité(getValeurChamp(request, "hauteurMaturite"));
		phytogenetique.setLargeurMaturité(getValeurChamp(request, "largeurMaturite"));
		phytogenetique.setNiveauSoin(getValeurChamp(request, "niveauSoin"));
		phytogenetique.setRusticite(getValeurChamp(request, "rusticite"));
		phytogenetique.setNomAmazigh(getValeurChamp(request, "nomAmazigh"));
		phytogenetique.setNomArabe(getValeurChamp(request, "nomArabe"));
		phytogenetique.setNomLatin(getValeurChamp(request, "nomLatin"));
		phytogenetique.setNomFrancais(getValeurChamp(request, "nomFrancais"));
		phytogenetique.setPeriodeFloraison(getValeurChamp(request, "periodeFloraison"));
		phytogenetique.setSaisonInteret(getValeurChamp(request, "saisonInteret"));
		phytogenetique.setValidee(false);
		phytogenetique.setCaracAnatomique(getAnatomique(request));
		phytogenetique.setCaracMorphologique(getMorphologique(request));
		phytogenetique.setEcosystemeResPhytos(getEcosysteme(request));
		phytogenetique.setGeolocalisations(getLocalisation(request));
		phytogenetique.setRgclassification(rgclassification);
		return phytogenetique;
		}
}
