public class Variable {
    private Object value;

    public Variable(String dataType) throws Exception {
        switch (dataType) {
            case "int": value = 0; break;
            case "float": value = 0.0; break;
            case "boolean": value = false; break;
            case "string": value = ""; break;
            default: throw new Exception("invalid data type");
        }
    }
    public Variable(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }
    public void setValue(String newValue) {
        switch (getType()) {
            case "int" : value = Integer.parseInt(newValue); break;
            case "float" : value = Double.parseDouble(newValue); break;
            case "boolean" : value = Boolean.parseBoolean(newValue); break;
            case "string" : value = newValue; break;
        }
    }
    public void setValue(Object newValue) throws Exception {
        if (newValue.getClass().equals(value.getClass()))
            this.value = newValue;
        else throw new Exception("incompatible type");
    }

    public String getType() {
        if (value instanceof Integer) return "int";
        else if (value instanceof Double) return "float";
        else if (value instanceof Boolean) return "boolean";
        else if (value instanceof String) return "string";
        else return null;
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
            switch (getType()) {
                case "int" : return this.getInteger() == ((Variable) object).getInteger();
                case "float" : return this.getDouble() == ((Variable) object).getDouble();
                case "boolean" : return this.getBoolean() == ((Variable) object).getBoolean();
                case "string" : return this.getString().equals(((Variable) object).getString());
            }
        }
        return false;
    }
}
