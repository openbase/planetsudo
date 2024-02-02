package org.openbase.planetsudo.game.strategy /*-
 * #%L
 * PlanetSudo Artificial Intelligence
 * %%
 * Copyright (C) 2009 - 2024 openbase.org
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import org.openbase.planetsudo.game.SwatTeam.*
import org.openbase.planetsudo.level.levelobjects.AgentInterface

/**
 * Diese Klasse ist eine Vorlage für eine KI im Spiel: PlanetSudo
 * ============================================================
 * @author [Divine Threepwood](mailto:divine@openbase.org)
 */
class DefaultStrategy(agent: AgentInterface) : AbstractStrategy(agent) {

    /**
     * Über diese Methode kannst du angeben wie viele Agenten dein Team besitzen soll.
     * ===============================================================================
     * Bedenke, dass dein Mutterschiff die Aktionspunkte (APs) gleichmäßig auf deine Agenten verteilt.
     * Somit ist ein Team mit vielen Agenten sehr effizient beim Ressourcen sammeln und beim Planeten erforschen,
     * allerdings stehen einem einzelnen Agenten weniger Aktionspunkte für den Kampf
     * mit feindlichen Agenten zur Verfügung wodurch kleine Teams im Kampf stärker sind.
     *
     * @return Anzahl der Agenten
     */
    override fun loadAgentCount() = 10

    /**
     * Hier kannst du die Regeln für deine Agenten definieren.
     *
     * Prioritäten festlegen
     * =====================
     * Die Reihenfolge der Registrierung bestimmt die Priorität der Regeln.
     * So besitzt die erste Regel die geringste und die zuletzt registrierte Regel die höchste Priorität.
     *
     *  geringere Priorität
     *           ⇧
     *         Regel
     *           ⇩
     *   höhere Priorität
     *
     * Swat Teams
     * ==========
     * Swat Teams können verwendet werden, um Regeln nur für bestimmte Agenten zu beschreiben.
     * Swat Teams müssen zuvor über die "loadSwatTeams" Methode erstellt werden.
     * Anschließend kann das "all" der Regeldefinition durch "swat X" ersetzt werden.
     * Eine Regel kann mehreren, durch "and" verbundene Swat Teams zugeteilt werden.
     * Zudem können Swat Teams mit dem "NOT_" prefix von einer Regel ausgeschlossen werden.
     *
     * z.B. "Just Go" swat ALPHA inCase { true } then { agent.go()}
     * oder "Just Go" swat ALPHA and FOXTROT inCase { true } then { agent.go()}
     */
    override fun loadRules() {
        //-------------------------------------------->
        "Just Go" all inCase { true } then { agent.go()}
        //-------------------------------------------->
        // Füge hier die Regel mit der nächst höheren Priorität ein. <---- !!! HIER STARTEN !!!
        //-------------------------------------------->
    }

    /**
     * Hier kannst du Swat Teams aus mehreren Agenten bilden.
     * =====================================================
     * Die Agenten werden hierbei über ihre Nummern hinzugefügt. Sind beispielsweise 4 Agenten in der Strategie angegeben,
     * so sind diese über die Nummern 0 - 3 referenzierbar wobei Agent 0 immer für den Commander steht.
     * Bitte beachte somit, dass die Agentennummer nicht größer als Agentenanzahl - 1 sein darf.
     * Ein Agent darf durchaus mehrere Swat Teams zugeteilt werden.
     *
     * ACHTUNG: Die default Swats ALL und COMMANDER können anhand dieser Methode nicht modifiziert werden!
     */
    override fun loadSwatTeams() {
        // createSwat(ALPHA, 1, 6, 8)
        // createSwat(BRAVO, 2, 6, 7)
        // createSwat(FOXTROT, 2, 6, 7)
        // ...
    }
}
