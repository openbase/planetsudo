package org.openbase.planetsudo.jp;

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

import org.openbase.jps.preset.AbstractJPString;


/**
 *
 * @author Divine Threepwood
 */
public class JPServerHostname extends AbstractJPString {

	public final static String[] COMMAND_IDENTIFIERS = {"--server"};
	public final static String[] ARGUMENT_IDENTIFIER = {"HOSTNAME"};

	public JPServerHostname() {
		super(COMMAND_IDENTIFIERS);
	}
    
    @Override
    protected String[] generateArgumentIdentifiers() {
        return ARGUMENT_IDENTIFIER;
    }
	
	@Override
	protected String getPropertyDefaultValue() {
//		return "cpwe";
		return "bone.no-ip.biz";
	}

	@Override
	public String getDescription() {
		return "Setup the default server.";
	}
}
