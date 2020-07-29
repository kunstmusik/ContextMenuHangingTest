# JFXPanel + ContextMenu + macOS = Deadlock

This is a minimal working example demonstrating a deadlock issue on macOS when using JFXPanel with ContextMenu. 

## Steps to Reproduce

* Launch application
* Hit Button to show ContextMenu
* Switch applications, then switch back
* Repeatedly hit Button to show ContextMenu

## System 

* macOS 10.14.6
* AdoptOpenJDK 11.0.7+10 
* JavaFX 14.0.2.1 
