public class Colors {
    public static final String RESET = "\033[0m"; // Reset
    public static final String BLACK = "\033[0;30m"; // Black
    public static final String RED = "\033[0;31m"; // Red
    public static final String GREEN = "\033[0;32m"; // Green
    public static final String YELLOW = "\033[0;33m"; // Yellow
    public static final String BLUE = "\033[0;34m"; // Blue
    public static final String PURPLE = "\033[0;35m"; // Purple
    public static final String CYAN = "\033[0;36m"; // Cyan
    public static final String WHITE = "\033[0;37m"; // White

    public static void main(String[] args) {
        System.out.println(RED + "Texto en rojo" + RESET);
        System.out.println(GREEN + "Texto en verde" + RESET);
        System.out.println(BLUE + "Texto en azul" + RESET);
    }
}
