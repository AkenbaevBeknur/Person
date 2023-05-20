class Teacher extends Person {
    private int experience;
    private double salary;

    public Teacher(String fullName, int age, boolean isMarried, int experience) {
        super(fullName, age, isMarried);
        this.experience = experience;
        this.salary = calculateSalary();
    }

    private double calculateSalary() {
        double baseSalary = 2000.0;
        double bonusPercentage = 0.05;
        int yearsAboveThreshold = Math.max(0, experience - 3);
        double experienceBonus = baseSalary * bonusPercentage * yearsAboveThreshold;
        return baseSalary + experienceBonus;
    }

    public double getSalary() {
        return salary;
    }
}
