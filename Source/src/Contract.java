
public abstract class Contract {
    private int contractID;
    private int propertyID;
    private int tenantID;
    private double rentAmount;

    public Contract(int contractID, int propertyID, int tenantID, double rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    // getters and setters
    public int getContractID() {
        return contractID;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public int getTenantID() {
        return tenantID;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public void setTenantID(int tenantID) {
        this.tenantID = tenantID;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public abstract String getTerm();
}

// PermanentContract.java


// LongTermContract.java


// ShortTermContract.java


// ContractBuilder.java
