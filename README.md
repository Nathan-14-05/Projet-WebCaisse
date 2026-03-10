# Projet WebCaisse
Projet de gestion de caisse développé en Java (JavaFX + MySQL).

## Structure
- `/code` : Projet IntelliJ (Maven).
- `/documentation` : Documentation technique au format AsciiDoc.

## Prérequis
- Java 17 ou supérieur.
- MySQL (Laragon ou XAMPP).
- IntelliJ IDEA.

## Installation
1. Importer le projet Maven situé dans le dossier `/code`.
2. Créer la base de données `webcaisse` via le script SQL fourni.
3. Configurer les accès base de données dans `GrcDAO.java`.
4. Lancer `Launcher.java`.

## Tests
Les tests unitaires (JUnit 5) sont situés dans `src/test/java`.
