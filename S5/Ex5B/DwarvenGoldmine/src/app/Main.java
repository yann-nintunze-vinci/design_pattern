package app;

import commands.GoHomeCommand;
import commands.GoToMineCommand;
import commands.GoToSleepCommand;
import commands.WakeUpCommand;
import commands.WorkCommand;
import dwarvens.DwarvenCartOperator;
import dwarvens.DwarvenMineWorker;

public class Main {
  public static void main(String[] args) {
    DwarvenMineWorker dwarvenMineWorker = new DwarvenCartOperator();
    DwarvenGoldmine jjGoldmine = new DwarvenGoldmine();
    jjGoldmine.addCommand(new WakeUpCommand(dwarvenMineWorker),
        new GoToMineCommand(dwarvenMineWorker),
        new WorkCommand(dwarvenMineWorker),
        new GoHomeCommand(dwarvenMineWorker),
        new GoToSleepCommand(dwarvenMineWorker));
    jjGoldmine.executeCommands();
  }
}
