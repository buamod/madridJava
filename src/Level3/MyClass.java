package Level3;


class MyClass<E>{
    private E attribute;
    MyClass(E var){
        this.attribute = var;
    }
    public E get(){
        return this.attribute;
    }
    public void set(E value){
        this.attribute = value;
    }

    public boolean equals (MyClass<E> other){

        return get().getClass().equals(other.get().getClass());
    }

}