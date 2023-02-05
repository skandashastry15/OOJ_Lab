class BMSCE extends Thread {
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("\nBMS College Of Engineering");
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class CSE extends Thread {
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("\nCSE");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class ThreadDemo {
    public static void main(String args[]) {
        new BMSCE().start();
        new CSE().start();
    }
}
