package greedy;

public class Changes {
    public static void main(String[] args) {
        int[] coinTypes = {500,100,50,10};
        int count = 0;
        int n = 1260;
        for (int coin : coinTypes){
            count += n / coin;
            n %= coin;
        }

        System.out.println(count);
    }
}
