package Book;

public class Book {
        private String author;
        private String name;
        private int page;
        public Book(String author, String name, int page)
        {
            this.author = author;
            this.name = name;
            this.page = page;
        }
        public String getAuthor() {
            return author;
        }
        public String getName() {
            return name;
        }
        public int getPage() {
            return page;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setPage(int page) {
            this.page = page;
        }
        @Override
        public String toString() {
            return "Book{" +
                    "author='" + author + '\'' +
                    ", name='" + name + '\'' +
                    ", page=" + page +
                    '}';
        }
}
