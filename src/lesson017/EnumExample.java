package lesson017;

enum CoffeeSize {
    SMALL(1000), MEDIUM(2000), BIG(3000);
    int mils;

    CoffeeSize(int m) {
        this.mils = m;
    }
}

class EnumExample {

    enum TieSize {
        SMALL("small", 100) {
            public String getTieClass() {
                return "s";
            }
        }, MEDIUM("medium", 200) {
            public String getTieClass() {
                return "m";
            }
        }, BIG("big", 300) {
            public String getTieClass() {
                return "b";
            }
        };

        private String tieClass;
        private int mils;
        private String name;

        TieSize(String name, int m) {
            this.name = name;
            this.mils = m;
        }

        public int getMils() {
            return mils;
        }

        public String getTieClass() {
            return tieClass;
        }

        public String getName() {
            return name;
        }
    }


}
