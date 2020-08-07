package Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Command> imediatos = new ArrayList<>();

    private List<Command> todos = new ArrayList<>();

    public void add(Command comm) {
        imediatos.add(comm);
    }

    public void execute() {

        for (Command comm : imediatos) {
            comm.execute();
            todos.add(comm);
        }

        imediatos.clear();

    }
}
