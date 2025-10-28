package commands;

import dwarvens.DwarvenMineWorker;

public class WakeUpCommand implements DwarvenCommand {

  private DwarvenMineWorker dwarvenMineWorker;

  public WakeUpCommand(DwarvenMineWorker dwarvenMineWorker) {
    this.dwarvenMineWorker = dwarvenMineWorker;
  }

  @Override
  public void execute() {
    dwarvenMineWorker.wakeUp();
  }
}
