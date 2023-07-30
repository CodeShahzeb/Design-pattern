package design.observer;

public class Main {

    public static void main(String[] args) {

        YoutubeChannel1 youtubeChannel1 = new YoutubeChannel1();
        YoutubeChannel2 youtubeChannel2 = new YoutubeChannel2();

        User1 user1=new User1();
        User2 user2=new User2();
        User3 user3=new User3();

        youtubeChannel1.registeredObserver(user1);
        youtubeChannel1.registeredObserver(user2);

        youtubeChannel2.registeredObserver((user1));
        youtubeChannel2.registeredObserver((user2));
        youtubeChannel2.registeredObserver((user3));
        youtubeChannel2.unregisteredObserver(user3);

        youtubeChannel1.newVideoAdded("Video 1 added in channel 1");
        youtubeChannel2.newVideoAdded("Video 5 added in channel 2");

    }
}
