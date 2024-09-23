public class BulbSwitcher319 {
    public int bulbSwitch(int n) {
        int count =0;
        int i=1;
        
        while(i*i<=n){
            count++;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        BulbSwitcher319 obj = new BulbSwitcher319();
        System.out.println(obj.bulbSwitch(3));
    }
}
