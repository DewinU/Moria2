public class Main {
    public static void main(String[] args) {
        String introduccion = "\tLos 2 Caminos\n\n" +
                "Hay dos caminos. Uno, de la vida; otro, de la muerte. " +
                "\nLa diferencia entre ambos es grande. El camino de la Vida es el camino de Dios, en apariencia angosto y estrecho," +
                "\ndifícil de transitar y por el que no va mucha gente. El camino de la muerte es ancho, espacioso y fácil de transitar. " +
                "\nLo fácil es optar por el camino de la muerte, pero lo realmente bueno es elegir el camino de la Vida." +
                "\nPorque el destino del camino de la Vida es la vida eterna y la plenitud del amor de Dios, mientras que el destino del camino de la muerte es… la muerte. " +
                "\nPero entonces… ¿Por qué se elige el camino de la muerte?\n" +
                "\nSeguir un camino de vida sin Dios, es como caminar ciegamente sin un guía, " +
                "\ncomo seres humanos necesitas ha alguien que proporcione la luz y la esperanza para seguir en el camino angosto, " +
                "\nel camino de Dios.";
        Scroll(introduccion);
        System.out.println("\t \n Presiona Enter para continuar...");



    }

    public static void Scroll(String text){
        for (int i = 0; i < text.length(); i++) {
            long start = System.currentTimeMillis();
            while (System.currentTimeMillis() - start < 50) {

            }
            System.out.print(text.charAt(i));
        }
    }
}
