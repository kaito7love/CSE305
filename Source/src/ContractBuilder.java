class ContractBuilder {
    private int contractID;
    private int propertyID;
    private int tenantID;
    private double rentAmount;

    public ContractBuilder buildContractID(int contractID) {
        this.contractID = contractID;
        return this;
    }

    public ContractBuilder buildPropertyID(int propertyID) {
        this.propertyID = propertyID;
        return this;
    }

    public ContractBuilder buildTenantID(int tenantID) {
        this.tenantID = tenantID;
        return this;
    }

    public ContractBuilder buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    public Contract signContract(String term) {
        if (term.equals("Permanent")) {
            return new PermanentContract(contractID, propertyID, tenantID, rentAmount);
        } else if (term.equals("LongTerm")) {
            return new LongTermContract(contractID, propertyID, tenantID, rentAmount);
        } else if (term.equals("ShortTerm")) {
            return new ShortTermContract(contractID, propertyID, tenantID, rentAmount);
        } else {
            throw new UnsupportedOperationException("Invalid term");
        }
    }
}