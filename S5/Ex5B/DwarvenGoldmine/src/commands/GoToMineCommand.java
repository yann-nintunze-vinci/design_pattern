package commands;

import dwarvens.DwarvenMineWorker;

public class GoToMineCommand implements DwarvenCommand {

  private DwarvenMineWorker dwarvenMineWorker;

  public GoToMineCommand(DwarvenMineWorker dwarvenMineWorker) {
    this.dwarvenMineWorker = dwarvenMineWorker;
  }

  @Override
  public void execute() {
    dwarvenMineWorker.goToMine();
  }
}
