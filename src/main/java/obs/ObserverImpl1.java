package obs;

public class ObserverImpl1 implements Observer {

    @Override
    public void update(int newSate) {
        System.out.println("++++++++++OBS Impl 1+++++++++");
        System.out.println("New state: " +newSate);
        System.out.println("++++++++OBS Impl 1+++++++++++");
    }

}
