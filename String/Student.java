package String;

class University {

    public static class Student {
        protected final String studying;

        protected Student(String work) {
            this.studying = work;
        }

        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }

        public void study() {
            System.out.println("Я очень занят." + studying);
        }
    }

    public static class JavaStudent extends Student {


        public JavaStudent() {

            super("Я очень занят. Прохожу курс по Java.");
        }


        public static void main(String[] args) {
            JavaStudent studentJava = new JavaStudent();

        }

    public static class LazyStudent extends Student {
        public LazyStudent() {
        }

        @Override
        public void study() {
            System.out.println("Сегодня не учусь, мне лень.");
        }

        public static void main(String[] args) {
            LazyStudent lazyStudent = new LazyStudent();
            lazyStudent.study();
        }
    }
    }
}
