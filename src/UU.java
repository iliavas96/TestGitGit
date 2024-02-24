public class UU {
    private int i =5;

    public void addInt () {
        System.out.println("2++=2");
        for (int i = 0; i<125; i++) {
            System.out.println(this.i+i);
        }
    }

    public static void main(String[] args) {
        UU uu = new UU();
        uu.addInt();

    }

}
