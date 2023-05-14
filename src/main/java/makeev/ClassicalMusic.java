package makeev;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music{
//    private ClassicalMusic() {}
//
//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }
    public void doMyInit() {
        System.out.println("Initialization...");
    }

    public void doMyDestroy() {
        System.out.println("Destroying...");
    }
    @Override
    public String getSong() {
        return "Playing Classical Music!";
    }
}
