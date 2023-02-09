package Exception;

//public class Robot {
//
////
////    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
////        for (int i = 0; i < 3; i++) {
////            try (RobotConnection rc = robotConnectionManager.getConnection()) {
////                rc.moveRobotTo(toX, toY);
////                i = 3;
////            } catch (RobotConnectionException e) {
////                if (i == 2) {
////                    throw new RobotConnectionException("error");
////                }
////            }
////        }
////    }
////}
