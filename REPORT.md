![icon](https://github.com/RosannevanderPol/Project/blob/master/doc/icon.png?raw=true) 
'Leer NL' by Rosanne van der Pol
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
* De grootste verandering ten opzichte van mijn design document en mijn app nu, is hoe ik 'code-technisch' omga met de keuze van de gebruiker voor de toets- of oefenmodus en vervolgens met de categorie-keuze. Ik had van te voren bedacht de 'keuzes' op te slaan in shared preferences en daarmee de juiste afbeelding te laten kiezen in de oefen- of toetsactivity. Toen ik eenmaal begon, heb ik elke categorie zowel in de oefen- als toetsmodus zijn eigen activity gegeven en dat heb ik zo gelaten. Een voordeel is dat het 'simpeler' te implementeren is op de huidige manier. Een nadeel is dat in alle activities bepaalde delen gelijk gelijk zijn, dat is niet zo mooi.
* De text-to-speech-functie is geworden zoals ik van te voren bedacht had. Namelijk dat je op een knop kunt drukken om het woord uit te laten spreken door de telefoon. Waar en oefen-gebruiker van de app mij op attendeerde, is dat ik als icoontje voor deze knop een microfoontje had gebruikt i.p.v. een speekertje. Deze oefen-gebruiker raakte daarvan in de war. 
* Een aanvulling van de text-to-speech fucntie, is dat het woord in de oefenmodus en de vraag in de toetsmodus automatisch worden uitgesproken, dus zonder een klik op de speeker. 
* Ik heb ook nog gestoeid met de taal van text-to-speech. In de code kon ik 'Nederlands' niet hardcoden, alleen 'Duits'. Later heb ik ontdekt dat wanneer ik als taal 'Default' hardcodede en op mijn telefoon zelf, Nederlands als standaardtaal voor text-to-speech instel, er wel Nederlands wordt uitgesproken. 
* Van te voren had ik bedacht om in de toetsmodus twee tellers bij te houden, één voor goede en één voor foute antwoorden. Aangezien ik het beter vond om de gebruiker te laten proberen zijn of haar foute antwoord te laten verbeteren tot het antwoord goed is, heb ik de 'aantal-goede-antwoorden-teller' achterwege gelaten aangezien die dan automatisch op het het maximale zou staan. De gebruiker krijgt nu aan het einde alleen te zien hoeveel fouten hij of zij heeft gemaakt.
* In de toets-modus had ik van te voren bedacht dat het woord uit de vraag random uit een lijst gekozen zou worden. Dit heb ik in eerste instantie ook zo geïmplementeerd. Ik kwam er toen (natuurlijk) achter, dat soms wel drie keer achter elkaar hetzelfde woord bevraagd werd. Ik heb toen mijn random functie zo aangepast dat er opnieuw random een woord gekozen wordt, zolang het hetzelfde woord is als het huidige woord. 
* Wat ook opviel was dat de teller op de achtergrond doortelde naar bijvoorbeeld 21 van de 20 als het dialog-schermpje in beeld kwam met het aantal fout en de toets dus al was afgelopen. Dat was niet zo mooi, ik heb toen de code zo aangepast dat de hele functie blijft lopen while de teller <= was dan het maximale aantal vragen. Nu stopt de teller precies op het juiste moment.  
* Het laatste probleem waar ik tegen aanliep was met het veranderen van de lay-out. Ik had heel leuk allemaal 'Hollandse' achtergrondjes verzameld: kaas, delfts-blauw, klompen ect. Maar toen ik deze achtergrondjes ging gebruiken vond ik dat het niet ten goede kwam van de leesbaarheid. Ik heb toen twee 'Hollandse' maar rustige achtergronden gekozen (strand en duinen) voor de hele oefen- en de hele toetsmodus. Alleen de startpagina is anders. 

© Rosanne van der Pol, 2016
