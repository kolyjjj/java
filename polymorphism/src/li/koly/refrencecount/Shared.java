package li.koly.refrencecount;

    /**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 12/6/12
 * Time: 7:16 AM
 * To change this template use File | Settings | File Templates.
 */
//public class Shared {
//        private static int id = 0;
//
//        public Shared(){
//            id++;
//        }
//
//        @Override
//        public String toString() {
//            return "shared: " + id;
//        }
//
//        public static void clear() {
//            id = 0;
//        }
//    }


//another implementation
public class Shared{
        private static long count = 0;   //why use long?
        private long id = ++count;

        @Override
        public String toString() {
            return "shared: " + id;
        }


        public static void clear() {
            count = 0;
        }
    }