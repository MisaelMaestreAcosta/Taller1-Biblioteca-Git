package App;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Client> clients = new ArrayList<>();
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

}
