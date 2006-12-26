//----------------------------------------------------------------------------
// $Id$
//----------------------------------------------------------------------------

package net.sf.gogui.game;

import net.sf.gogui.go.GoColor;

/** Const functions of game.Clock.
    @see Clock
*/
public interface ConstClock
{
    int getMovesLeft(GoColor color);

    long getTimeLeft(GoColor color);

    String getTimeString(GoColor color);

    boolean isInitialized();

    boolean isInByoyomi(GoColor color);

    boolean isRunning();

    boolean lostOnTime(GoColor color);
}
