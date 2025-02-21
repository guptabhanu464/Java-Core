package interfaces;

public class Runner implements Marathon{

    @Override
    public String canRun() {
        return "Runner Can run the marathon and length of track is 1000";
    }


    public static void main(String[] args) {

        Runner runner = new Runner();
        Integer lengthOfTrack = runner.lengthOfTrack();
        System.out.println(lengthOfTrack);
        String canRun = runner.canRun();
        System.out.println(canRun);
        String string = Marathon.nameOfTrack();
        System.out.println(string);
    }
}
