package App;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<Loan> loans = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static void createClient() {

        System.out.print("Enter client ID: ");
        String id = sc.nextLine();

        System.out.print("Enter client name: ");
        String name = sc.nextLine();

        System.out.print("Enter client phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter client email: ");
        String email = sc.nextLine();

        boolean exists = false;
        for (Client client : clients) {
            if (client.getId().equals(id)) {
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("Client with ID " + id + " already exists");
            return;
        }

        Client newClient = new Client(id, name, phone, email);
        clients.add(newClient);

        System.out.println("Client created successfully");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);

    }

    public static void listClients() {
        if (clients.isEmpty()) {
            System.out.println("No clients registered");
            return;
        }

        System.out.println("\n CLIENTS LIST ");
        for (Client client : clients) {
            System.out.println(client);
        }
    }

    public static void findClient() {
        System.out.print("Enter client ID to search: ");
        String id = sc.nextLine();

        for (Client client : clients) {
            if (client.getId().equals(id)) {
                System.out.println("Client found:");
                System.out.println(client);
                return;
            }
        }

        System.out.println("Client with ID " + id + " not found");
    }

    public static void updateClient() {
        System.out.print("Enter client ID to update: ");
        String id = sc.nextLine();

        for (Client client : clients) {
            if (client.getId().equals(id)) {
                System.out.println("Current data: " + client);

                System.out.print("Enter new name (press Enter to keep current): ");
                String name = sc.nextLine();
                if (!name.isEmpty()) {
                    client.setName(name);
                }

                System.out.print("Enter new phone (press Enter to keep current): ");
                String phone = sc.nextLine();
                if (!phone.isEmpty()) {
                    client.setPhone(phone);
                }

                System.out.print("Enter new email (press Enter to keep current): ");
                String email = sc.nextLine();
                if (!email.isEmpty()) {
                    client.setEmail(email);
                }

                System.out.println("Client updated successfully");
                System.out.println("Updated data: " + client);
                return;
            }
        }

        System.out.println("Client with ID " + id + " not found");
    }

    public static void deleteClient() {
        System.out.print("Enter client ID to delete: ");
        String id = sc.nextLine();

        for (Client client : clients) {
            if (client.getId().equals(id)) {
                clients.remove(client);
                System.out.println("Client with ID " + id + " deleted successfully");
                return;
            }
        }

        System.out.println("Client with ID " + id + " not found");
    }

    public static void createBook() {
        System.out.print("Enter book code: ");
        String code = sc.nextLine();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter book year published: ");
        String yearPublished = sc.nextLine();

        System.out.print("Enter book author: ");
        String author = sc.nextLine();

        for (Book book : books) {
            if (book.getCode().equals(code)) {
                System.out.println("Book with code " + code + " already exists");
                return;
            }
        }

        Book newBook = new Book(code, title, yearPublished, author, true);
        books.add(newBook);

        System.out.println("Book created successfully");
        System.out.println("Code: " + code);
        System.out.println("Title: " + title);
    }

    public static void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books registered");
            return;
        }

        System.out.println("\n "
                + "BOOKS LIST");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void findBook() {
        System.out.print("Enter book code to search: ");
        String code = sc.nextLine();

        for (Book book : books) {
            if (book.getCode().equals(code)) {
                System.out.println("Book found:");
                System.out.println(book);
                return;
            }
        }

        System.out.println("Book with code " + code + " not found");
    }

    public static void updateBook() {
        System.out.print("Enter book code to update: ");
        String code = sc.nextLine();

        for (Book book : books) {
            if (book.getCode().equals(code)) {
                System.out.println("Current data: " + book);

                System.out.print("Enter new title (press Enter to keep current): ");
                String title = sc.nextLine();
                if (!title.isEmpty()) {
                    book.setTitle(title);
                }

                System.out.print("Enter new author (press Enter to keep current): ");
                String author = sc.nextLine();
                if (!author.isEmpty()) {
                    book.setAuthor(author);
                }

                System.out.print("Enter new year (press Enter to keep current): ");
                String year = sc.nextLine();
                if (!year.isEmpty()) {
                    book.setYearPublished(year);
                }

                System.out.println("Book updated successfully");
                System.out.println("Updated data: " + book);
                return;
            }
        }

        System.out.println("Book with code " + code + " not found");
    }

    public static void deleteBook() {
        System.out.print("Enter book code to delete: ");
        String code = sc.nextLine();

        for (Book book : books) {
            if (book.getCode().equals(code)) {
                books.remove(book);
                System.out.println("Book with code " + code + " deleted successfully");
                return;
            }
        }

        System.out.println("Book with code " + code + " not found");
    }

    public static void registerLoan() {
        System.out.print("Enter loan ID: ");
        String loanId = sc.nextLine();

        System.out.print("Enter client ID: ");
        String clientId = sc.nextLine();

        Client client = null;
        for (Client c : clients) {
            if (c.getId().equals(clientId)) {
                client = c;
                break;
            }
        }

        if (client == null) {
            System.out.println("Client with ID " + clientId + " not found");
            return;
        }

        System.out.print("Enter book code: ");
        String bookCode = sc.nextLine();

        Book book = null;
        for (Book b : books) {
            if (b.getCode().equals(bookCode)) {
                book = b;
                break;
            }
        }

        if (book == null) {
            System.out.println("Book with code " + bookCode + " not found");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book is not available for loan");
            return;
        }

        Loan loan = new Loan(loanId, client, book);
        loans.add(loan);

        System.out.println("Loan registered successfully");
        System.out.println("Loan ID: " + loanId);
        System.out.println("Client: " + client.getName());
        System.out.println("Book: " + book.getTitle());
        System.out.println("Date: " + loan.getDate());
        System.out.println("Status: " + loan.getStatus());
    }

    public static void returnLoan() {
        System.out.print("Enter loan ID: ");
        String loanId = sc.nextLine();

        for (Loan loan : loans) {
            if (loan.getLoanId().equals(loanId)) {
                if (!loan.getStatus().equals("Active")) {
                    System.out.println("This loan is already returned");
                    return;
                }

                loan.returnBook();
                System.out.println("Book returned successfully");
                System.out.println("Loan ID: " + loanId);
                System.out.println("Return date: " + loan.getDate());
                System.out.println("Status: " + loan.getStatus());
                return;
            }
        }

        System.out.println("Loan with ID " + loanId + " not found");
    }

}
