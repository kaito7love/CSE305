class PermanentContract extends Contract {
    public PermanentContract(int contractID, int propertyID, int tenantID, double rentAmount) {
        super(contractID, propertyID, tenantID, rentAmount);
    }

    @Override
    public String getTerm() {
        return "Permanent";
    }
}