package strategy;

public class Strategy {
    public static void main(String[] args) {
        PhoneCameraApp basicCameraApp = new BasicCameraApp();
        basicCameraApp.edit();
        basicCameraApp.share();
        basicCameraApp.setShareBehaviour(new ShareToSocialMedia());
        basicCameraApp.share();
    }
}
