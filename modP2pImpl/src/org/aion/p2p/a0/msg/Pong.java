/*******************************************************************************
 * Copyright (c) 2017-2018 Aion foundation.
 *
 *     This file is part of the aion network project.
 *
 *     The aion network project is free software: you can redistribute it
 *     and/or modify it under the terms of the GNU General Public License
 *     as published by the Free Software Foundation, either version 3 of
 *     the License, or any later version.
 *
 *     The aion network project is distributed in the hope that it will
 *     be useful, but WITHOUT ANY WARRANTY; without even the implied
 *     warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *     See the GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with the aion network project source files.
 *     If not, see <https://www.gnu.org/licenses/>.
 *
 * Contributors to the aion source files in decreasing order of code volume:
 * 
 *     Aion foundation.
 *     
 ******************************************************************************/

package org.aion.p2p.a0.msg;

import org.aion.p2p.CTRL;
import org.aion.p2p.IMsg;

/**
 * 
 * @author chris
 *
 */
public final class Pong implements IMsg {
    
    private final static int ctrl = CTRL.NET0.getValue();
    
    private final static int act = ACT.PONG.getValue();
    
    @Override
    public byte[] encode() {
        return null;
    }

    @Override
    public int getCtrl() {
        return ctrl;
    }

    @Override
    public int getAct() {
        return act;
    }
}