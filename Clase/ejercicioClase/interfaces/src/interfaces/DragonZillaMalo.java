package interfaces;

public class DragonZillaMalo extends DragonZilla{
    public void amenazar() {
        System.out.println("DragonZilla malo amenazando...");
    }

    @Override
    public void destruir() {
        System.out.println("DragonZilla malo destruyendo...");
    }
}
