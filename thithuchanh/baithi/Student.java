package baithi;

public class Student {
        private String StudentId;
        private String Name;
        private String    Address;
        private int Phone;

        public Student( String StudentId, String Name, String Address, int Phone) {
            this.StudentId = StudentId;
            this.Name = Name;
            this.Address = Address;
            this.Phone = Phone;

        }

        public String getStudentId() {
            return StudentId;
        }

        public void setStudentId(String studentId) {
            StudentId = studentId;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public int getPhone() {
            return Phone;
        }

        public void setPhone(int phone) {
            Phone = phone;
        }

        @Override
        public String toString() {
            return "demo{" +
                    "StudentId='" + StudentId + '\'' +
                    ", Name='" + Name + '\'' +
                    ", Address='" + Address + '\'' +
                    ", Phone=" + Phone +
                    '}';
        }
    }

