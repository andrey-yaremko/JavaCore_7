public class Aircraft_control extends plane {
        public int up = (int) (Math.random()*100);
        public int down = (int) (Math.random()*100);
        public int left = (int) (Math.random()*100);
        public int right = (int) (Math.random()*100);
    public void Up(){ System.out.println("Відстань в гору"+up); }
    public void Down(){
        System.out.println("Відстань в низ"+down);
    }
    public  void Left(){
        System.out.println("Відстань в ліво"+left);
    }
    public void Right(){
        System.out.println("Відстань в право"+right);
    }

}
