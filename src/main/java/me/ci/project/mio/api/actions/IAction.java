package me.ci.project.mio.api.actions;

/**
 * Contains an action that the agent should preform.
 */
public interface IAction
{
    /**
     * Gets whether or not this action is currently being executed. A action is only
     * considered to be running if it has been started and has not yet finished.
     *
     * @return True if this action is running, false otherwise.
     */
    boolean isRunning();

    /**
     * Gets whether or not this action can be canceled.
     *
     * @return True if this action can be canceled, false otherwise.
     */
    boolean isCancelable();

    /**
     * Causes this action to start being executed. If this action is already
     * running, this method does nothing.
     */
    void start();

    /**
     * Causes this action to cancel it's current execution.
     *
     * @throws IllegalStateException
     *             If this action is not running or if it is not cancelable.
     */
    void cancel();
}
