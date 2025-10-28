package app;

import commands.DwarvenCommand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DwarvenGoldmine {

  private final List<DwarvenCommand> workers;

  public DwarvenGoldmine() {
    workers = new ArrayList<>();
  }

  public void addCommand(DwarvenCommand... dwarvenCommands) {
    this.workers.addAll(Arrays.asList(dwarvenCommands));
  }

  public void executeCommands() {
    for (DwarvenCommand work : workers) {
      work.execute();
    }
  }
}
