
//This class is for blocks surrouned our room.
//Include two concepts in this class; one is the cross points, one is the sides.
public class pst {
    // if the len equals 1, that means this is the cross point. Oteherwise it is
    // side.
    private int len;
    // if this pst have been processed, flag=true.
    private boolean flag;

    public pst() {

    }

    public pst(int len) {
        this.setLen(len);
        // all the points initially hadn't been processed.
        flag = false;
    }

    public boolean isProcessed() {
        return flag;
    }

    public void processed() {
        flag = true;
    }

    public void addToside(int length) {
        setLen(getLen() + length);
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

}