### Exercises with control structures

## Task 1: 
I denne opgave skal du lave en switch, som printer antal dage i de forskellige måneder.
- 1.a Lav en variabel `month` af typen String
- 1.b Lav en switch, der anvender `month` og printer "<month> har x dage" hvor x er antallet af dage i måneden (ikke en variabel). 


## Task 2: 
I denne opgave skal du anvende variable i forbindelse med <code>printLn()</code> kommandoer.
- 2.a gem dit navn i en variable og print det
- 2.b gem din alder i en variable og print den
- 2.c gem hvorvidt du er glad lige nu i en variable af typen boolean (true for glad og false for trist) 
- 2.d ved at bruge de tre ovenstående variable, skal du nu printe følgende besked:
    "Hi, my name is \<name\>" <br />
    "I am \<age\> years old" <br />
    "I (don't) clap my hands" <br />
                                <br />
    hvor \<\> refererer til variable. <br />
    Der skal kun printes "don't" hvis din happy-variable har værdien false. <br />
                                
## Task 3:
I denne opgave skal du bruge relationelle operatorer (fx. <, >, <=) boolske operatorer(AND, OR, NOT).

- 3.a lav 2 integer variables kaldet a og b. Print "Success!" hvis en af dem har værdien 10 eller hvis summen af de to variable er 10. Hvis ikke, så print "Failure!".
- 3.b lav 2 integer variables kaldet min and max. Print "Success!" hvis følgende betingelse er opfyldt: summen af dem skal være højere end 10 og et af tallene skal være mindre end eller lig med 5.
- 3.c lav 3 integer variables kaldet x, y and z. Print "Success!" hvis deres sum er 30, men ingen af dem har værdien 10, 20 eller 30. Ellers print "Failure!".
- Test at din kode virker ved at give variablene forskellige værdier og kig på det printede output. 

 

## Task 4: 
Her skal du øve dig i at skrive for-loops og while-loops. 
- 4.a print tallene fra 0 til 20 ved hjælp af en for-loop.
- 4.b print alle lige tal fra 0 til 20 ved hjælp af en for-loop. 
<details>
        <summary>
           Hint
        </summary>
        google 'java modulus even number'
    </details>  

- 4.c Lav en variabel kaldet 'start' og giv den en int-værdi. Lav en for-loop som tæller ned fra værdien af variablen 'start'. Når din for-loop når 0, skal den printe "Take Off!"
- I den samme for-loop skal du tilføje kode, så tallene 3, 2 og 1 bliver printet som ord ("three", "two", "one").
<details>
        <summary>
           Hint
        </summary>
        String counterAsString="";
        switch(i){
            case 3: counterAsString = "three"
            ...
        }
    </details> 

- 4.d Lav opgave 4.b og 4.c igen, men brug while-loops denne gang. 


## Task 5: 
Nu skal du rette noget kode som har fejl og i øvrigt ikke er skrevet færdig.

- Kig på filen i mappen "TaskFive". 
- 5.a løs problemet i <code>MethodOne()</code>.
- 5.b løs problemet i <code>MethodTwo()</code>.

## Task 6: 
Denne opgave kan måske godt være lidt langhåret, så spring den over, hvis du er ved at være træt. 

Du skal du tegne et trafiklys der skifter på samme måde som et rigtigt trafiklys. 
Du kan gøre det på mange måder, men her kommer en opskrift hvor du skal erklære et sæt variable til at holde nogle bestemte farver og andet sæt variable der kan skifte mellem at være associeret med hver af de farver. 
På den måde kan du lade selve fill kommandoen være uændret selvom du ændrer farven. 

- 6.a Erklær og initialiser variable til at gemme farverne i et trafiklys (red, gul, grøn). Glem ikke at lave en variable til farven når lyset er slukket.
- 6.b Erklær og initialiser variable til at gemme hvilken farve hvert lys i trafiklyset har på et givet tidspunkt. 
- 6.c I setup-metoden skal du nu tegne en boks, som kan indeholde tre cirkler, som repræsenterer de tre lys i et trafiksignal. Cirklerne vil blive tegnet i draw-metoden.
- 6.d I draw-metoden skal du ændre værdien af de variable, du lavede i 6.b som repræsenterer lysene. Lysene skal ændres i et fastlagt interval. Du kan opnå dette ved at bruge en switch.
<details>
        <summary>
           Hint
        </summary>
       switch(frameCount%300){
        ...
       }
    </details> 
- 6.e Tilsidst skal du i draw-metoden tegne cirkler, der repræsenterer lysene. Gør dette lige efter at lys-variablene fra 6.b er blevet tildelt en værdi.


## Task 7: 
- 7.a erklær en integer-variable kaldet input tildel den værdien 20. Brug et loop til at printe alle tal mellem 'input' og 0 med følgende undtagelser: 
    - hvis tallet er 6, skal der printes strengen "six".
    - når tallet, der skal printe, er det halve af værdien af 'input', skal der printes "HALF!"
- 7.b. Kør din kode fra 7.a igen med en anden værdi for 'input' og se om det stadig virker. Du kan også overveje hvad du vil gøre ved negative værdier for 'input' som fx -20.
    
# Husk at push'e ændringerne til jeres Github Repository og linke til det under afleveringen på moodle. 

