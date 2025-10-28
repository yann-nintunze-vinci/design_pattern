package commands;

import dwarvens.DwarvenMineWorker;

public class GoToSleepCommand implements DwarvenCommand {

  private DwarvenMineWorker dwarvenMineWorker;

  public GoToSleepCommand(DwarvenMineWorker dwarvenMineWorker) {
    this.dwarvenMineWorker = dwarvenMineWorker;
  }

  @Override
  public void execute() {
    dwarvenMineWorker.goToSleep();
  }
}
