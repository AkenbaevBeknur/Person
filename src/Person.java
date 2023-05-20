class Person {
    private String fullName;
    private int age;
    private boolean isMarried;

    public Person(String fullName, int age, boolean isMarried) {
        this.fullName = fullName;
        this.age = age;
        this.isMarried = isMarried;
    }

    public void introduceMyself() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Marital Status: " + (isMarried ? "Married" : "Single"));
    }
}
