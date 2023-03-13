package HW3.drugs.impl.components;

import HW3.drugs.Component;

public class Penicillin extends Component {
    public Penicillin(String name, String weight, int power) {
        super(name, weight, power);
    }

    public Penicillin(String weight, int power) {
        this("Пенициллин", weight, power);
    }
}
