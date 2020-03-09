package org.example.custom;

public class ArrayList {
    private static final int SIZEFACTOR = 5;
    private Object data[];
    private int index;
    private int size;
    public ArrayList(){
        this.data = new Object[SIZEFACTOR];
        this.size = SIZEFACTOR;
    }
    public ArrayList(Object obj[]){
        this.data = obj;
        this.size = obj.length;
    }
    public void add(Object obj){
        if(this.index==this.size-1){
            extendArray();
        }
        data[this.index]=obj;
        this.index++;
    }
    private void extendArray(){
        this.size  = this.size + SIZEFACTOR;
        Object tmp[] = new Object[this.size];
        for(int i=0;i<this.data.length;i++){
            tmp[i] = this.data[i];
        }
        this.data = tmp;
    }
    public void remove(int index) throws Exception{
        if(index>this.index-1){
            throw new Exception("Array Index Out Of Bound");
        }
        if(index<0){
            throw new Exception("Negative Value");
        }
        for(int i=index;i<this.data.length-1;i++){
            this.data[i]=this.data[i+1];
        }
        this.index--;
    }
    public Object get(int index) throws Exception{
        if(index>this.index-1){
            throw new Exception("Array Index Out Of Bound");
        }
        if(index<0){
            throw new Exception("Negative Value");
        }
        return this.data[index];
    }
    public int length(){
        return this.index;
    }
}
