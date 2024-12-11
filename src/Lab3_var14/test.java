package Lab3_var14;

public class test {
    public static void main(String[] args) {
        Library library = new Library("KUBSU Library", "C", "Chelovichi", "War and Peace", "11.12.2024", 5, 210);

        System.out.println(library.getBookName());
        System.out.println(library.getReaderName());

        library.setReaderName("Shpichka");
        library.setDepositAmount(6000);
        library.setIssueDate("06.08.2020");

        System.out.println(library.getReaderName());
        System.out.println(library.getDepositAmount());
        System.out.println(library.getIssueDate());
    }

}
