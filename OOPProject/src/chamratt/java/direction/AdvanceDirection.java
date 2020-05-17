package chamratt.java.direction;

public enum AdvanceDirection implements Direction {
    NORTH_EAST{
        @Override
        public void showDirection() {
            System.out.println("I am NORTH-EAST");
        }
    },
    NORTH_WEST{
        @Override
        public void showDirection() {
            System.out.println("I am NORTH-WEST");
        }
    },
    SOUTH_EAST{
        @Override
        public void showDirection() {
            System.out.println("I am SOUTH-EAST");
        }
    },
    SOUTH_WEST{
        @Override
        public void showDirection() {
            System.out.println("I am SOUTH-WEST");
        }
    }
}
