package me.ci.project.mio.api;

import org.joml.Vector3f;

/**
 * A bridge for interacting with the Minecraft agent entity within the game.
 * 
 * @author thedudefromci
 */
public interface IMinecraftAgent
{
	/**
	 * Gets the current position of the agent.
	 * 
	 * @return The current world position.
	 */
	Vector3f getPosition();

	/**
	 * Gets the pathfinder service for this agent.
	 * 
	 * @return The pathfinder.
	 */
	IPathfinder getPathfinder();

}
