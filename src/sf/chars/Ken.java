package sf.chars;

import sf.*;

public class Ken extends sf.Character {

	public Ken()
	{
		super("characters/ken");
		name = "Ken";
		fSpeed = 48;
		bSpeed = 32;
		fASpeed = 32;
		bASpeed = 48;
		jumpHeight = 90;
		//selectIcon

		jabRange = 25;
		strongRange = 31;
		fierceRange = 41;
		shortRange = 0;
		forwardRange = 0;
		roundhouseRange = 56;
	}

	@Override
	protected void setupCommands() {
		Commands = new Command[0];

	}

	@Override
	protected void setupWinAnims() {

	}
}
