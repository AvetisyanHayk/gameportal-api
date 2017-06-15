package be.howest.gameportal;

import be.howest.game.mastermind.MasterMind;
import be.howest.game.mastermind.MasterMindManager;
import be.howest.game.mastermind.Template;
import be.howest.game.mastermind.services.TemplateService;

public class Main {

	public static void main(String[] args) {
		MasterMindManager manager = new MasterMindManager();
		TemplateService templateService = new TemplateService();
		Template template = templateService.read(0);
		MasterMind masterMind = manager.createMasterMind(template);
		System.out.println("MasterMind created: " + !masterMind.isGameOver());
	}

}
