# Planet Sudo

## Installation via IntelliJ IDE

### Intellij installieren

- IntelliJ **Community Edition** (nicht die Ultimate Edition!) [herunterladen](https://www.jetbrains.com/idea/download/) und installieren.
  ![Downloadseite der Community Edition](src\main\resources\img\readme\0_DownlaodIDEA.png)

  ![Installationsübersicht der IntelliJ IDEA](src\main\resources\img\readme\1_IstallIDEA.png)

### Git installieren

- In IntelliJ auf `Get from VSC` klicken, dann auf `Repository URL`.
- Version control auf `Git` einstellen.
- Sollte die Fehlermeldung `Git is not installed` auftauchen au `Download and Install` klicken.
  ![Übersicht des Get from Version Control Fensters](src\main\resources\img\readme\2_InstallGIT.png)
    
### Planet Sudo installieren

- In IntelliJ im selben Fenster die URL `https://github.com/openbase/planetsudo` einfügen und auf `Clone` klicken.
- Sollte die Fehlermeldung `JDK "17" is missing` auftreten auf `Configure...` --> `Download JDK` gehen und dann `Eclipse Temurin` auswählen und installieren.
  ![Das Download JDK Fenster](src\main\resources\img\readme\3_ConfigureJDK.png)

- Die Datei `src/main/kotlin/org.openbase.planetsudo/main/PlanetSudo.kt` öffnen (Doppelklick).
- Jetzt kann PlanetSudo gestartet werden. (Hierzu auf den grünen Playbutton drücken)
  ![Wie man Planet Sudo Startet](src\main\resources\img\readme\4_RunPlanetSudo.png)
- 
## Anlegen einer neuen KI

- Im PlanetSudoAI Projektansicht zur Klasse "DefaultStrategy.kt" navigieren (`src/main/kotlin/org.openbase.planetsudo/game.strategy`) und hier die `DefaultStrategy.kt` mit einem Rechtsklick auf die Klasse (`Refactor->Rename`) umbenennen.
  ![Wie man eine Klasse umbenennt](src\main\resources\img\readme\5_Refactor.png)
- Die neue Strategieklasse kann nun erweitert werden.
- Informationen über mögliche Funktionalitäten könnt ihr über die Methoden Dokumentation (JavaDoc) herausfinden.
    - z. B. ihr schreibt `agent.` und drückt dann (Strg + Leertaste).

## Anlegen eines neuen Teams

- Sofern ihr zuvor eine neue Strategieklasse angelegt habt, bitte zunächst PlanetSudo beenden und anschließen neu starten. 
- Anschließend in PlanetSudo unter `Einstellungen` auf `Team erstellen` klicken.
- Wichtig ist hierbei, dass eine gültige Strategie angegeben wird. Hier erfolgt die Eingabe des Namens der zuvor erstellten Strategieklasse. Der Dateityp (".kt") wird hierbei nicht benötigt.

## Mit dem Server synchronisieren

- Zunächst muss das eigene Team definiert werden. Hierzu in dem DropDown Menü (Mein Team) ein Team auswählen und anschließend bestätigen.
- Nun kann über den Synchronisations-Button die Synchronisation erfolgen, sofern der Server erreichbar ist.
- Ist das Statusfeld Blau, ist der Transfer erfolgreich gewesen.

## Sonstiges

- Viel Spaß beim KI Entwickeln und Spielen :)
- Sollten euch gravierende Fehler auffallen, anderweitige Probleme auftreten oder ihr eine coole Erweiterungsidee habt:
    - Erstellt ein Issue auf [Github](https://github.com/openbase/planetsudo/issues/new)
    - Oder kontaktiert uns per [Mail](mailto:support@openbase.org)


Copyright (C) 2009 - 2024 openbase.org
