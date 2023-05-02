package ru.netology.TicketManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {

    @Test
    public void testSortTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("City1", "City2", 20_000, 11, 13);
        Ticket ticket2 = new Ticket("City1", "City2", 10_000, 12, 15);
        Ticket ticket3 = new Ticket("City1", "City3", 20_000, 11, 17);
        Ticket ticket4 = new Ticket("City1", "City2", 40_000, 8, 8);
        Ticket ticket5 = new Ticket("City3", "City2", 80_000, 5, 10);
        Ticket ticket6 = new Ticket("City1", "City2", 20_000, 7, 11);
        Ticket ticket7 = new Ticket("City4", "City5", 30_000, 16, 19);
        Ticket ticket8 = new Ticket("City1", "City2", 50_000, 8, 9);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket2, ticket1, ticket6, ticket4, ticket8};
        Ticket[] actual = manager.search("City1", "City2");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortTicketsWithComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("City1", "City2", 20_000, 11, 13);
        Ticket ticket2 = new Ticket("City1", "City2", 10_000, 12, 15);
        Ticket ticket3 = new Ticket("City1", "City3", 20_000, 11, 17);
        Ticket ticket4 = new Ticket("City1", "City2", 40_000, 8, 18);
        Ticket ticket5 = new Ticket("City3", "City2", 80_000, 5, 10);
        Ticket ticket6 = new Ticket("City1", "City2", 20_000, 7, 11);
        Ticket ticket7 = new Ticket("City4", "City5", 30_000, 16, 19);
        Ticket ticket8 = new Ticket("City1", "City2", 50_000, 8, 9);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket8, ticket1, ticket2, ticket6, ticket4};
        Ticket[] actual = manager.search("City1", "City2", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTicketsWithComparator1() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("City1", "City2", 20_000, 11, 13);
        Ticket ticket2 = new Ticket("City1", "City2", 10_000, 12, 15);
        Ticket ticket3 = new Ticket("City1", "City3", 20_000, 11, 17);
        Ticket ticket4 = new Ticket("City1", "City2", 40_000, 8, 18);
        Ticket ticket5 = new Ticket("City3", "City2", 80_000, 5, 10);
        Ticket ticket6 = new Ticket("City1", "City2", 20_000, 7, 11);
        Ticket ticket7 = new Ticket("City4", "City5", 30_000, 16, 19);
        Ticket ticket8 = new Ticket("City1", "City2", 50_000, 8, 9);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket7};
        Ticket[] actual = manager.search("City4", "City5", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTicketsWithComparator0() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("City1", "City2", 20_000, 11, 13);
        Ticket ticket2 = new Ticket("City1", "City2", 10_000, 12, 15);
        Ticket ticket3 = new Ticket("City1", "City3", 20_000, 11, 17);
        Ticket ticket4 = new Ticket("City1", "City2", 40_000, 8, 18);
        Ticket ticket5 = new Ticket("City3", "City2", 80_000, 5, 10);
        Ticket ticket6 = new Ticket("City1", "City2", 20_000, 7, 11);
        Ticket ticket7 = new Ticket("City4", "City5", 30_000, 16, 19);
        Ticket ticket8 = new Ticket("City1", "City2", 50_000, 8, 9);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = manager.search("City4", "City3", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }
}
