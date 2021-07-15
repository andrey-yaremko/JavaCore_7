public class Cy_27 extends Aircraft_control implements OpportunitiesPlane {

    int maxSpeed;
    String color;

    public Cy_27(){
        this.maxSpeed = 400;
        this.color = "Red";
    }

    @Override
    public void turboAcceleration() {
        System.out.println("Швидкість турбоприкскорення " +exstraSpeed+ " км");
    }

    @Override
    public void stealthTechnology() {
        System.out.println("Літак не видно протягом " +disappear+ " секунд");
    }

    @Override
    public void nuclearStrike() {
        System.out.println("Кількість ядерних боєголовок " +missiles+ " шт");
    }
}
