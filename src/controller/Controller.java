package controller;

import java.util.Date;
import model.Log;
import model.Worker;
import model.WorkerList;
import util.FormatString;
import util.InputUtils;

/**
 *
 * @author nhs
 */
public class Controller {

    public static void main(String[] args) {
        WorkerList wkl = new WorkerList();
        int choice;
        while (true) {
            choice = Menu.chooseInputOption();
            switch (choice) {
                case 1 -> {
                    addWorker(wkl);
                }
                case 2 -> {
                    decrease(wkl);
                }
                case 3 -> {
                    increase(wkl);
                }
                case 4 -> {
                    displayAdjustedList(wkl);
                }

                case 5 ->
                    System.exit(0);
            }
        }
    }

    public static Worker inputWorker() {
        System.out.println("Enter id: ");
        String id = InputUtils.inputId();
        System.out.println("Enter name: ");
        String name = InputUtils.inputName();
        name = FormatString.formatName(name);
        System.out.println("Enter age: ");
        int age = InputUtils.inputInt();
        System.out.println("Enter salary: ");
        float salary = InputUtils.inputFloat();
        System.out.println("Enter location: ");
        String location = InputUtils.inputString();
        Log log = new Log();
        Worker wk = new Worker(id, name, age, salary, location, log);
        return wk;
    }

    public static void addWorker(WorkerList wkl) {
        if (wkl.addList(inputWorker())) {
            System.out.println("Added successfully.");
        } else {
            System.out.println("Failed to add.");
        }
    }

    public static void decrease(WorkerList wkl) {
        boolean up = false;
        System.out.println("Enter id worker to adjust:");
        String id = InputUtils.inputString();
        Worker workerTD = wkl.searchList(id);
        if (workerTD != null) {
            int index = wkl.getIndex(id);
            System.out.println("Enter amount of money to cut: ");
            float newSalary = InputUtils.inputDecreaseSalary(workerTD.getSalary());
            Date currentDate = new Date();
            workerTD.setSalary(newSalary);
            Log nlog = new Log(currentDate, up);
            Worker nwk = new Worker(workerTD.getId(), workerTD.getName(), workerTD.getAge(), newSalary, workerTD.getWorkLocation(), nlog);
            wkl.getWorkerList().set(index, nwk);
        } else {
            System.err.println("ID not found!");
        }

    }

    public static void increase(WorkerList wkl) {
        boolean up = true;
        System.out.println("Enter id worker to adjust:");
        String id = InputUtils.inputString();
        Worker workerTD = wkl.searchList(id);
        if (workerTD != null) {
            int index = wkl.getIndex(id);
            System.out.println("Enter amount of money to raise: ");
            float newSalary = InputUtils.inputIncreaseSalary(workerTD.getSalary());
            Date currentDate = new Date();
            Log log = new Log(currentDate, up);
            Worker nwk = new Worker(workerTD.getId(), workerTD.getName(), workerTD.getAge(), newSalary, workerTD.getWorkLocation(), log);
            wkl.getWorkerList().set(index, nwk);

        } else {
            System.out.println("ID not found!");
        }

    }

    public static void displayAdjustedList(WorkerList wkl) {
        wkl.displayInf();
    }
}
