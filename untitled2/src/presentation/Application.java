package presentation;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Produit> list =new ArrayList<Produit>();
        ImetierImpl a = new ImetierImpl();

        do {
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2. Rechercher un produit par son id.");
            System.out.println("3. Ajouter un nouveau produit dans la liste.");
            System.out.println("4. Supprimer un produit par id.");
            System.out.println("5. Quitter ce programme.");

            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();

            switch (x){
                case 1:
                    System.out.println(a.getAll());
                    break;
                case 2:
                    System.out.println("entre l\'id :");
                    Scanner scId = new Scanner(System.in);
                    System.out.println(a.getbyid(scId.nextLong());
                    break;
                case 3:
                    Produit produit = new Produit();

                    System.out.println("entre l\'id :");
                    id = sc.nextLong();
                    produit.setId(id);
                    if(a.findById(id) != null){
                        System.out.println("this id is already exists!!");
                        break;
                    }
                    System.out.println("entre le nom de produit :");
                    nom = sc.next();
                    produit.setNom(nom);

                    System.out.println("entre la marque :");
                    marque = sc.next();
                    produit.setMarque(marque);

                    System.out.println("entre le prix :");
                    prix = sc.nextFloat();
                    produit.setPrix(prix);

                    System.out.println("entre la description :");
                    description = sc.next();
                    produit.setDescription(description);

                    a.add(produit);

                    for (Produit p : a.getAll()) {
                        System.out.println(p);
                    }
                    System.out.println("le produit a ete insere avec succes");
                    break;
                case 4:
                    System.out.println("entre le id :");
                    id = sc.nextLong();
                    a.delete(id);
                    break;
                case 5:
                    System.out.println("bye!");
                    break;
                default:
                    System.out.println("chose another number");
                    break;
            }
        }while (x <= 5);
    }
}

