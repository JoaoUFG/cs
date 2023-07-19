package org.example._02;

class Human {
    private String name;
    private String age;
    private Address address;

    public String getFullAddress(){
        return this.address.getFullAddress();
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
