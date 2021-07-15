public abstract class  plane  {

    public int readiness =(int) (Math.random()* (68)) + 20;
    public double planeInTheAir = Math.random() * 1000;

    public void startEngine(){
        System.out.println("До взлету залишилось" + readiness + "хв");
    }
    public void planeTakeoff(){
        System.out.println("Літак пролетить на повному баку" + planeInTheAir+"км");
    }
    public void landingPlane(){
        System.out.println("Літак іде на посадку");
    }

}
