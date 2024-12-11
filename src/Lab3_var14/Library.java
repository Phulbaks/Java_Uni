package Lab3_var14;

public class Library {
    private String libraryName; // название библиотеки
    private String readingRoomName; // название читательского зала
    private String readerName; // фамилия читателя
    private String bookName; // название литературы
    private String issueDate; // дата выдачи(DD/MM/YYYY)
    private int issuePeriod; // срок выдачи(hours)
    private double depositAmount; // сумма залога

    public Library(String libraryName, String readingRoomName, String readerName, String bookName, String issueDate, int issuePeriod, double depositAmount) {
        this.libraryName = libraryName;
        this.readingRoomName = readingRoomName;
        this.readerName = readerName;
        this.bookName = bookName;
        this.issueDate = issueDate;
        this.issuePeriod = issuePeriod;
        this.depositAmount = depositAmount;
    }

    public String getLibraryName() {
        return libraryName;
    }
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getReadingRoomName() {
        return readingRoomName;
    }
    public void setReadingRoomName(String readingRoomName) {
        this.readingRoomName = readingRoomName;
    }

    public String getReaderName() {
        return readerName;
    }
    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIssueDate() {
        return issueDate;
    }
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public int getIssuePeriod() {
        return issuePeriod;
    }
    public void setIssuePeriod(int issuePeriod) {
        this.issuePeriod = issuePeriod;
    }

    public double getDepositAmount() {
        return depositAmount;
    }
    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }
}
