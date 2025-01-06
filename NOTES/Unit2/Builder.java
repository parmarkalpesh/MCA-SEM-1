class Builder {
    private String name;

    public Builder setName(String name) {
        this.name = name;
        return this; // Returns the current instance
    }

    public void printName() {
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("Bob").printName(); // Method chaining
    }
}
