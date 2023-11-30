public class Unit {
    private String unitName;
    private int unitNo;
     public Unit(String unitName,int unitNo){
        this.setUnitName(unitName);
        this.setUnitNo(unitNo);
    }
    public String getUnitName()
    {
        return unitName;
    }
    public int getUnitNo()
    {
        return unitNo;
    }


    public void setUnitName(String unitName)
    {
        this.unitName=unitName;
    }
    public void setUnitNo(int unitNo)
    {
        this.unitNo=unitNo;
    }}

