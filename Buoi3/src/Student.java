public class Student {
    private String id;
    private String name;
    private double score;

    // Constructor
    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Tối ưu hàm xếp loại
    public String getRank() {
        if (this.score >= 8.5) {
            return "Giỏi";
        } else if (this.score >= 5.0) {
            return "Khá / Trung bình";
        } else {
            return "Yếu / Dưới khá";
        }
    }

    // Phương thức in thông tin sinh viên
    public void printInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Score: " + score + " | Rank: " + getRank());
    }

    // --- Getter & Setter ---
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
