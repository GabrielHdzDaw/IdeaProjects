public class FairyTale {
    private String title;
    private int numberOfPages;

    public FairyTale(String title, int numberOfPages){
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "FairyTale{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FairyTale fairyTale = (FairyTale) obj;
        return title.equals(fairyTale.title);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title);
    }
}
