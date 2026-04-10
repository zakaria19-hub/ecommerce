Structure du projet (IntelliJ)
Projet : ecommerce
Packages :
controller
entity
repository
service
<img width="1919" height="1002" alt="Capture d&#39;écran 2026-04-10 130104" src="https://github.com/user-attachments/assets/67a6557b-d4f5-422b-8096-304ff1468044" />
Description :
Cette capture montre l’architecture du projet Spring Boot.
Le projet respecte le modèle MVC (Model - View - Controller), ce qui permet une bonne organisation du code.

---

Classe principale
Fichier : EcommerceApplication.java
Annotation : @SpringBootApplication 
<img width="1916" height="921" alt="Capture d&#39;écran 2026-04-10 124355" src="https://github.com/user-attachments/assets/d10079ed-ae7e-4d2e-a4ab-8cb151295306" />
Description :
Cette classe est le point de démarrage de l’application.
Spring Boot lance le projet à partir de cette classe.
---
Controllers
ProduitController
CommandeController
UtilisateurController
CommandeProduitController
<img width="1919" height="1003" alt="Capture d&#39;écran 2026-04-10 124204" src="https://github.com/user-attachments/assets/2670c60e-7ee1-4e46-bd39-2d929cbb43b9" />
Description :
Les controllers permettent de gérer les API REST (GET, POST, PUT, DELETE).
Ils reçoivent les requêtes du client (Postman).
---
Entities
Produit
Utilisateur
Commande
CommandeProduit
<img width="1919" height="1000" alt="Capture d&#39;écran 2026-04-10 124150" src="https://github.com/user-attachments/assets/fe6d3e14-d9dd-4ff8-b637-6b1d95663f91" />
Description :
Les entités représentent les tables de la base de données.
Chaque classe correspond à une table MySQL.
---
Repositories
ProduitRepository
UtilisateurRepository
CommandeRepository
CommandeProduitRepository
<img width="1919" height="993" alt="Capture d&#39;écran 2026-04-10 123923" src="https://github.com/user-attachments/assets/b33234e9-fcae-4a02-95f8-39e1a48ed1e4" />
Description :
Les repositories permettent l’accès aux données (CRUD) via Spring Data JPA.
---
Services
ProduitService
UtilisateurService
CommandeService
CommandeProduitService
<img width="1918" height="1004" alt="Capture d&#39;écran 2026-04-10 123914" src="https://github.com/user-attachments/assets/3f0a043a-b469-4672-a913-d5ffe1cb48a2" />
Description :
Les services contiennent la logique métier de l’application.
---
Console Spring Boot
Logs Hibernate
Création automatique des tables
<img width="1919" height="995" alt="Capture d&#39;écran 2026-04-10 122251" src="https://github.com/user-attachments/assets/f3aa1435-ec89-4c73-8db6-e5439e0afb08" />
Description :
La console montre que Spring Boot fonctionne correctement.
Hibernate a créé automatiquement les tables dans la base de données.
---
phpMyAdmin - Base de données
Base : ecommerce_db
Tables :
produit
utilisateur
commande
commande_produit
<img width="1919" height="1015" alt="Capture d&#39;écran 2026-04-10 122056" src="https://github.com/user-attachments/assets/d2796974-b25f-4c0a-a151-7d4b06b94484" />
Description :
Cette capture confirme que la base de données a été créée avec succès.
---
Table PRODUIT (vide)
Colonnes :
id
nom
description
prix
stock
<img width="1919" height="1004" alt="Capture d&#39;écran 2026-04-10 122046" src="https://github.com/user-attachments/assets/10105c83-bfe7-4d0f-a4f0-0e065f47fdd3" />
Description :
La table produit existe mais ne contient encore aucune donnée
---
Table UTILISATEUR (vide)
Colonnes :
id
nom
email
adresse
<img width="1919" height="1018" alt="Capture d&#39;écran 2026-04-10 122020" src="https://github.com/user-attachments/assets/69b3e882-6f1c-40cb-8d9d-bba268c6bbeb" />
Description :
La table utilisateur est bien créée mais vide au début.
---
POST Produit (Postman)
````
{
  "nom": "PC",
  "description": "HP i5",
  "prix": 5000,
  "stock": 10
}
````
<img width="1919" height="1018" alt="Capture d&#39;écran 2026-04-10 121953" src="https://github.com/user-attachments/assets/528ea96b-61a4-4232-afcd-e33a627f3af5" /> 
Envoi d’une requête POST pour ajouter un produit.
Le produit est enregistré avec succès.
---
GET Produits
URL : /api/produits
<img width="1919" height="1016" alt="Capture d&#39;écran 2026-04-10 121916" src="https://github.com/user-attachments/assets/99cf41b0-ce00-4656-9aee-74810021be16" />
Description :
Affichage de la liste des produits en format JSON.
Cela confirme que l’API fonctionne.
---
Table PRODUIT (avec données)
Exemple :
PC → 5000
tablette → 2000
<img width="1919" height="998" alt="Capture d&#39;écran 2026-04-10 121848" src="https://github.com/user-attachments/assets/8b8543fc-6631-4c37-b43e-c9c1b0d08582" />
Description :
Les produits sont bien enregistrés dans la base de données.
---
POST Utilisateur
````
{
  "nom": "Ahmed",
  "email": "ahmed@gmail.com",
  "adresse": "Casablanca"
}
````
Description :
Ajout d’un utilisateur via API REST.
---
Table UTILISATEUR (avec données)
Plusieurs utilisateurs enregistrés
<img width="1919" height="1022" alt="Capture d&#39;écran 2026-04-10 121831" src="https://github.com/user-attachments/assets/3e54a33e-7dea-4f6b-a40e-fd6c90c7b2c4" />
Description :
Les données utilisateur sont bien stockées dans la base.
---
POST Commande
````
{
  "dateCommande": "2026-04-10",
  "total": 5000,
  "utilisateur": {
    "id": 2
  }
}
````
Description :
Création d’une commande liée à un utilisateur.
---
Table COMMANDE
Champs :
date_commande
total
utilisateur_id
<img width="1919" height="1011" alt="Capture d&#39;écran 2026-04-10 121704" src="https://github.com/user-attachments/assets/7235190d-d4a2-4a4e-8735-302209adaa1c" />
Description :
La commande est bien enregistrée avec relation vers utilisateur.
---
Table COMMANDE_PRODUIT
Champs :
quantite
commande_id
produit_id
<img width="1919" height="1002" alt="Capture d&#39;écran 2026-04-10 121336" src="https://github.com/user-attachments/assets/5493e3fe-b497-4aea-a222-88ada413eb8d" />
Description :
Cette table gère la relation entre commandes et produits.
---
POST Utilisateur (Postman)
````
{
  "nom": "zakaria",
  "email": "zakaria@gmail.com",
  "adresse": "Casablanca"
}
````

