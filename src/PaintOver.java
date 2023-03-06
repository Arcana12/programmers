public class PaintOver {
    private static int solution(int n, int m, int[] section){

        int roller = m;
        int painted = 0;
        int count = 0;

        for (int index : section) {
            if(index > painted){
                painted = index + roller - 1;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int answer = solution(5,4, new int[] {1,3} );
        System.out.println("answer = " + answer);
    }
}
