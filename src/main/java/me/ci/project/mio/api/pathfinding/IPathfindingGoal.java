package me.ci.project.mio.api.pathfinding;

/**
 * Contains information about a pathfinder's current goals and objectives. The
 * implementing class is assumed to be immutable.
 *
 * @author thedudefromci
 */
public interface IPathfindingGoal
{
    /**
     * Computes a path from the agent's current position to the goal position. This
     * method may be called multiple times to recompute the path periodically during
     * navigation such as if the target position moves or the path is blocked.
     *
     * @return The path.
     */
    IPath computePath();

    /**
     * Called each tick during navigation to check if the goal position has changed
     * and a new path needs to be computed. Note that a path may still be recomputed
     * even if this method returns false if other factors cause the path to become
     * obsolete.
     *
     * @return True if the path needs to be recomputed, false otherwise.
     */
    boolean needsRecomputing();
}
