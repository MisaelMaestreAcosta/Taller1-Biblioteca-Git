package App;

import java.time.LocalDate;

public class Loan {

    private String loanId;
    private Client client;
    private Book book;
    private LocalDate date;
    private String status;

    public Loan() {
    }

    public Loan(String loanId, Client client, Book book) {
        this.loanId = loanId;
        this.client = client;
        this.book = book;
        this.date = LocalDate.now();
        this.status = "Active";
        this.book.setAvailable(false);
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void returnBook() {
        this.status = "Returned";
        this.book.setAvailable(true);
    }

    @Override
    public String toString() {
        return "Loan{loanId='" + loanId + "', client=" + client.getName()
                + ", book='" + book.getTitle() + "', date=" + date
                + ", status='" + status + "'}";
    }
}
