import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Fenetre extends JFrame implements ActionListener
{	
	//Déclarations
	private JLabel label = new JLabel("Menu principal");
	private JButton boutonMenu = new JButton("Menu principal");
	private JButton boutonAjouter = new JButton("Ajouter");
	private JButton boutonModifier = new JButton("Modifier");
	private JButton boutonSupprimer = new JButton("Supprimer");
	private JButton boutonValiderAjouter = new JButton("Ajouter");
	private JButton boutonValiderModifier = new JButton("Modifier");
	private JButton boutonValiderSupprimer = new JButton("Supprimer");
	
	//Déclarations : Labels spécifiques aux différents menus
	private JLabel lblPrenom = new JLabel(" Prénom : ");
	private JLabel lblNom = new JLabel(" Nom : ");
	private JLabel lblDateNaissance = new JLabel(" Date de naissance : ");
	private JLabel lblAdresse = new JLabel(" Adresse : ");
	private JLabel lblVille = new JLabel(" Ville : ");
	private JLabel lblCP = new JLabel(" Code postal : ");
	private JLabel lblTel = new JLabel(" Téléphone : ");
	private JLabel lblMail = new JLabel(" e-mail : ");
	private JLabel lblDiplomes = new JLabel(" Diplômes : ");
	private JLabel lblSalaire = new JLabel(" Salaire : ");
	private JLabel lblDateEmbauche = new JLabel(" Date d'embauche : ");
	private JLabel lblFonction = new JLabel(" Fonction : ");
	
	//Déclarations : JTextField spécifiques aux différents menus
	private JTextField jtfPrenom = new JTextField("");
	private JTextField jtfNom = new JTextField("");
	private JTextField jtfDateNaissance = new JTextField("");
	private JTextField jtfAdresse = new JTextField("");
	private JTextField jtfVille = new JTextField("");
	private JTextField jtfCP = new JTextField("");
	private JTextField jtfTel = new JTextField("");
	private JTextField jtfMail = new JTextField("");
	private JTextField jtfDiplomes = new JTextField("");
	private JTextField jtfSalaire = new JTextField("");
	private JTextField jtfDateEmbauche = new JTextField("");
	private JTextField jtfFonction = new JTextField("");
	
	private JComboBox combo = new JComboBox();
	
	//Déclaration d'un objet Fenetre de type JFrame : c'est une fenêtre redimensionnable et déplaçable
	public Fenetre(String type_fenetre)
	{
		//Titre de la fenêtre
		this.setTitle("Gestion du personnel");
		//Taille
		this.setSize(400, 500);
		//Position de la fenêtre au centre de l'écran
		this.setLocationRelativeTo(null);
		//Permet de fermer le processus de la fenêtre lors du clique sur la "croix de fermeture" 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//------------------------------------------------------------------------------------------------------------------
			    
	    //On crée un conteneur avec gestion horizontale
        Box b1 = Box.createHorizontalBox();
        //Idem
        Box b2 = Box.createHorizontalBox();
        //Idem
        Box b3 = Box.createHorizontalBox();
        //Idem
        Box b4 = Box.createHorizontalBox();
        //Idem
        Box b5 = Box.createHorizontalBox();
        //Idem
        Box b6 = Box.createHorizontalBox();
        //Idem
        Box b7 = Box.createHorizontalBox();
        //Idem
        Box b8 = Box.createHorizontalBox();
        //Idem
        Box b9 = Box.createHorizontalBox();
        //Idem
        Box b10 = Box.createHorizontalBox();
        //Idem
        Box b11 = Box.createHorizontalBox();
        //Idem
        Box b12 = Box.createHorizontalBox();
        //Idem
        Box b13 = Box.createHorizontalBox();
        //Idem
        Box b14 = Box.createHorizontalBox();
        //Idem
        Box b15 = Box.createHorizontalBox();
        //Idem
        Box b16 = Box.createHorizontalBox();
       
        //On crée un conteneur avec gestion verticale
        Box bfinale = Box.createVerticalBox();
        bfinale.add(b1);
        bfinale.add(b2);
        bfinale.add(b3);
        bfinale.add(b4);
        bfinale.add(b5);
        bfinale.add(b6);
        bfinale.add(b7);
        bfinale.add(b8);
        bfinale.add(b9);
        bfinale.add(b10);
        bfinale.add(b11);
        bfinale.add(b12);
        bfinale.add(b13);
        bfinale.add(b14);
        bfinale.add(b15);
        bfinale.add(b16);
     
        this.getContentPane().add(bfinale);	    
	    
        //------------------------------------------------------------------------------------------------------------------
	    
	    //Affichage des objets du Menu principal
	    if(type_fenetre == "menu")
	    { 	
	    	//Définition des labels
	    	label.setText("Menu principal");
	    	label.setFont(new Font("Serif", Font.PLAIN, 36));
	    	//Ajout des labels		    
		    b1.add(label);
		    
		    b2.add(new JLabel(" "));
		    //Ajout des boutons
		    b3.add(boutonAjouter);	
		    
		    b3.add(boutonModifier);
		    
		    b3.add(boutonSupprimer);
		    
		    //Nous ajoutons notre fenêtre à la liste des auditeurs des boutons
		    boutonAjouter.addActionListener(this);
		    boutonModifier.addActionListener(this);
		    boutonSupprimer.addActionListener(this);
	    }
	    
	    //Affichage des objets du Menu "Ajouter"
	    if(type_fenetre == "ajouter")
	    {
	    	//Ajout des objets
	    	label.setText("Ajouter un employé");
	    	label.setFont(new Font("Serif", Font.PLAIN, 36));
	    	
	        b1.add(label);
	        
	        b2.add(new JLabel(" "));
	        
	        lblPrenom.setPreferredSize( new Dimension( 125, 24 ) );
	        b3.add(lblPrenom);
	        b3.add(jtfPrenom);
	        
	        lblNom.setPreferredSize( new Dimension( 125, 24 ) );
	        b4.add(lblNom);
	        b4.add(jtfNom);
	        
	        lblDateNaissance.setPreferredSize( new Dimension( 125, 24 ) );
	        b5.add(lblDateNaissance);
	        b5.add(jtfDateNaissance);
	        
	        lblAdresse.setPreferredSize( new Dimension( 125, 24 ) );
	    	b6.add(lblAdresse);
	    	b6.add(jtfAdresse);
	    	
	    	lblVille.setPreferredSize( new Dimension( 125, 24 ) );
	    	b7.add(lblVille);
	    	b7.add(jtfVille);
	    	
	    	lblCP.setPreferredSize( new Dimension( 125, 24 ) );
	    	b8.add(lblCP);
	    	b8.add(jtfCP);
	    	
	    	lblTel.setPreferredSize( new Dimension( 125, 24 ) );
	    	b9.add(lblTel);
	    	b9.add(jtfTel);
	    	
	    	lblMail.setPreferredSize( new Dimension( 125, 24 ) );
	    	b10.add(lblMail);
	    	b10.add(jtfMail);
	    	
	    	lblFonction.setPreferredSize( new Dimension( 125, 24 ) );
	    	b11.add(lblFonction);
	    	b11.add(jtfFonction);
	    	
	    	lblDiplomes.setPreferredSize( new Dimension( 125, 24 ) );
	    	b12.add(lblDiplomes);
	    	b12.add(jtfDiplomes);
	    	
	    	lblSalaire.setPreferredSize( new Dimension( 125, 24 ) );
	    	b13.add(lblSalaire);
	    	b13.add(jtfSalaire);
	    	
	    	lblDateEmbauche.setPreferredSize( new Dimension( 125, 24 ) );
	    	b14.add(lblDateEmbauche);
	    	b14.add(jtfDateEmbauche);
	    	
	    	b15.add(new JLabel(" "));
	    	
	    	//Ajout des boutons
	    	b16.add(boutonValiderAjouter);
	    	b16.add(boutonMenu);
		    
		    //Nous ajoutons notre fenêtre à la liste des auditeurs des boutons
		    boutonMenu.addActionListener(this);
		    boutonValiderAjouter.addActionListener(this);
	    }
	    
	    //Affichage des objets du Menu "Modifier"
	    if(type_fenetre == "modifier")
	    {
	    	//Ajout des objets
	    	label.setText("Modifier un employé");
	    	label.setFont(new Font("Serif", Font.PLAIN, 36));
	    	
	        b1.add(label);
	        
	        b2.add(new JLabel(" "));
	        
	        lblPrenom.setPreferredSize( new Dimension( 125, 24 ) );
	        b3.add(lblPrenom);
	        b3.add(jtfPrenom);
	        
	        lblNom.setPreferredSize( new Dimension( 125, 24 ) );
	        b4.add(lblNom);
	        b4.add(jtfNom);
	        
	        lblDateNaissance.setPreferredSize( new Dimension( 125, 24 ) );
	        b5.add(lblDateNaissance);
	        b5.add(jtfDateNaissance);
	        
	        lblAdresse.setPreferredSize( new Dimension( 125, 24 ) );
	    	b6.add(lblAdresse);
	    	b6.add(jtfAdresse);
	    	
	    	lblVille.setPreferredSize( new Dimension( 125, 24 ) );
	    	b7.add(lblVille);
	    	b7.add(jtfVille);
	    	
	    	lblCP.setPreferredSize( new Dimension( 125, 24 ) );
	    	b8.add(lblCP);
	    	b8.add(jtfCP);
	    	
	    	lblTel.setPreferredSize( new Dimension( 125, 24 ) );
	    	b9.add(lblTel);
	    	b9.add(jtfTel);
	    	
	    	lblMail.setPreferredSize( new Dimension( 125, 24 ) );
	    	b10.add(lblMail);
	    	b10.add(jtfMail);
	    	
	    	lblFonction.setPreferredSize( new Dimension( 125, 24 ) );
	    	b11.add(lblFonction);
	    	b11.add(jtfFonction);
	    	
	    	lblDiplomes.setPreferredSize( new Dimension( 125, 24 ) );
	    	b12.add(lblDiplomes);
	    	b12.add(jtfDiplomes);
	    	
	    	lblSalaire.setPreferredSize( new Dimension( 125, 24 ) );
	    	b13.add(lblSalaire);
	    	b13.add(jtfSalaire);
	    	
	    	lblDateEmbauche.setPreferredSize( new Dimension( 125, 24 ) );
	    	b14.add(lblDateEmbauche);
	    	b14.add(jtfDateEmbauche);
	    	
	    	b15.add(new JLabel(" "));
	    	
	    	//La comboBox qui récupère les noms des employés
	    	b16.add(combo);
	    	
	    	//Ajout des boutons
	    	b16.add(boutonValiderModifier);
	    	b16.add(boutonMenu);
		    
		    //Nous ajoutons notre fenêtre à la liste des auditeurs des boutons
		    boutonMenu.addActionListener(this);
		    boutonValiderModifier.addActionListener(this);
	    }
	    
	    //Affichage des objets du Menu "Supprimer"
	    if(type_fenetre == "supprimer")
	    {
	    	//Ajout des objets
	    	label.setText("Supprimer un employé");
	    	label.setFont(new Font("Serif", Font.PLAIN, 36));
	    	
	        b1.add(label);
	        
	        b2.add(new JLabel(" "));
	        
	        lblPrenom.setPreferredSize( new Dimension( 125, 24 ) );
	        b3.add(lblPrenom);
	        b3.add(jtfPrenom);
	        
	        lblNom.setPreferredSize( new Dimension( 125, 24 ) );
	        b4.add(lblNom);
	        b4.add(jtfNom);
	        
	        lblDateNaissance.setPreferredSize( new Dimension( 125, 24 ) );
	        b5.add(lblDateNaissance);
	        b5.add(jtfDateNaissance);
	        
	        lblAdresse.setPreferredSize( new Dimension( 125, 24 ) );
	    	b6.add(lblAdresse);
	    	b6.add(jtfAdresse);
	    	
	    	lblVille.setPreferredSize( new Dimension( 125, 24 ) );
	    	b7.add(lblVille);
	    	b7.add(jtfVille);
	    	
	    	lblCP.setPreferredSize( new Dimension( 125, 24 ) );
	    	b8.add(lblCP);
	    	b8.add(jtfCP);
	    	
	    	lblTel.setPreferredSize( new Dimension( 125, 24 ) );
	    	b9.add(lblTel);
	    	b9.add(jtfTel);
	    	
	    	lblMail.setPreferredSize( new Dimension( 125, 24 ) );
	    	b10.add(lblMail);
	    	b10.add(jtfMail);
	    	
	    	lblFonction.setPreferredSize( new Dimension( 125, 24 ) );
	    	b11.add(lblFonction);
	    	b11.add(jtfFonction);
	    	
	    	lblDiplomes.setPreferredSize( new Dimension( 125, 24 ) );
	    	b12.add(lblDiplomes);
	    	b12.add(jtfDiplomes);
	    	
	    	lblSalaire.setPreferredSize( new Dimension( 125, 24 ) );
	    	b13.add(lblSalaire);
	    	b13.add(jtfSalaire);
	    	
	    	lblDateEmbauche.setPreferredSize( new Dimension( 125, 24 ) );
	    	b14.add(lblDateEmbauche);
	    	b14.add(jtfDateEmbauche);
	    	
	    	b15.add(new JLabel(" "));
	    	
	    	//La comboBox qui récupère les noms des employés
	    	b16.add(combo);
	    	
	    	//Ajout des boutons
	    	b16.add(boutonValiderSupprimer);
	    	b16.add(boutonMenu);
		    
		    //Nous ajoutons notre fenêtre à la liste des auditeurs des boutons
		    boutonMenu.addActionListener(this);
		    boutonValiderSupprimer.addActionListener(this);
	    }
	    
	    //Rend la fenêtre visible
	    this.setVisible(true);
	}
	
	//Méthode qui sera appelée lors d'un clic sur les bouton
	  public void actionPerformed(ActionEvent arg0)
	  {    
		  if(arg0.getSource() == boutonAjouter)
		  {
			  //On ferme le menu et on affiche la fenêtre demandée
			  this.dispose();
			  new Fenetre("ajouter");
		  }
			 
		  if(arg0.getSource() == boutonModifier)
		  {
			  //On ferme le menu et on affiche la fenêtre demandée
			  this.dispose();
			  new Fenetre("modifier");
		  }
		  
		  if(arg0.getSource() == boutonSupprimer)
		  {
			  //On ferme le menu et on affiche la fenêtre demandée
			  this.dispose();
			  new Fenetre("supprimer");
		  }
		  
		  if(arg0.getSource() == boutonMenu)
		  {
			  //On ferme le menu et on affiche la fenêtre demandée
			  this.dispose();
			  new Fenetre("menu");
		  }
		  if(arg0.getSource() == boutonValiderAjouter)
		  {
			  new Ajouter(jtfPrenom.getText(), jtfNom.getText(), jtfDateNaissance.getText(), jtfAdresse.getText(), jtfVille.getText(), jtfCP.getText(),
					  jtfTel.getText(), jtfMail.getText(), jtfDiplomes.getText(), jtfSalaire.getText(), jtfDateEmbauche.getText(), jtfFonction.getText());
		  }
		  
	  } 
}