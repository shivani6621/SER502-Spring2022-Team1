public class Variable {
    enum TYPE { UNDEFINED, INTEGER, DOUBLE, BOOLEAN, STRING };

    private Object value;

    public Variable(Object value) {
        this.value = value;
    }

    public Object getDataValue() {
        return this.value;
    }
    public void setDataValue(Object newValue) throws Exception {
        if (newValue.getClass().equals(value.getClass()))
            this.value = newValue;
        else throw new Exception("Incompatible Type");
    }

    public TYPE getDataType() {
        if (value instanceof Integer) return TYPE.INTEGER;
        else if (value instanceof Double) return TYPE.DOUBLE;
        else if (value instanceof Boolean) return TYPE.BOOLEAN;
        else if (value instanceof String) return TYPE.STRING;
        else return TYPE.UNDEFINED;
    }

    public int getInteger() {
        return (Integer) value;
    }
    public double getDouble() {
        return (Double) value;
    }
    public boolean getBoolean() {
        return (Boolean) value;
    }
    public String getString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (this == object) return true;

        if (this.getClass().equals(object.getClass())) {
            TYPE dataType = this.getDataType();
            switch (dataType) {
                case INTEGER : return this.getInteger() == ((Variable) object).getInteger();
                case DOUBLE : return this.getDouble() == ((Variable) object).getDouble();
                case BOOLEAN : return this.getBoolean() == ((Variable) object).getBoolean();
                case STRING : return this.getString().equals(((Variable) object).getString());
            }
        }
        return false;
    }
}
