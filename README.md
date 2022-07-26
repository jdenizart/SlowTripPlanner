# SlowTripPlanner
Voici notre projet fil rouge pour la Formation POE IDP JAVA JEE avec ASTON

# Résumé / Contexte

Planificateur de voyage de quelques jours à plusieurs semaines, à pied ou à vélo.
Permet de créer un voyage comportant des étapes (journée ayant un point de départ, un point d'arrivée, une date, ...) auxquelles on associe un ensemble de contraintes qui permettront de faire évoluer le projet sans le chambouler entièrement.
L'application sera visuellement basée sur la combinaison d'un calendrier et d'une carte.

# Participants
- Mariam Cisse
- Jérôme Denizart
- Adrien Marceau
- Nicolas Simon

# Lancement 
````
- Rendre accessible une base de données vide nommée "slowdb" accessible sur le port "3306".
- cloner le repository in PATH
- cd SlowTripPlanner.
- npm install.
- cd back\slowSpring\src\main\java\aston\slowspring
- run SlowSpringApplication.java
- cd PATH\SlowTripPlanner\front\slowAngular\
- npm install leaflet
- npm i --save-dev @types/leaflet
- npm i leaflet-routing-machine
- npm i --save-dev @types/leaflet-routing-machine
- ng serve -o
- aller sur localhost:8080
````