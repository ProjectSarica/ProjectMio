package me.ci.project.mio.api.pathfinding;

/**
 * Contains the current navigation state of an agent.
 *
 * @author thedudefromci
 */
public interface IPathfinder
{
    /**
     * Gets the current pathfinding goal for this pathfinder implementation.
     *
     * @returns The pathfinding goal, or null if the bot is not currently navigating
     *          along the path.
     */
    IPathfindingGoal getGoal();

    /**
     * Gets whether or not the agent is currently traveling along a path.
     *
     * @return True if the agent is in the middle of traveling along a path, false
     *         otherwise.
     */
    boolean isNavigating();

    /**
     * Assigns and executes a new pathfinding goal for the attached agent.
     *
     * @param goal
     *            - The new pathfinding goal, or null to clear the current goal.
     */
    void setGoal(IPathfindingGoal goal);
}
