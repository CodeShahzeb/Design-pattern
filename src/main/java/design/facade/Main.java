package design.facade;

public class Main {
    public static void main(String[] args) {

        RoomLights roomLights=new RoomLights();
        Television television=new Television();
        SoundSystem soundSystem=new SoundSystem();

        HomeTheatreFacade homeTheatreFacade =new HomeTheatreFacade(roomLights,soundSystem,television);
        homeTheatreFacade.watchMovie();
        homeTheatreFacade.stopWatchMovie();
    }
}