<img width="1919" height="1009" alt="Capture d&#39;écran 2026-04-10 121331" src="https://github.com/user-attachments/assets/6ded8803-a550-452d-81ef-a02a9988120f" />

Description :
Cette requête POST permet d’ajouter un nouvel utilisateur via l’API /api/utilisateurs.
Le serveur retourne un code 200 OK, ce qui signifie que l’utilisateur a été créé avec succès.
---
Table UTILISATEUR (phpMyAdmin)
Plusieurs utilisateurs enregistrés :
Ahmed
zakaria

<img width="1919" height="1005" alt="Capture d&#39;écran 2026-04-10 121326" src="https://github.com/user-attachments/assets/4db4811f-f5c4-4628-8464-d043b99c5ebe" />
Description :
Cette capture montre que les utilisateurs ajoutés via Postman sont bien enregistrés dans la base de données.
La synchronisation entre backend et MySQL fonctionne correctement.
---
Table COMMANDE_PRODUIT (vide)
Colonnes :
id
quantite
commande_id
produit_id
<img width="1919" height="1006" alt="Capture d&#39;écran 2026-04-10 121321" src="https://github.com/user-attachments/assets/94561440-cce8-4e1d-89a9-5de883102e16" />
Description :
La table existe mais ne contient aucune donnée pour le moment.
Cela signifie qu’aucune relation produit-commande n’a encore été ajoutée.
---
Table PRODUIT (avec données)
Exemple :
PC → 5000
tablette → 2000
<img width="1919" height="1004" alt="Capture d&#39;écran 2026-04-10 121308" src="https://github.com/user-attachments/assets/d41de37f-fedc-47fe-a8f3-8469602252db" />
Description :
Les produits sont bien stockés dans la base.
Chaque produit contient : nom, description, prix et stock.
---
Table UTILISATEUR (mise à jour)
Données visibles :
Ahmed
zakaria
<img width="1919" height="1010" alt="Capture d&#39;écran 2026-04-10 121236" src="https://github.com/user-attachments/assets/074bac30-16ee-4abd-973a-ddabe50c4a67" />
Description :
Confirmation que plusieurs utilisateurs existent après plusieurs requêtes POST.
Le système supporte l’ajout multiple d’utilisateurs
---
Table COMMANDE
Exemple :
date : 2026-04-10
total : 5000
utilisateur_id : 2
<img width="1919" height="1014" alt="Capture d&#39;écran 2026-04-10 121204" src="https://github.com/user-attachments/assets/9713882e-e2ae-4bde-9076-bb609f8caf56" />
Description :
Une commande a été créée et liée à un utilisateur grâce à une clé étrangère (utilisateur_id).
Cela montre la relation entre commande et utilisateur.
---
Table COMMANDE_PRODUIT (avec données)
Exemple :
quantite : 2
commande_id : 2
produit_id : 1

**<img width="1919" height="1011" alt="Capture d&#39;écran 2026-04-10 121154" src="https://github.com/user-attachments/assets/74e4ec9e-cb09-493b-99b5-86aeecc19508" />
** 
Description :
Cette table contient maintenant une relation entre commande et produit.
Elle permet de gérer les produits inclus dans chaque commande.
---
POST Commande (Postman)
````
{
  "dateCommande": "2026-04-10",
  "total": 5000,
  "utilisateur": {
    "id": 2
  }
}
````
Description :
Création d’une commande via l’API /api/commandes.
La commande est liée à un utilisateur existant grâce à son ID
---
Table COMMANDE (confirmation)
Donnée enregistrée avec succès

<img width="1919" height="1012" alt="Capture d&#39;écran 2026-04-10 121148" src="https://github.com/user-attachments/assets/af190198-55c5-4ee8-9a63-ff3c44e264f7" />
Description :
La commande créée via Postman est bien enregistrée dans la base de données.
Cela valide le bon fonctionnement de l’API backend.
---
Table COMMANDE_PRODUIT (confirmation)
Relation produit-commande visible

<img width="1919" height="1012" alt="Capture d&#39;écran 2026-04-10 121139" src="https://github.com/user-attachments/assets/35737bda-87ad-4bf0-8585-56947c469fb2" />
Description :
Cette capture confirme que la relation entre commande et produit fonctionne correctement.
Le système gère bien les relations Many-to-Many via une table intermédiaire.



Conclusion finale
✔️ Ajout d’utilisateurs via API
✔️ Ajout de produits
✔️ Création de commandes
✔️ Liaison commande ↔ utilisateur
✔️ Liaison commande ↔ produit
✔️ Vérification dans phpMyAdmin

👉 Le projet fonctionne correctement de bout en bout (backend + base de données).
















