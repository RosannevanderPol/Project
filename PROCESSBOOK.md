Processbook
===========

# Day 1
Een app ontworpen om het vocabulaire van tweedetaalleerders van het Nederlands te vergoten. De NT2-leerders kunnen kiezen voor een 'oefen-modus' waarin zij voorwerpen/kleuren kunnen aanklikken op een plaatje, het Nederlandse woord hiervoor verschijnt dan in beeld. Ook kan de gebruiker dan klikken op het luidsprekertje, het woord wordt dan uitgesproken. Als er genoeg geoefend is kan er gekozen worden voor een 'toets-modus' waarin zij hun kennis kunnen testen. In de 'toets-modus' wordt een vraag gesteld en krijgt de gebruiker direct feedback op het gekozen antwoord.  
In zowel de 'oefen-' als de 'toets-modus' kan de gebruiker een categorie kiezen waarin hij of zij zijn of haar vocabulaire zou willen verbeteren of toetsen. De volgende categorieën komen aan bod:
* kleuren
* cijfers
* maanden
* dagen
* kleding
* fruit
* dieren
* lichaamsdelen
* keuken
* woonkamer
* op straat

# Day 2
* De categorieën en de woorden verzin ik zelf en ik haal mijn inspiratie uit reeds bestaande taalapps.
* De plaatjes ga ik zelf proberen samen te stellen uit plaatjes die ik van internet haal.

# Day 3
* Start prototype: de .xml’s en de .java’s

# Day 4
* De README en DESIGN verder uitgewerkt. Nieuwe schetsen met de computer gemaakt.

# Day 5
ziek

# Weekend

# Day 6
* Geklier met Github pullen, pushen en mergen, repo up-to-date krijgen.
* Geklier met Android Studio met de juiste SDK, updates ect. 

# Day 7
* DESIGN verbeterd, activities, fragments ect. Uitgewerkt.
* In de oefenmodus verschijnt nu het Nl woord als je op een knop drukt.

# Day 8
* In de oefen- en toetsmodus tekst-to-speech geïmplementeerd. Als je nu op het microfoontje klikt, wordt het woord in de textview opgelezen. Helaas is er geen Nederlands beschikbaar. Ik heb gekozen voor Duits omdat da qua klank nog het meest in de buurt van Nederlands zit. 

# Day 9
* De toetsmodus geïmplementeerd. Dat wil zeggen de app vraagt in deze modus nu om een kleur die je aan moet klikken, hij geeft feedback of de juiste kleur is aangeklikt: zo niet, moet je net zo lang proberen tot je wel de juiste hebt aangeklikt, zo ja, gaat hij meteen naar het volgende random gekozen woord uit de lijst. Als de lijst 8 woorden lang is, worden 2*8 vragen gestelt, daarna gaat de app automatisch terug naar het beginscherm. Ook heb ik een teller geimplementeerd die het aantal vragen bijhoudt. Als de app vraagt om een kleur, kun je ook op het microfoontje klikken voor het uitspreken van dit woord. 
* Zowel de oefen- als de toetsmodus zijn nu werkend voor de categorie 'kleur'.

# Day 10
* Presentatie van de app. 

# Weekend
* De categorie 'op straat' toegevoegd aan zowel de oefen- als de toetsmodus.
* Layout verbeterd.

# Day 11

# Day 12
* De categorie 'kleding' toegevoegd aan zowel de oefen- als de toetsmodus.
* Een teller en dialog melding geïmplementeerd in de toetsmodus met hoeveel vragen er fout zijn beantwoord. De nieuwe activity wordt pas gestart na een klik op OK. (voor nu alleen in de kleuren-toets, morgen verder met straat en kleding)

