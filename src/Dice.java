public class Dice {





    public int play(){
        int temp = cast();
        display(temp);
        return temp;
    }

    private int cast() {
        return (int) (Math.random() * 6 + 1);
    }

    private void display(int n) {
        System.out.println();
        switch (n) {
            case 1 -> one();
            case 2 -> two();
            case 3 -> three();
            case 4 -> four();
            case 5 -> five();
            case 6 -> six();
        }
    }


    private void one() {
        System.out.println(" ------- ");
        System.out.println("|       |");
        System.out.println("|   *   |");
        System.out.println("|       |");
        System.out.println(" ------- ");
    }

    private void two() {
        System.out.println(" ------- ");
        System.out.println("| *     |");
        System.out.println("|       |");
        System.out.println("|     * |");
        System.out.println(" ------- ");
    }

    private void three() {
        System.out.println(" ------- ");
        System.out.println("| *     |");
        System.out.println("|   *   |");
        System.out.println("|     * |");
        System.out.println(" ------- ");
    }

    private void four() {
        System.out.println(" ------- ");
        System.out.println("| *   * |");
        System.out.println("|       |");
        System.out.println("| *   * |");
        System.out.println(" ------- ");
    }

    private void five() {
        System.out.println(" ------- ");
        System.out.println("| *   * |");
        System.out.println("|   *   |");
        System.out.println("| *   * |");
        System.out.println(" ------- ");
    }

    private void six() {
        System.out.println(" ------- ");
        System.out.println("| *   * |");
        System.out.println("| *   * |");
        System.out.println("| *   * |");
        System.out.println(" ------- ");
    }


}
