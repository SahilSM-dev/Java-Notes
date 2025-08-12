package JavaEnumClasses;

// Normal enum
enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

// Enum to demonstrate function
enum Level{
    LOW,
    MEDIUM,
    HIGH
}

// Enum with custom values and constructor fields
enum Status{
    NEW("Not stared",101),
    IN_PROGRESS("Ongoing",102),
    DONE("Completed",103);

    private final String description;
    private final int code;

    Status(String description,int code){
        this.description=description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public int getCode(){
        return code;
    }
}

// Enum with override methods
enum Operation {
    ADD{
        @Override
        public int apply(int a,int b){
            return a + b;
        }
    },
    SUBTRACT{
        @Override
        public int apply(int a, int b){
            return a - b;
        }
    };

    public abstract int apply(int a, int b);
}

// Enum with interface implementation
interface Printable{
    void print();
}
enum Color implements Printable{
    RED,
    GREEN,
    BLUE;

    @Override
    public void print(){
        System.out.println("Selected color is " +this.name());
    }
}

public class EnumClassesDemo {
    public static void main(String[] args) {
        // Sample Enum
        Day today = Day.FRIDAY;
        System.out.println("Today is: "+ today);

        for(Day day : Day.values()){
            System.out.println(day);
        }

        // Enum Functions
        Level l = Level.HIGH;
        // name()
        System.out.println(l.name());
        // ordinal()
        System.out.println(l.ordinal());
        System.out.println(Level.valueOf("MEDIUM"));

        for(Level level : Level.values()){
            System.out.println(level);
        }

        //Enum with custom values and constructor
        Status s = Status.IN_PROGRESS;
        System.out.println(s + ": " + s.getDescription());
        System.out.println(s + ": " + s.getCode());


        // Enum with method override
        System.out.println(Operation.ADD.apply(5,3));
        System.out.println(Operation.SUBTRACT.apply(8,7));

        //Enum implementing interface
        Color c = Color.RED;
        c.print();
    }
}
