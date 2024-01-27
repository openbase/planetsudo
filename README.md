# Planet Sudo

## Installation via IntelliJ IDE

### Intellij installieren

- IntelliJ Community Edition herunterladen und installieren sofern nicht schon vorhanden.
    - https://www.jetbrains.com/idea/download/
  
### Tools installieren

- JDK 17 (Java Development Kit 17) via IntelliJ installieren.
- GIT via IntelliJ installieren.
    
### Planet Sudo installieren

- TODO JONAS
- Jetzt kann PlanetSudo gestartet werden. (Hierzu auf den grünen Playbutton drücken)
- Um eine bessere Unterstützung bei der KI-Entwickelung zu erhalten, in der "Project" Ansicht einen rechten Mausklick auf den  "ai" Wurzelordner ausführen und anschließen auf "Maven->Download Source and Documentation" klicken.

## Anlegen einer neuen KI

- Im PlanetSudoAI Projektansicht zur Klasse "DefaultStrategy.kt" navigieren (src->main->kotlin->org->openbase->planetsudo->game->strategy) und hier die "DefaultStrategy.kt" mit einem Rechtsklick auf die Klasse (Refactor->Rename) umbenennen.
- Die neue Strategieklasse kann nun erweitert werden.
- Informationen über mögliche Funktionalitäten könnt ihr über die Methoden Dokumentation (JavaDoc) herausfinden.
    - z. B. ihr schreibt "agent." und drückt dann (Strg + Leertaste).

## Anlegen eines neuen Teams

- Sofern ihr zuvor eine neue Strategieklasse angelegt habt, bitte zunächst PlanetSudo beenden und anschließen neu starten. 
- Anschließend in PlanetSudo unter Einstellungen auf "Team erstellen" klicken.
- Wichtig ist hierbei, dass eine gültige Strategie angegeben wird. Hier erfolgt die Eingabe des Namens der zuvor erstellten Strategieklasse. Der Dateitype (".kt") wird hierbei nicht benötigt.

## Mit dem Server synchronisieren

- Zunächst muss das eigene Team definiert werden. Hierzu in dem DropDown Menü (Mein Team) ein Team auswählen und anschließend bestätigen.
- Nun kann über den Synchronisations-Button die Synchronisation erfolgen, sofern der Server erreichbar ist.
- Ist das Statusfeld Blau, ist der Transfer erfolgreich gewesen.

## Sonstiges

- Viel Spaß beim KI Entwickeln und Spielen :)
- Sollten euch gravierende Fehler auffallen, anderweitige Probleme auftreten oder ihr eine coole Erweiterungsidee habt:
    - Erstellt ein Issue auf Github (https://github.com/openbase/planetsudo/issues/new)
    - Oder Kontaktiert uns per mail: support@openbase.org


Copyright (C) 2009 - 2024 openbase.org
