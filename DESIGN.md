Project-Taalapp
=================

### Interface
De interface bestaat voornamelijk uit 'kliks' van de gebruiker. De gebruiker hoeft niets te typen oid, enkel op het (juiste)onderdeel uit het plaatje te klikken. 

### Ext. API
Ik wil gebruik maken van de text-to-speech API van google. Als het Nederlandse woord in beeld verschijnt is het voor de gebruiker mogelijk om dit woord te horen door deze feature.

### Classes and methodes
De app bestaat vooral uit klikbare afbeeldingen. Een afbeelding wordt aan het corresponderende woord gelinkt. In de 'oefenmodus' verschijnt het woord in een textview na klikken op een afbeelding. In de 'toets-modus' moet op het juistje plaatje geklikt worden afhankelijk van welk woord in beeld staat. In de 'toets-modus' verschijnt dan vervolgens feedback in een textview. 

### Data sets and sources
De woorden die geoefend en getoets worden staan in woordenlijsten. De categorie die gekozen word, bepaalt welke woordenlijst en afbeelding worden geactiveerd.  

### Indeling:
**mainactivity**  
* selectmodus  
onthoud voorkeur in sharedpreferences  
  
**category**  
* selectcategory  
onthoud voorkeur in sharedpreferences  
* select play  
combineer select modus en cat tot de juiste play (bv. oefenen en kleding, of toets en kleuren)  
  
**oefenen**  
* selectafbeelding    
shared pref category  
* showword  
if 'broek' clicked, show in textview 'broek' 
* text-to-speech  
als op het microfoontje geklikt word, spreek het woord uit de textview uit
  
**toets**  
* selectafbeelding  
shared pref category  
* counter  
houdt het aantal goede en foute antwoorden bij  
* choosequestion  
selecteer het object wat door de gebruiker aangewezen moet worden (random from a list?)  
* clickedobject  
onthoud waarom geklikt is  
* correct  
  if choosequestion == clickedobject  
    correct + teller  
  else  
    wrong + teller  
  
![schets](https://github.com/RosannevanderPol/Project/blob/master/doc/schets.jpg?raw=true)
