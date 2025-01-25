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

    // название библиотеки
    public String getLibraryName() {
        return libraryName;
    }

    // название читального зала
    public String getReadingRoomName() {
        return readingRoomName;
    }
    public void setReadingRoomName(String readingRoomName) {
        this.readingRoomName = readingRoomName;
    }

    // фамилия читателя
    public String getReaderName() {
        return readerName;
    }

    //название книги
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    // дата выдачи
    public String getIssueDate() {
        return issueDate;
    }

    // срок выдачи > 0
    public int getIssuePeriod() {
        return issuePeriod;
    }
    public void setIssuePeriod(int issuePeriod) {
        if (issuePeriod <= 0) {
            throw new IllegalArgumentException();
        }
        this.issuePeriod = issuePeriod;
    }

    // залог > 0
    public double getDepositAmount() {
        return depositAmount;
    }
    public void setDepositAmount(double depositAmount) {
        if (depositAmount <= 0) {
            throw new IllegalArgumentException();
        }
        this.depositAmount = depositAmount;
    }
}
