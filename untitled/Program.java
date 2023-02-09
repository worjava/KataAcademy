package untitled;

//public class Program{
//
//public static void main(String[] args) {
//    //Каждое перечисление имеет статический метод values(). Он возвращает массив всех констант перечисления.
//
//            Type[] types = Type.values();
//            for (Type s : types) { System.out.println(s); }
//        }
//    }
//    enum Type
//    {
//        SCIENCE,
//        BELLETRE,
//        PHANTASY,
//        SCIENCE_FICTION
//    }
//
//        System.out.println(Color.RED.getCode());        // #FF0000
//        System.out.println(Color.GREEN.getCode());      // #00FF00
//
//Метод ordinal() возвращает порядковый номер определенной константы (нумерация начинается с 0).
//
//        System.out.println(Type.BELLETRE.ordinal());	// 1

//    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
//    private String code;
//    Color(String code){
//        this.code = code;
//    }
//    public String getCode(){ return code;}
//}
public class Program{

    public static void main(String[] args) {

        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));   // 14
        op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));    // 24
    }
}
enum Operation{
    SUM{
        public int action(int x, int y){ return x  +y;}
    },
    SUBTRACT{
        public int action(int x, int y){ return x - y;}
    },
    MULTIPLY{
        public int action(int x, int y){ return x * y;}
    };
    public abstract int action(int x, int y);
}
