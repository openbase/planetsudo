# Planet Sudo

## Installation via IntelliJ IDE

### Java installieren

- Java JDK installieren wobei die Java Version mindestens JDK 8 (Java SE Development Kit 8) betragen sollte.
    - [Download Netbeans Bundle](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
### Intellij installieren

- IntelliJ Community Edition herunterladen und installieren sofern nicht schon vorhanden.
    - https://www.jetbrains.com/idea/download/
    
### Planet Sudo installieren

- PlanetSudo AI Projekt herunterladen:
    - entweder hier klicken [Download](https://github.com/openbase/planetsudo.ai/archive/stable.zip) und das Projekt als zip runterladen und entpacken. (Anfänger)
        - Achtung bei dieser Methode geht die git Versionisierung verlohren.
    - oder einen Fork auf github erstellen https://github.com/openbase/planetsudo.ai.git und mit git local in einen Ordner clonen. (Für erfahrene Github Benutzer)
    
- In IntelliJ das Projekt öffnen (File->Open) und den PlanetSudoAI Ordner als Projekt laden.
- Anschließend die settings.xml (liegt im Projektordner) in den .m2 Ordner im Benutzerverzeichniss kopieren. 
    - Windows: settings.xml -> C:\Dokumente und Einstellungen/%USERNAME%/.m2/
        - Alternative kann hierfür auch das "setup-mvn.bat" script ausgeführt werden welches den Kopiervorgang übernimmt.
    - Linux: settings.xml -> ~/.m2/
- Jetzt kann PlanetSudo gestartet werden. (Hierzu auf den Playbutton drücken)
- Um eine bessere Unterstützung bei der KI-Entwickelung zu erhalten, in der "Project" Ansicht einen rechten Mausklick auf den  "ai" Wurzelordner ausführen und anschließen auf "Maven->Download Source and Documentation" klicken.

## Anlegen einer neuen KI

- Im PlanetSudoAI Projektansicht zur Java Klasse "DefaultStategy.java" navigieren (src->main->java->org->openbase->planetsudo->game->strategy) und hier die "DefaultStategy.java" mit einem Rechtsklick auf die Klasse (Refactor->Rename) umbenennen.
- Die neue Stategieklasse kann nun nach belieben erweitert werden.
- Informationen über mögliche Funktionalitäten könnt ihr über die Methoden Dokumentation (JavaDoc) herausfinden.
    - z.B ihr schreibt "agent." und drückt dann (Strg + Leertaste).

## Anlegen eines neuen Teams

- Sofern ihr zuvor eine neue Strategieklasse angelegt habt, bitte zunächst das Projekt kompilieren. 
- Hierzu einen rechten Mausklick auf das Projekt machen und anschließend im Menü "Clean and Build" auswählen. 
- Anschließend in PlanetSudo unter Einstellungen auf "Team erstellen" klicken.
- Wichtig ist hierbei, dass eine gültige Strategie angegeben wird. Hier erfolgt die Eingabe des Namens der Javaklasse die die entsprechende Strategie enthält. Der Sufix ".java" wird hierbei nicht angegeben.

## Mit dem Server synchronisieren

- Zunächst muss das eigene Team definiert werden. Hierzu in dem DropDown Menü (Mein Team) ein Team auswählen und anschließend bestätigen.
- Nun kann über den Synchronisations-Button die Synchronisation erfolgen sofern der Server gestartet ist.
- Ist das Statusfeld Blau, ist der Transfer erfolgreich gewesen.

## Sonstiges

- Viel Spaß beim Spielen und Entwickeln :)
- Sollten euch gravierende Fehler auffallen, anderweitige Probleme auftreten oder ihr eine coole Erweiterungsidee habt:
    - Erstellt ein Issue auf Github (https://github.com/openbase/planetsudo/issues/new)
    - Oder Kontaktiert uns per mail: support@openbase.org


Copyright (C) 2009 - 2018 openbase.org
