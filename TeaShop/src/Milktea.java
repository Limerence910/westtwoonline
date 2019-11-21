class Milktea{
    Ingredient ingredient;
    String name;
    public Milktea(Ingredient ingredient,String name){
        this.ingredient = ingredient;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Milktea{" + "ingredient=" + ingredient+ ", name=" + name + '}';
    }
}