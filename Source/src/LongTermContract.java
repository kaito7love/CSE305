class LongTermContract extends Contract {
    public LongTermContract(int contractID, int propertyID, int tenantID, double rentAmount) {
        super(contractID, propertyID, tenantID, rentAmount);
    }

    @Override
    public String getTerm() {
        return "LongTerm";
    }
}