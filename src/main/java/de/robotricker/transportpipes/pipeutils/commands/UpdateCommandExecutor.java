package de.robotricker.transportpipes.pipeutils.commands;

import org.bukkit.command.CommandSender;

import de.robotricker.transportpipes.TransportPipes;

public class UpdateCommandExecutor implements PipesCommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, String[] args) {

		if (!cs.hasPermission(TransportPipes.instance.generalConf.getPermissionUpdate())) {
			return false;
		}

		TransportPipes.instance.getUpdateManager().updatePlugin(cs);

		return true;
	}

}
