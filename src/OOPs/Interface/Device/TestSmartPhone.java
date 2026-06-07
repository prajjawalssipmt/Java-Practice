package OOPs.Interface.Device;

public class TestSmartPhone {
    static void main() {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.playMusic();
        smartPhone.stopMusic();
        smartPhone.clickPhoto();
        smartPhone.recordVideo();
        smartPhone.makeCall(669324588);
        smartPhone.endCall();
    }
}
