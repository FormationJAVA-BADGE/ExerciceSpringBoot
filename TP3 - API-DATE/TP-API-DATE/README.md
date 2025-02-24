Cet exercice permet de manipuler des dates ainsi que de mettre en place l'injection de dépendance entre la couche Controller et la couche Service, par exemple.

### Endpoints à implémenter

- `/week` : Renvoie le numéro de la semaine courante.
- `/month` : Renvoie le mois courant en chiffre.
- `/day` : Renvoie le jour courant en chiffre.
- `/year` : Renvoie l’année courante.
- `/leap` : Renvoie `true` si c’est une année bissextile.

### Exemple d'utilisation de `LocalDate`

```java
LocalDate date = LocalDate.now();

// Récupérer le mois en cours
int mois = date.getMonthValue();

// Récupérer le jour
int jour = date.getDayOfMonth();

// Récupérer l’année
int annee = date.getYear();

// Vérifier si l’année est bissextile
boolean isLeapYear = date.isLeapYear();