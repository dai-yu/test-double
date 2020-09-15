package mock;

public class DoorPanelMock extends DoorPanel{
    boolean flag=false;
    @Override
    void close(){
        flag=true;
    }
    public boolean verify(){
        return flag;
    }
}
