![icon](https://github.com/RosannevanderPol/Project/blob/master/doc/icon.png?raw=true) 
Project - Leer NL by Rosanne van der Pol
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

**Oefencategorieën** (alle categorieën hebben een eigen activity met de volgende onderdelen: )
* Functie voor alle klikbare onderdelen: set text onderaan scherm & spreek uit (text-to-speech).
* Functie voor uitpreken als op de speeker wordt geklikt.
* Fucntie voor de terugknop.

**Toestcategorieën** (alle categorieën hebben een eigen activity met de volgende onderdelen: )
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
* De grootste verandering als je mijn design document bekijkt en mijn app nu, is de ordening van het kiezen van de toets- of oefenmodus en vervolgens de categorieën. Ik had van te voren bedacht de 'keuzes' op te slaan in shared preferences en daarmee de juiste afbeelding te laten kiezen in de oefen-/toetsactivity. Toen ik eenmaal begon, heb ik elke categorie in de oefen- en toetsmodus zijn eigen activity gegeven en dat heb ik zo gelaten. Een voordeel is dat het voor zo ver ik kan inschatten 'simpeler' te implementeren is op de huidige manier. Een nadeel is dat in alle activities bepaalde delen gelijk gelijk zijn, dat is niet zo mooi misschien.
* De text-to-speech-functie is geworden zoals ik van te voren bedacht heb, namelijk als je op een knop drukt, wordt het woord uitgesproken. Waar en gebruiker mij op attendeerde, is dat ik als icoontje een microfoon had gebruikt i.p.v. een speeker, hij raakte daarvan in de war. Een extra functie aan de text-to-speech is dat het woord/de vraag automatisch wordt uitgesproken zonder klik op de speeker. 
* Ik heb ook nog gestoeid met de taal van text-to-speech. In de code kon ik 'Nederlands' niet hardcoden, alleen 'Duits'. Later heb ik ontdekt als ik als taal 'Default' hardcode, en op mijn telefoon Nederlands als standaard instel, het wel Nederlands wordt uitgesproken. 
* Van te voren had ik ook bedacht twee tellers bij te houden, één voor goed en één voor fout antwoorden. Aangezien ik het beter vond voor de gebruiker om te blijven proberen tot het antwoord goed is, heb ik de 'aantal-goede-antwoorden-teller' achterwege gelaten. De gebruiker krijgt nu aan het einde alleen te zien hoeveel fout hij of zij heeft gemaakt.
* In de toets-modus had ik van te voren bedacht dat het woord uit de vraag random uit een lijst te kiezen. Dit heb ik in eerste instantie ook geimplementeerd. Ik kwam er toen (natuurlijk) achter, dat er soms wel drie keer achter elkaar hetzelfde woord bevraagd werd. Ik heb mijn random functie toen zo aangepast dat er opnieuw random een woord gekozen word, zolang het hetzelfde woord is als het huidige woord. 
* Wat ook opviel was dat de teller op de achtergrond doortelde naar bijvoorbeeld 21 van de 20 als het dialog-schermpje in beeld kwam met het aantal fout en de toets dus al was afgelopen. Dat was niet zo mooi, ik heb toen de code zo aangepast dat de hele functie blijft lopen while de teller <= was dan het maximale aantal vragen. 
* Het laatste probleem waar ik tegen aanliep was met het veranderen van de lay-out. Ik had heel leuk allemaal 'Hollandse' achtergrondjes verzameld: kaas, delfts-blauw, klompen ect. Ik vond dat toen alleen niet ten goede komen van de leesbaarheid. Ik heb toen twee 'Hollandse' maar rustige achtergronden gehouden (strand en duinen). 
