public class Var {
    private String dataType;
    private Object value;

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public boolean typeCheck(String leftType, String rightType){
        return leftType.equals(rightType);
    }
}
