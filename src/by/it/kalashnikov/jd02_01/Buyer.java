package by.it.kalashnikov.jd02_01;

class Buyer extends Thread implements IBuyer{

    public Buyer(int number) {
        super("Buyer №"+number);
    }

    @Override
    public void run() {
        enterToMarket();
        chooseGoods();
        goOut();
        Dispatcher.BUYERS_IN_SHOP--;
    }

    @Override
    public void enterToMarket() {
        System.out.printf("%s enter to market",this);
    }

    @Override
    public void chooseGoods() {
        System.out.printf("%s started to choose\n",this);
        int timeout = Helper.getRandom(500, 2000);
        Helper.mySleep(timeout);
        System.out.printf("%s finished to choose\n",this);
    }

    @Override
    public void goOut() {
        System.out.printf("%s leaved market\n",this);

    }

    @Override
    public String toString() {
        return this.getName();
    }
}
