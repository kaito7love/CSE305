package Lab6;

// Interface: requestProduct
interface RequestProduct {
    void setPriority(String priority);

    void setExpire(String expireDay);

    void setStatus(String status);

    void processRequest();
}
