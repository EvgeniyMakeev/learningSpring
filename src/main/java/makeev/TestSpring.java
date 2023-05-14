package makeev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        System.out.println(testBean.getName());

//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer();


        // Внедрение зависимостей через конструктор
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName() + "\nVolume: " + musicPlayer.getVolume());

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean compare = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(compare);


//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName() + "\nVolume: " + musicPlayer.getVolume());


        context.close();
    }
}
