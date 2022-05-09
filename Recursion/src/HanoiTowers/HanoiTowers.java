package HanoiTowers;

public class HanoiTowers {
    private static void hanoi(int n, char  src, char  mid, char  dest){

        if(n==1){
            System.out.println("Disk 1 moved from " + src + " to " + dest);
            return;
        }

        //Move top n-1 disks from A to B using C as middle
        hanoi(n-1, src, dest, mid);

        //Move last disk from A to C
        System.out.println("Disk " + n + " moved from " + src + " to " + dest);

        //Move n-1 disks from B to C using A as middle
        hanoi(n-1, mid, src, dest);
    }

    public static void main(String[] args) {
        hanoi(4, 'A', 'B', 'C');
    }

}
