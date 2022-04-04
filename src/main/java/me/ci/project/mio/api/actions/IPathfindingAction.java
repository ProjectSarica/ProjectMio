package me.ci.project.mio.api.actions;

import me.ci.project.mio.api.pathfinding.IPathfindingGoal;

/**
 * Contains an action that interacts with the agent's pathfinding handler in
 * order to preform a movement action.
 */
public interface IPathfindingAction extends IAction, IPathfindingGoal
{

}
