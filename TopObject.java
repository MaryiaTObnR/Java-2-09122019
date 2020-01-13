package Addittion_aim;

import java.util.ArrayList;

class TopObject {
    private int id;
    private String parentId;

    public ArrayList<TopObject> getChildren() {  ((ArrayList<TopObject>) children).ensureCapacity(20);return children;}

    private ArrayList<TopObject> children = new ArrayList<>();

    TopObject(int id, String parentId){
        this.id = id;
        this.parentId = parentId;
    }

    public int getId() {return id;}

    public String getParentId() {return parentId;}

    public boolean hasParent(){
        if(this.parentId != null){
            return true;
        }
        return false;
    }

    public void showChildren() {
        if(children.isEmpty()){
            System.out.println("No child objects");
            return;
        }

        for (TopObject child : children) {
            System.out.println(child.getId());
        }
    }

    public void setChild(TopObject child) {

        this.children.add(child);
    }
}
