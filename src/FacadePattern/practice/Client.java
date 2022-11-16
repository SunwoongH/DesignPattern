package FacadePattern.practice;

public class Client {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner", amplifier);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amplifier);
        CdPlayer cd = new CdPlayer("CD Player", amplifier);
        Projector projector = new Projector("Projector", player);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, tuner, player, projector, screen, lights, popper);
        homeTheater.watchMovie("Avengers");
        homeTheater.endMovie();
    }
}
