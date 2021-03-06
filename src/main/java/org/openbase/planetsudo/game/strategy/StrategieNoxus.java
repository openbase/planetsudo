/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.openbase.planetsudo.game.strategy;

/*-
 * #%L
 * PlanetSudo GameEngine
 * %%
 * Copyright (C) 2009 - 2020 openbase.org
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

import static org.openbase.planetsudo.game.SwatTeam.*;
import org.openbase.planetsudo.level.levelobjects.AgentInterface;
import org.openbase.planetsudo.level.levelobjects.Resource;

/**
 *
 * @author <a href="mailto:divine@openbase.org">Divine Threepwood</a>
 */
public class StrategieNoxus extends AbstractStrategy {

	public StrategieNoxus() {
	}
	public StrategieNoxus(AgentInterface a) {
		super(a);
	}

	/**
	 * Hier wird angegeben wie viele Agenten dem Team zur Verfügung stehen sollen.
	 * @return Anzahl der Agenten
	 */
	@Override
	protected int loadAgentCount() {
		return 2;
	}

    /**
     * Hier kannst du SwatTeams aus mehreren Agenten bilden.
     * =====================================================
     * Die Agenten werden hierbei über ihre IDs hinzugefügt. Sind beispielsweise 4 Agenten in der Strategie angegeben,
     * so sind diese über die IDs 0 - 3 referenzierbar wobei Agent 0 immer für den Kommander steht.
     * Bitte beachte somit, dass die Agenten ID nicht größer als N - 1 sein kann sofern N für die maximale Anzahl von Agenten steht.
     *
     * Die default Gruppen ALL und COMMANDER können anhand dieser Methode nicht modifiziert werden!
     */
    @Override
    protected void loadSwatTeams() {
         createSwat(ALPHA, 1);
    }
    
	@Override
	protected void loadRules() {
		//-------------------------------------------->
		createRule(new Rule(1000, "Kollision!", ALL) {
			@ Override
			protected boolean constraint() {
				return agent.isCollisionDetected();
			}
			@ Override
			protected void action() {
				agent.turnRandom();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(870, "Warte...") {
			@ Override
			protected boolean constraint() {
				return agent.getFuelInPercent() <= 6 && agent.isAtMothership() && !mothership.hasFuel() && !agent.isUnderAttack() && !mothership.isDamaged() && !agent.isCarringResource();
			}
			@ Override
			protected void action() {
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(860, "Auftanken...") {
			@ Override
			protected boolean constraint() {
				return agent.getFuelInPercent() <= 7 && agent.isAtMothership() && mothership.hasFuel();
			}
			@ Override
			protected void action() {
				agent.orderFuel(100);
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(850, "Wenig Energie...") {
			@ Override
			protected boolean constraint() {
				return agent.getFuelInPercent() <= 7 && agent.hasFuel() && !agent.isUnderAttack();
			}
			@ Override
			protected void action() {
				agent.goToMothership();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(720, "Repariere Mutterschiff...") {
			@ Override
			protected boolean constraint() {
				return mothership.isDamaged() && agent.isAtMothership() && !agent.isUnderAttack();
			}
			@ Override
			protected void action() {
				agent.repairMothership();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(800, "Mutterschiff helfen...") {
			@ Override
			protected boolean constraint() {
				return mothership.isDamaged() && !agent.isAtMothership();
			}
			@ Override
			protected void action() {
				agent.goToMothership();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(750, "Bekämpfe Agent...") {
			@ Override
			protected boolean constraint() {
				return agent.seeAdversaryAgent();
			}
			@ Override
			protected void action() {
				agent.fightWithAdversaryAgent();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(740, "Suche Feind...") {
			@ Override
			protected boolean constraint() {
				return agent.isUnderAttack();
			}
			@ Override
			protected void action() {
				agent.turnRandom();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(610, "Mutterschiff verminen...") {
			@ Override
			protected boolean constraint() {
				return agent.seeAdversaryMothership() && agent.hasMine();
			}
			@ Override
			protected void action() {
				agent.deployMine();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(600, "Bekämpfe Mutterschiff...") {
			@ Override
			protected boolean constraint() {
				return agent.seeAdversaryMothership();
			}
			@ Override
			protected void action() {
				agent.deployMarker();
				agent.fightWithAdversaryMothership();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(350, "Notkanal schließen.") {
			@ Override
			protected boolean constraint() {
				return agent.isSupportOrdered() && agent.getFuelInPercent() >=7;
			}
			@ Override
			protected void action() {
				agent.cancelSupport();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(340, "Gestrandet...") {
			@ Override
			protected boolean constraint() {
				return !agent.hasFuel() && !agent.isAtMothership();
			}
			@ Override
			protected void action() {
				agent.orderSupport();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(310, "Energie Spenden...") {
			@ Override
			protected boolean constraint() {
				return mothership.needSomeoneSupport() && agent.seeLostTeamAgent();
			}
			@ Override
			protected void action() {
				agent.spendTeamAgentFuel(7);
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(300, "Agenten Helfen...") {
			@ Override
			protected boolean constraint() {
				return mothership.needSomeoneSupport();
			}
			@ Override
			protected void action() {
				agent.goToSupportAgent();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(250, "Resource abliefern!") {
			@ Override
			protected boolean constraint() {
				return agent.isAtMothership() && agent.isCarringResource();
			}
			@ Override
			protected void action() {
				agent.deliverResourceToMothership();
				agent.turnAround();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(230, "Berge Resource...") {
			@ Override
			protected boolean constraint() {
				return agent.isCarringResource();
			}
			@ Override
			protected void action() {
				agent.goToMothership();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(220, "Mine!") {
			@ Override
			protected boolean constraint() {
				return (agent.isTouchingResource(Resource.ResourceType.Mine) || agent.isTouchingResource(Resource.ResourceType.ExtremPoint));
			}
			@ Override
			protected void action() {
				agent.go();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(210, "Resource aufheben!") {
			@ Override
			protected boolean constraint() {
				return agent.isTouchingResource() && !agent.isTouchingResource(Resource.ResourceType.Mine) && !agent.isTouchingResource(Resource.ResourceType.ExtremPoint);
			}
			@ Override
			protected void action() {
				agent.pickupResource();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(200, "Resource gesichtet...") {
			@ Override
			protected boolean constraint() {
				return agent.seeResource();
			}
			@ Override
			protected void action() {
				agent.goToResource();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(30, "Zwischentanken...") {
			@ Override
			protected boolean constraint() {
				return agent.isAtMothership() && mothership.hasFuel() && !mothership.isBurning() && !mothership.isDamaged() && !agent.isUnderAttack() && agent.getFuelInPercent()<=95;
			}
			@ Override
			protected void action() {
				agent.orderFuel(100);
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(20, "Marker entfernen.") {
			@ Override
			protected boolean constraint() {
				return agent.seeMarker();
			}
			@ Override
			protected void action() {
				mothership.clearMarker();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(10, "Bewege zu Marker...") {
			@ Override
			protected boolean constraint() {
				return mothership.isMarkerDeployed();
			}
			@ Override
			protected void action() {
				agent.goToMarker();
			}
		});
		//-------------------------------------------->
		//-------------------------------------------->
		createRule(new Rule(0, "Bewegung...") {
			@ Override
			protected boolean constraint() {
				return true;
			}
			@ Override
			protected void action() {
				agent.go();
			}
		});
		//-------------------------------------------->
	}
}
