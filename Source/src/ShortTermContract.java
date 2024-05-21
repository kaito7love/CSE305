class ShortTermContract extends Contract {
    public ShortTermContract(int contractID, int propertyID, int tenantID, double rentAmount) {
        super(contractID, propertyID, tenantID, rentAmount);
    }

    @Override
    public String getTerm() {
        return "ShortTerm";
    }
}