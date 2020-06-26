package strategy;

public abstract class PhoneCameraApp {
    ShareBehaviour shareBehaviour;

    public PhoneCameraApp() {
        shareBehaviour = new ShareByEmail();
    }

    public void setShareBehaviour(ShareBehaviour shareBehaviour) {
        this.shareBehaviour = shareBehaviour;
    }

    public void take() {
        System.out.println("Taking the photo");
    }

    public void save() {
        System.out.println("Saving the photo");
    }

    public void share() {
        shareBehaviour.share();
    }

    public abstract void edit();
}
