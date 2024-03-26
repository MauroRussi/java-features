package co.com.mrsoft.test.java15;

/**
 * Examples of Sealed classes feature.
 */

// Sealed root interface which only allows inheritance for those classes / interfaces in the "permits" list.
sealed interface Command permits LoginCommand, LogoutCommand, PluginCommand{}

// Class that implements Command and has to be marked as "final" if it doesn't allow inheritances.
final class LoginCommand implements Command{}

// Class that implements Command and has to be marked as "sealed" if it allows inheritances.
sealed class LogoutCommand implements Command permits LogoutAndDeleteCachedCommand {}

// Class that extends from a "sealed" class that implements another "sealed" interface.
final class LogoutAndDeleteCachedCommand extends LogoutCommand {}

// "Non-sealed" class that implements a "sealed" interface.
non-sealed class PluginCommand implements Command {}