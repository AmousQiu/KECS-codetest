import java.util.*;

public class lego {
    public static void main(String args[]) {
        // the pst add into the room should be processed by other program.
        ArrayList<pst> room = new ArrayList<>();

        /*
         * TODO make room has real points. Now the room list is empty, waiting for
         * input.... Now I am supposing this arraylist starts from a point, then a side,
         * then a point. The first point would also appear in the end of the arraylist
         * The attached file is one case and will show what the data would be stored in
         * the arraylist
         */

        /* processing start here */

        // STEP1: Find all the sides that mods 4 = 2
        for (int i = 1; i < room.size() - 1; i += 2) {

            pst currSide = room.get(i);
            pst leftPoint = room.get(i - 1);
            pst rightPoint = room.get(i + 1);

            //If this side hasn't been processed and both of the points arround it hasn't been processed.
            if (!currSide.isProcessed() && (currSide.getLen() % 4 == 2) && !leftPoint.isProcessed()
                    && !rightPoint.isProcessed()) {
                currSide.addToside(2);
                currSide.processed();
                leftPoint.processed();
                rightPoint.processed();
            }
        }

        // STEP 2: Find all the sides that mods 4 = 3
        for (int i = 1; i < room.size() - 1; i += 2) {

            pst currSide = room.get(i);
            pst leftPoint = room.get(i - 1);
            pst rightPoint = room.get(i + 1);

            //If the side hasn't been processed and one of the points arround it hasn't been processed.(Conside the left point first)
            if (!currSide.isProcessed() && (currSide.getLen() % 4 == 3) && !leftPoint.isProcessed()) {
                currSide.addToside(1);
                currSide.processed();
                leftPoint.processed();
            } else if (!currSide.isProcessed() && (currSide.getLen() % 4 == 3) && !rightPoint.isProcessed()) {
                currSide.addToside(1);
                currSide.processed();
                rightPoint.processed();
            }
        }

        // STEP 3: Find all the sides that mods 4 =1
        for (int i = 1; i < room.size() - 1; i += 2) {

            pst currSide = room.get(i);
            pst leftPoint = room.get(i - 1);
            pst rightPoint = room.get(i + 1);

            //If the side hasn't been processed and one of the points arround it hasn't been processed.(Conside the left point first)
            if (!currSide.isProcessed() && (currSide.getLen() % 4 == 1) && !leftPoint.isProcessed()) {
                currSide.addToside(1);
                currSide.processed();
                leftPoint.processed();
            } else if (!currSide.isProcessed() && (currSide.getLen() % 4 == 1) && !rightPoint.isProcessed()) {
                currSide.addToside(1);
                currSide.processed();
                rightPoint.processed();
            }
        }

        // STEP 4: Find all the sides that mods 4 = 0
        for (int i = 1; i < room.size() - 1; i += 2) {

            pst currSide = room.get(i);
            pst leftPoint = room.get(i - 1);
            pst rightPoint = room.get(i + 1);

            //If this side hasn't been processed and both of the points arround it hasn't been processed.
            if (!currSide.isProcessed() && (currSide.getLen() % 4 == 0) && !leftPoint.isProcessed()
                    && !rightPoint.isProcessed()) {
                currSide.addToside(2);
                currSide.processed();
                leftPoint.processed();
                rightPoint.processed();
            }
        }
        

        //STEP 5 : Find out how many blocks we need for the sides.
        for (int i = 1 ; i< room.size();i+=2){
            //Use the side's length devide by 4 that is how many 4*1 blocks we need
            //If the mod is 3 , use one 2*1 block and one 1*1 block
            //If the mod is 2, use one 2*1 block
            //If the mod is 1, use one 1*1 block 
        }

        for (int i =0 ;i<room.size()-2;i+=2){
            pst point=room.get(i);
            if(!point.isProcessed()){
                //Then we use a 1*1 block here.
            }
        }
    }
}