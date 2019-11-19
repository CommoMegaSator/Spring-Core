//Builds objects

package com.versatile.spring.pattern;

public class BuilderPattern {

    private String mainField;
    private int numberField;
    private int elseField;

    public String getMainField() {
        return mainField;
    }

    public int getNumberField() {
        return numberField;
    }

    public int getElseField() {
        return elseField;
    }

    private BuilderPattern(myBuilder myBuilder){
        this.mainField = myBuilder.mainField;
        this.numberField = myBuilder.numberField;
        this.elseField = myBuilder.elseField;
    }

    public static class myBuilder{

        private String mainField;
        private int numberField;
        private int elseField;

        public myBuilder(String mainField){
            this.mainField = mainField;
        }

        public myBuilder setNumberField(int numberField) {
            this.numberField = numberField;
            return this;
        }

        public myBuilder setElseField(int elseField) {
            this.elseField = elseField;
            return this;
        }

        public BuilderPattern build(){
            return new BuilderPattern(this);
        }
    }
}
