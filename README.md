# Planet Sudo

## Installation via IntelliJ IDE

### Intellij installieren

- IntelliJ **Community Edition** (nicht die Ultimate Edition!) [herunterladen](https://www.jetbrains.com/idea/download/) und installieren.</br></br>
![Downloadseite der Community Edition](.readme/0_DownlaodIDEA.png)</br></br>
![Installationsübersicht der IntelliJ IDEA](.readme/1_IstallIDEA.png)</br></br>

### Git installieren

- In IntelliJ auf `Get from VSC` klicken, dann auf `Repository URL`.
- Version control auf `Git` einstellen.
- Sollte die Fehlermeldung `Git is not installed` auftauchen auf `Download and Install` klicken.</br></br>
![Übersicht des Get from Version Control Fensters](.readme/2_InstallGIT.png)</br></br>
    
### Planet Sudo installieren

- In IntelliJ im selben Fenster die URL `https://github.com/openbase/planetsudo` einfügen und auf `Clone` klicken.
- Sollte die Fehlermeldung `JDK "17" is missing` auftreten auf `Configure...` --> `Download JDK` gehen und dann `Eclipse Temurin` auswählen und installieren.</br></br>
![Das Download JDK Fenster](.readme/3_ConfigureJDK.png)</br></br>

- Die Datei `src/main/kotlin/org.openbase.planetsudo/main/PlanetSudo.kt` öffnen (Doppelklick).
- Jetzt kann PlanetSudo gestartet werden. (Hierzu auf den grünen Playbutton drücken)</br></br>
![Wie man Planet Sudo Startet](.readme/4_RunPlanetSudo.png)</br></br>
## Anlegen einer neuen KI

- Im PlanetSudoAI Projektansicht zur Klasse "DefaultStrategy.kt" navigieren (`src/main/kotlin/org/openbase/planetsudo/game/strategy`) und hier die `DefaultStrategy.kt` mit einem Rechtsklick auf die Klasse (`Refactor` --> `Rename`) umbenennen.</br></br>
![Wie man eine Klasse umbenennt](.readme/5_Refactor.png)</br></br>
- Die neue Strategieklasse kann nun erweitert werden.
- Informationen über mögliche Funktionalitäten könnt ihr über die Methoden Dokumentation herausfinden.
    - z. B. ihr schreibt `agent.` und drückt dann (Strg + Leertaste).

## Anlegen eines neuen Teams

- Sofern ihr zuvor eine neue Strategieklasse angelegt habt, bitte zunächst PlanetSudo beenden und anschließen neu starten. 
- Anschließend in PlanetSudo unter `Einstellungen` auf `Team erstellen` klicken.
- Wichtig ist hierbei, dass eine gültige Strategie angegeben wird. Hier erfolgt die Eingabe des Namens der zuvor erstellten Strategieklasse. Der Dateityp (".kt") wird hierbei nicht benötigt.
![FOTO]()

## Mit dem Server synchronisieren

- Über den Synchronisations-Button kann die Synchronisation erfolgen, sofern der Server erreichbar ist.
- Ist das Statusfeld Blau, ist der Transfer erfolgreich gewesen.
![FOTO]()

## Sonstiges

- Viel Spaß beim KI Entwickeln und Spielen :)
- Sollten euch gravierende Fehler auffallen, anderweitige Probleme auftreten oder ihr eine coole Erweiterungsidee habt:
    - Erstellt ein Issue auf [Github](https://github.com/openbase/planetsudo/issues/new)
    - Oder kontaktiert uns per [Mail](mailto:support@openbase.org)


Copyright (C) 2009 - 2024 openbase.org
