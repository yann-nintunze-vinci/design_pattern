package commands;

import dwarvens.DwarvenMineWorker;

public class GoHomeCommand implements DwarvenCommand {

  private DwarvenMineWorker dwarvenMineWorker;

  public GoHomeCommand(DwarvenMineWorker dwarvenMineWorker) {
    this.dwarvenMineWorker = dwarvenMineWorker;
  }

  @Override
  public void execute() {
    dwarvenMineWorker.goHome();
  }
}
