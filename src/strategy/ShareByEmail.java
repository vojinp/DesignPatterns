package strategy;

public class ShareByEmail implements ShareBehaviour {
    @Override
    public void share() {
        System.out.println("Sharing by email by email");
    }
}
