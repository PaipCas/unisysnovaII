package model;

import java.time.LocalDate;

public class Loan {

    private int idLoan;
    private LocalDate dueDate;
    private String bookStatus;

    public Loan(int idLoan, LocalDate dueDate, String bookStatus) {
        this.idLoan = idLoan;
        this.dueDate = dueDate;
        this.bookStatus = bookStatus;
    }

    public Loan() {
    }

    public int getIdLoan() {
        return idLoan;
    }

    public void setIdLoan(int idLoan) {
        this.idLoan = idLoan;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    

    
    
    
}
