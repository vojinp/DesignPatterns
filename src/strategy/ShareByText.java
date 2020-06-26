package strategy;

public class ShareByText implements ShareBehaviour {
    @Override
    public void share() {
        System.out.println("Sharing by text.");
    }
}
