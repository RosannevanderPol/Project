![icon](https://github.com/RosannevanderPol/Project/blob/master/doc/icon.png?raw=true) 
Project - Leer NL 
=================

![Screenshots1](https://github.com/RosannevanderPol/Project/blob/master/doc/Screenshots1.png?raw=true)
![Screenshots2](https://github.com/RosannevanderPol/Project/blob/master/doc/Screenshots2.png?raw=true)

# Short discription
Een app ontworpen om het vocabulaire van tweedetaalleerders van het Nederlands te vergoten. De NT2-leerders kunnen kiezen voor een 'oefen-modus' waarin zij voorwerpen/kleuren kunnen aanklikken op een plaatje, het Nederlandse woord hiervoor verschijnt dan in beeld. Ook kan de gebruiker dan klikken op het luidsprekertje, het woord wordt dan uitgesproken. Als er genoeg geoefend is kan er gekozen worden voor een 'toets-modus' waarin zij hun kennis kunnen testen. In de 'toets-modus' wordt een vraag gesteld en krijgt de gebruiker direct feedback op het gekozen antwoord.
In zowel de 'oefen-' als de 'toets-modus' kan de gebruiker een categorie kiezen waarin hij of zij zijn of haar vocabulaire zou willen verbeteren of toetsen. De volgende categorieën komen aan bod (de catorieën en de woorden zal ik zelf verzinnen, en inspriratie opdoen uit al bestaande taalapps):
* kleuren
* cijfers
* kleding
* dieren
* lichaamsdelen
* keuken
* woonkamer
* op straat
* gereedschap

De 'klikbare' afbeeldingen van de categorieën heb ik zelf samengesteld. De afbeeldingen van de categorieën kleuren, cijfers, dieren en lichaam heb ik gemaakt met afbeeldingen van internet en met paint, de categorieën huiskamer, keuken, kleding en gereedschap heb ik zelf geknipt en geplakt uit folders.

# Technical design
**Main activity**
* Text-to-speech activeren voor snelheid in de activities hierna.
* Twee knoppen: een voor oefenen en een voor toets.

**Oefen categorië overzicht**
* Knoppen voor alle verschillende oefen-categoriën.

**Toets categorie overzicht**
* Knoppen voor alle verschillende toets-categoriën.

**Oefencategoriën** (alle categoriën hebben een eigen activity met de volgende onderdelen: )
* Functie voor alle klikbare onderdelen: set text onderaan scherm & spreek uit (text-to-speech).
* Functie voor uitpreken als op de speeker wordt geklikt.
* Fucntie voor de terugknop.

**Toestcategoriën** (alle categoriën hebben een eigen activity met de volgende onderdelen: )
* Lijst met woorden.
* SelecteerWoord: random uit lijst kiezen, teller ophogen, uitspreken.
* Feedback: check of aangeklikte woord het zelfde is als het gevraagde woord, set feedback en smiley.
* CheckTeller: Als het maximale aantal vragen gesteld is een dialog scherm starten met aantal fout en  
ok-knop die terug stuurt naar de categoriën.
* Functie voor alle klikbare onderdelen: set text in onzichtbaar scherm (welke wordt vergeleken met het  
gekozen woord uit d random-functie.
* Functie voor uitpreken als op de speeker wordt geklikt.
* Fucntie voor de terugknop.

# Challenges & changes with arguments
