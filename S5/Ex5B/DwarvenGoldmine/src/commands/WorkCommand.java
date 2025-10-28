package commands;

import dwarvens.DwarvenMineWorker;

public class WorkCommand implements DwarvenCommand {

  private DwarvenMineWorker dwarvenMineWorker;

  public WorkCommand(DwarvenMineWorker dwarvenMineWorker) {
    this.dwarvenMineWorker = dwarvenMineWorker;
  }

  @Override
  public void execute() {
    dwarvenMineWorker.work();
  }
}
