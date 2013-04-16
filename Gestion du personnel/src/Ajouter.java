import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;



public class Ajouter {
 

  
public Ajouter(String strprenom, String strnom, String strdateNaissance, String stradresse,
			String strville, String strCP, String strtel, String strmail,
			String strdiplomes, String strsalaire, String strdateEmbauche, String strfonction) {

		String prenom = strprenom;
		String nom = strnom;
		String dateNaissance = strdateNaissance;
		String adresse = stradresse;
		String ville = strville;
		String CP = strCP;
		String tel = strtel;
		String mail = strmail;
		String diplomes = strdiplomes;
		String salaire = strsalaire;
		String dateEmbauche = strdateEmbauche;
		String fonction = strfonction;
	}

public static void main(String[] args) {
	  Connection conn = null;
		try {
			//declaration du driver
          Class.forName("com.mysql.jdbc.Driver").newInstance();
      } catch (Exception ex) {
          ex.printStackTrace();
      }
		try {
			//connection à la DB test mysql
			conn =DriverManager.getConnection("jdbc:mysql://localhost/salle_musculation?user=root");
          
	      //Création d'un objet Statement
	      Statement state = conn.createStatement();
	      //L'objet ResultSet contient le résultat de la requête SQL
	      ResultSet result = state.executeQuery("INSERT INTO abonne(nom, password, pseudo, prenom, date_naissance, sexe, adresse, ville, code_postal, tel_portable, mail, type, date_inscription, fonction, date_embauche, salaire, diplome) VALUES (nom, password, pseudo, prenom, date_naissance, sexe, adresse, ville, code_postal, tel_portable, mail, type, date_inscription, fonction, date_embauche, salaire, diplome)");
	      
	      result.close();
	      state.close();
	          
	    } catch (Exception e) {
	      e.printStackTrace();
	    }     
  	}
}