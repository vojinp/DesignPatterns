package strategy;

public class ShareToSocialMedia implements ShareBehaviour {
    @Override
    public void share() {
        System.out.println("Sharing to social media");
    }
}
