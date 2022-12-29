public class Parking implements Runnable{
    int emptyPlaces = 5;

    public int getEmptyPlaces() {
        return emptyPlaces;
    }
    @Override
    public synchronized void run() {
        if (getEmptyPlaces() >= 1) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            emptyPlaces -= 1;
            System.out.println(Thread.currentThread().getName() + " is completes the parking. The count of empty places is " + getEmptyPlaces());
        } else {
            System.out.println("There's NO EMPTY PLACES for " + Thread.currentThread().getName() + " to park car!!!");
        }
    }
}
