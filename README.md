# Planet Sudo

Zwei unterschiedliche Roboterteams erobern einen für sie unbekannten Planeten. Ihre Mutterschiffe sind bereits gelandet und sie erkundschaften die Umgebung und sammeln in Konkurrenz über den Planeten zufällig verstreute Ressourcen ein, die sie anschließend zum Mutterschiff bringen.
Ziel des Spiels ist es mit dem im Mutterschiff vorhandenen Treibstoff so viele Ressourcen wie möglich einzusammeln und zum Mutterschiff zu befördern.
Die Roboter selber verbrauchen den Treibstoff und müssen diesen Regelmäßig beim Mutterschiff wieder auftanken. Andererseits bleiben sie auf dem Spielfeld ohne Funktionalität zurück. Zum einsammeln der Ressourcen wird eine gewisse Zeit benötigt, zudem sind Roboter die eine Ressource zum Mutterschiff transportieren, langsamer als normal.
Das Spiel endet, wenn der Treibstoff beider Teams verbraucht ist.

## Installation via IntelliJ IDE

### Intellij installieren

- IntelliJ ***Community Edition*** (nicht die Ultimate Edition!) - *um zur Community Edition zu kommen muss man herunterscrollen* -  [herunterladen](https://www.jetbrains.com/idea/download/) und installieren.</br></br>
![Downloadseite der Ultimate Edition](.readme/0_NotUltimate.png)</br></br>
![Downloadseite der Community Edition](.readme/1_DownlaodIDEA.png)</br></br>
![Installationsübersicht der IntelliJ IDEA](.readme/2_IstallIDEA.png)</br></br>

### Git installieren

- In IntelliJ auf `Get from VSC` klicken, dann auf `Repository URL`.
- Version control auf `Git` einstellen.
- Sollte die Fehlermeldung `Git is not installed` auftauchen auf `Download and Install` klicken.</br></br>
![Übersicht des Get from Version Control Fensters](.readme/3_InstallGIT.png)</br></br>
    
### Planet Sudo installieren

- In IntelliJ im selben Fenster die URL `https://github.com/openbase/planetsudo` einfügen und auf `Clone` klicken.
- Sollte die Fehlermeldung `JDK "17" is missing` auftreten auf `Configure...` --> `Download JDK` gehen und dann `Eclipse Temurin` auswählen und installieren.</br></br>
![Das Download JDK Fenster](.readme/4_ConfigureJDK.png)</br></br>

- Die Datei `src/main/kotlin/org.openbase.planetsudo/main/PlanetSudo.kt` öffnen (Doppelklick).
- Jetzt kann PlanetSudo gestartet werden. Dazu einen Rechtsklick auf `Planet Sudo` und dann auf `Run 'Planet Sudo'` </br></br>
![Wie man Planet Sudo Startet](.readme/5_RunPlanetSudo.png)</br></br>

- Wenn du dich mit einem PlanetSudo Server verbinden willst, kannst du diesen in IntelliJ wie folgt einstellen (Vorher muss PlanetSudo wie oben beschrieben gestartet werden): Dazu oben rechts auf `PlanetSudo` klicken dort auf `Edit Configuration` und dann unter `Programm arguments: --server YOUR_SERVER_NAME` eingeben. Dann das ganze mit `Apply` bestätigen.</br></br>
  ![Öffnen der Configurations](.readme/6_Configurations.png)</br></br>
![Einstellen des Servers](.readme/7_ServerImplement.png)</br></br>

- Als Nächstes muss die Dokumentation heruntergeladen werden. Dazu in IntelliJ rechts an der Seite das Gradle-Menü öffnen und auf `Download Sources` klicken.</br></br>
![Herunterladen der Dokumentation](.readme/8_DownloadSources.png)</br></br>

## Anlegen einer neuen KI

- In IntelliJ zur Klasse "DefaultStrategy.kt" navigieren (`src/main/kotlin/org/openbase/planetsudo/game/strategy`) und hier die `DefaultStrategy.kt` mit einem Rechtsklick auf die Klasse (`Refactor` --> `Copy`) kopieren.</br></br>
![Wie man eine Klasse umbenennt](.readme/9_Refactor.png)</br></br>
- Die neue Strategieklasse kann nun erweitert werden.
- Informationen über mögliche Funktionalitäten könnt ihr über die Methoden Dokumentation herausfinden.
- Dazu in der Strategie `agent.` schreiben und dann Strg + Leertaste drücken.
- Nun werden die möglichen Funktionen aufgeführt. Um eine detaillierte Beschreibung über die Funktionen zu erhalten, geht auf die drei Punkte und dort auf `Code Completion Settings`.</br></br>
![Öffnen der Code Completion Settings](.readme/10_CompletionSettings.png)</br></br>
- Dort aktiviert man `Show the documentation popup in X ms` und stellt die Zeit nach Belieben ein (z.B. 10 ms).</br></br>
![Ändern der Einstellungen](.readme/11_DocumentationPopup.png)

## Anlegen eines neuen Teams

- Sofern ihr zuvor eine neue Strategieklasse angelegt habt, bitte zunächst PlanetSudo beenden und anschließen neu starten. 
- Anschließend in PlanetSudo unter `Einstellungen` auf `Team erstellen` klicken.
- Wichtig ist hierbei, dass eine gültige Strategie angegeben wird. Hier erfolgt die Eingabe des Namens der zuvor erstellten Strategieklasse. Der Dateityp (".kt") wird hierbei nicht benötigt.</br></br>
![Wie man ein Team erstellt](.readme/12_TeamErstellen.png)</br></br>
![Wie man sein Team benennt](.readme/13_TeamBennenung.png)</br></br>

## Mit dem Server synchronisieren

- In Planet Sudo kann über den Synchronisations-Button die Synchronisation erfolgen.
- Ist das Statusfeld Blau, ist der Transfer erfolgreich gewesen.

## Sonstiges

- Viel Spaß beim KI Entwickeln und Spielen :)
- Sollten euch gravierende Fehler auffallen, anderweitige Probleme auftreten oder ihr eine coole Erweiterungsidee habt:
    - Erstellt ein Issue auf [Github](https://github.com/openbase/planetsudo/issues/new)
    - Oder kontaktiert uns per [Mail](mailto:support@openbase.org)


Copyright (C) 2009 - 2024 [openbase.org](http://www.openbase.org)
