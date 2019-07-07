package pl.sda.wzorce;

public class SingletonSimpleLazy {

    // leniwy
            private static SingletonSimpleLazy instance;

        private SingleSimpleLazy() {

        }

        public static SingleSimpleLazy getInstance() {
            if (instance == null) {
                instance = new SingleSimpleLazy();
            }
            return instance;
        }
    }

}
