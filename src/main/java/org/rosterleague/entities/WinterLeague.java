/*
 * Copyright (c), Eclipse Foundation, Inc. and its licensors.
 *
 * All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v1.0, which is available at
 * https://www.eclipse.org/org/documents/edl-v10.php
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */
package org.rosterleague.entities;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Entity;
import org.rosterleague.common.IncorrectSportException;
import org.rosterleague.common.LeagueType;

@Entity
public class WinterLeague extends League implements Serializable {
    @Serial
    private static final long serialVersionUID = 8942582153559426625L;
    
    /** Creates a new instance of WinterLeague */
    public WinterLeague() {
    }

    public WinterLeague(String id, String name, String sport, LeagueType type) throws
            IncorrectSportException {
        this.id = id;
        this.name = name;
        this.type = type;
        if (sport.equalsIgnoreCase("hockey") ||
                sport.equalsIgnoreCase("skiing") ||
                sport.equalsIgnoreCase("snowboarding")) {
            this.sport = sport;
        } else {
            throw new IncorrectSportException("Sport is not a winter sport.");
        }
    }
    
}
