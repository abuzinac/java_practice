public class MegaBytesConverter {

    /*Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with
    the name kiloBytes.

    The method should not return anything (void) and it needs to calculate the megabytes and
    remaining kilobytes from the kilobytes parameter.

    Then it needs to print a message in the format "XX KB = YY MB and ZZ KB". XX represents
    the original value kiloBytes. YY represents the calculated megabytes. ZZ represents the
    calculated remaining kilobytes.

    If the parameter kiloBytes is < 0 then print instead the text "Invalid Value".
    Example: printMegaBytesAndKiloBytes(2050) should print "2050 KB = 2 MB and 2 KB"
    TIP: Be careful about spaces in the printed message.
    TIP: Use the remainder operator
    TIP: 1 MB = 1024 KB

    NOTE: The printMegaBytesAndKiloBytes method needs to be defined
    as public static like
    we have been doing so far in the course.

    NOTE: Do not add a  main method to solution code.*/

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int convertKiloBytesInMegaBytes = kiloBytes / 1024;
        int remainderOfKiloBytes = kiloBytes % 1024;

        if (kiloBytes >= 0) {
            System.out.println(kiloBytes + " " + "KB" + " = " + convertKiloBytesInMegaBytes + " MB and " + remainderOfKiloBytes + " KB");
        } else if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
    }

}
