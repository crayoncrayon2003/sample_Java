class if_and_swhitch {
    public static void main(String[] args) {
        System.out.println(" if ");
        for (int idx = 0; idx < 10; idx++){
            if (idx % 2 == 0) {
                System.out.println(Integer.valueOf(idx).toString() + " % 2 == 0");
            }else if (idx % 3 == 0){
                System.out.println(Integer.valueOf(idx).toString() + " % 3 == 0");
            }else{
                System.out.println(Integer.valueOf(idx).toString());
            }
        }

        System.out.println(" switch ");
        for (int idx = 0; idx < 10; idx++){
            switch (idx) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                case 4:
                    System.out.println("Three or Four");
                break;
                default:
                    System.out.println("Other");
                break;
            }
        }
    }
}