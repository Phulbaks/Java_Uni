package Lab4_var14.task_I;

abstract class Instrument {
    private String name;

    // Конструктор
    public Instrument(String name) {
        this.name = name;
    }

    // Геттер
    public String getName() {
        return name;
    }
    // Сеттер
    public void setName(String name) {
        this.name = name;
    }

    // Метод play()
    public void play() {
            System.out.println("Играю на инструменте");
    }
}

class Guitar extends Instrument {
    public Guitar(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(getName() + " - Брынь Трынь");
    }
}

class Piano extends Instrument {
    public Piano(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(getName() + " - Плин Плин Плон");
    }
}

class Drums extends Instrument {
    public Drums(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(getName() + " - Ба дум тсс");
    }
}

class Orchestra {
    private Instrument[] instruments;

    // Конструкторы

    // по умолчанию
    public Orchestra() {
        this.instruments = new Instrument[0];
    }
    // с объявлением
    public Orchestra(Instrument[] instruments) {
        this.instruments = instruments;
    }

    // Геттер
    public Instrument[] getInstruments() {
        return instruments;
    }
    // сеттер
    public void setInstruments(Instrument[] instruments) {
        this.instruments = instruments;
    }

    // Добавление инструмента
    public void addInstrument(Instrument instrument) {
        instruments = java.util.Arrays.copyOf(instruments, instruments.length + 1);
        instruments[instruments.length - 1] = instrument;
    }

    // Удаление последнего инструмента
    public void popInstrument() {
        if (instruments.length > 0) {
            instruments = java.util.Arrays.copyOf(instruments, instruments.length - 1);
        }
    }

    // Подсчёт инструментов
    public void countInstruments() {
        int guitars = 0, pianos = 0, drums = 0;

        for (Instrument instrument : instruments) {
            if (instrument instanceof Guitar) {
                guitars++;
            }
            else if (instrument instanceof Piano) {
                pianos++;
            }
            else if (instrument instanceof Drums) {
                drums++;
            }
        }

        System.out.println("Гитар: " + guitars);
        System.out.println("Пианино: " + pianos);
        System.out.println("Барабанов: " + drums);
    }

    // метод play() для всех инструментов
    public void playAll() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    // вывод результатов
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Гитара");
        Piano piano = new Piano("Пианино");
        Drums drums = new Drums("Барабаны");

        Orchestra orchestra = new Orchestra();
        orchestra.addInstrument(guitar);
        orchestra.addInstrument(piano);
        orchestra.addInstrument(drums);

        System.out.println("Инструменты в оркестре:");
        for (Instrument instrument : orchestra.getInstruments()) {
            System.out.println(instrument.getName());
        }

        System.out.println("\nЗвуки инструментов:");
        orchestra.playAll();

        System.out.println("\nПодсчёт инструментов:");
        orchestra.countInstruments();

        orchestra.popInstrument();
        System.out.println("\nИнструменты после удаления:");
        for (Instrument instrument : orchestra.getInstruments()) {
            System.out.println(instrument.getName());
        }
        orchestra.countInstruments();
    }
}