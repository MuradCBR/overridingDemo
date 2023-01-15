public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] kreditManagers = new BaseCreditManager[]
                { new TelebeCreditManager(),new FerdiCreditManager(),new MuellimCreditManager()};

        for (BaseCreditManager kreditManager:kreditManagers){
            System.out.println(kreditManager.hesabla(1000));
        }



    }
}