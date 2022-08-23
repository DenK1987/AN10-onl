package lesson10.Homework_Part1;

public class WorkWithNumberDocument {

    public static void twoBlocksWithNumbers(String numberDocument) {
        String[] blocks = numberDocument.split("-");
        System.out.print("Выводим на экран в одну строку два первых блока по 4 цифры: ");
        System.out.println(blocks[0] + " " + blocks[2]);
    }

    public static void replacingLettersSymbols(String numberDocument) {
        System.out.print("Выводим на экран номер документа, но блоки из трех букв заменяем на ***: ");
        System.out.println(numberDocument.replaceAll("[a-zA-Z]{3}", "***"));
    }

    public static void onlyLettersInLowercase(String numberDocument) {
        System.out.print("Выводим на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре: ");
        System.out.println(numberDocument.replaceAll("[0-9]{4}", "-").
                replaceAll("[0-9-]+", "/").
                replaceFirst("/", "").
                toLowerCase());
    }

    public static void onlyLettersInUppercase(String numberDocument) {
        StringBuilder sb = new StringBuilder(numberDocument);
        System.out.print("Выводим на экран буквы из номера документа в формате \"Letters:yyy/yyy/y/y\" в верхнем регистре (с помощью класса StringBuilder): ");
        System.out.println("Letters:" + sb.delete(0, 5).
                replace(3, 9, "/").
                replace(7, 9, "/").
                replace(9, 10, "/").
                toString().toUpperCase());
    }

    public static void containsSequenceAbc(String documentNumber) throws ExceptionAbc {
        if (documentNumber.toLowerCase().contains("abc".toLowerCase())) {
            System.out.println("Документ с номером " + documentNumber + " содержит последовательность " + "\"abc\"");
        } else
            throw new ExceptionAbc("Документ с номером " + documentNumber + " не содержит последовательность " + "\"abc\"");
    }

    public static void startsWithSequence555(String documentNumber) throws Exception555 {
        if (documentNumber.startsWith("555")) {
            System.out.println("Документ с номером " + documentNumber + " начинается с последовательности " + "\"555\"");
        } else
            throw new Exception555("Документ с номером " + documentNumber + " не начинается с последовательности " + "\"555\"");
    }

    public static void endsWithSequence1a2b(String documentNumber) throws Exception1a2b {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println("Документ с номером " + documentNumber + " заканчивается на последовательность " + "\"1a2b\"");
        } else
            throw new Exception1a2b("Документ с номером " + documentNumber + " не заканчивается на последовательность " + "\"1a2b\"");
    }


}
