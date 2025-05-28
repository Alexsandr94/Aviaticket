import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    public void testSortTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("DME", "LED", 1500, 12, 14);
        Ticket ticket2 = new Ticket("DME", "LED", 2200, 11, 16);
        Ticket ticket3 = new Ticket("GDZ", "ROV", 1000, 15, 18);
        Ticket ticket4 = new Ticket("DME", "MSK", 1800, 7, 9);
        Ticket ticket5 = new Ticket("MSK", "GDZ", 1200, 5, 6);
        Ticket ticket6 = new Ticket("DME", "LED", 1100, 10, 14);
        Ticket ticket7 = new Ticket("GDZ", "LED", 1300, 12,15);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("DME", "LED");
        Ticket[] expected = {ticket6, ticket1, ticket2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTickets2() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("DME", "LED", 1500, 12, 14);
        Ticket ticket2 = new Ticket("DME", "LED", 2200, 11, 16);
        Ticket ticket3 = new Ticket("GDZ", "ROV", 1000, 15, 18);
        Ticket ticket4 = new Ticket("DME", "MSK", 1800, 7, 9);
        Ticket ticket5 = new Ticket("MSK", "GDZ", 1200, 5, 6);
        Ticket ticket6 = new Ticket("DME", "LED", 1100, 10, 14);
        Ticket ticket7 = new Ticket("GDZ", "LED", 1300, 12,15);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("DME", "LA");
        Ticket[] expected = { };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTickets3() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("DME", "LED", 1500, 12, 14);
        Ticket ticket2 = new Ticket("DME", "LED", 2200, 11, 16);
        Ticket ticket3 = new Ticket("GDZ", "ROV", 1000, 15, 18);
        Ticket ticket4 = new Ticket("DME", "MSK", 1800, 7, 9);
        Ticket ticket5 = new Ticket("MSK", "GDZ", 1200, 5, 6);
        Ticket ticket6 = new Ticket("DME", "LED", 1100, 10, 14);
        Ticket ticket7 = new Ticket("GDZ", "LED", 1300, 12,15);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("MSK", "GDZ");
        Ticket[] expected = {ticket5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTickets4() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("DME", "LED", 1500, 12, 14);//3
        Ticket ticket2 = new Ticket("DME", "LED", 2200, 11, 16);//7
        Ticket ticket3 = new Ticket("GDZ", "ROV", 1000, 15, 18);//5
        Ticket ticket4 = new Ticket("DME", "MSK", 1800, 7, 9); //2
        Ticket ticket5 = new Ticket("MSK", "GDZ", 1200, 5, 6); //1
        Ticket ticket6 = new Ticket("DME", "LED", 1100, 10, 14);//6
        Ticket ticket7 = new Ticket("GDZ", "LED", 1300, 12,15);//4
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("DME", "LED", comparator);
        Ticket[] expected = {ticket1, ticket6, ticket2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTickets5() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("DME", "LED", 1500, 12, 14);
        Ticket ticket2 = new Ticket("DME", "LED", 2200, 11, 16);
        Ticket ticket3 = new Ticket("GDZ", "ROV", 1000, 15, 18);
        Ticket ticket4 = new Ticket("DME", "MSK", 1800, 7, 9);
        Ticket ticket5 = new Ticket("MSK", "GDZ", 1200, 5, 6);
        Ticket ticket6 = new Ticket("DME", "LED", 1100, 10, 14);
        Ticket ticket7 = new Ticket("GDZ", "LED", 1300, 12,15);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("LED", "DME", comparator);
        Ticket[] expected = { };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTickets6() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("DME", "LED", 1500, 12, 14);
        Ticket ticket2 = new Ticket("DME", "LED", 2200, 11, 16);
        Ticket ticket3 = new Ticket("GDZ", "ROV", 1000, 15, 18);
        Ticket ticket4 = new Ticket("DME", "MSK", 1800, 7, 9);
        Ticket ticket5 = new Ticket("MSK", "GDZ", 1200, 5, 6);
        Ticket ticket6 = new Ticket("DME", "LED", 1100, 10, 14);
        Ticket ticket7 = new Ticket("GDZ", "LED", 1300, 12,15);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("MSK", "GDZ", comparator);
        Ticket[] expected = {ticket5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTickets7() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("DME", "LED", 1500, 12, 14);
        Ticket ticket2 = new Ticket("DME", "LED", 2200, 10, 12);
        Ticket ticket3 = new Ticket("GDZ", "ROV", 1000, 15, 18);
        Ticket ticket4 = new Ticket("DME", "MSK", 1800, 7, 9);
        Ticket ticket5 = new Ticket("MSK", "GDZ", 1200, 5, 6);
        Ticket ticket6 = new Ticket("DME", "LED", 1100, 10, 14);
        Ticket ticket7 = new Ticket("GDZ", "LED", 1300, 12,15);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("DME", "LED", comparator);
        Ticket[] expected = {ticket1, ticket2, ticket6};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTickets8() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("DME", "LED", 1500, 12, 14);
        Ticket ticket2 = new Ticket("DME", "LED", 2200, 10, 12);
        Ticket ticket3 = new Ticket("GDZ", "ROV", 1000, 15, 18);
        Ticket ticket4 = new Ticket("DME", "MSK", 1800, 7, 9);
        Ticket ticket5 = new Ticket("MSK", "GDZ", 1200, 5, 6);
        Ticket ticket6 = new Ticket("DME", "LED", 1100, 10, 14);
        Ticket ticket7 = new Ticket("GDZ", "LED", 1300, 12, 15);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        
        Ticket[] actual = manager.findAll();
        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTickets9() {
        Ticket ticket1 = new Ticket("DME", "LED", 1500, 12, 14);
        Ticket ticket2 = new Ticket("DME", "LED", 1500, 12, 14);
        Ticket ticket3 = new Ticket("GDZ", "ROV", 1000, 15, 18);
        Ticket ticket4 = new Ticket("DME", "MSK", 1800, 7, 9);
        Ticket ticket5 = new Ticket("MSK", "GDZ", 1200, 5, 6);
        Ticket ticket6 = new Ticket("DME", "LED", 1100, 10, 14);
        Ticket ticket7 = new Ticket("GDZ", "LED", 1300, 12, 15);

        assertEquals(ticket1, ticket2);
        assertNotEquals(ticket1, ticket3);
        assertNotEquals(ticket1, ticket4);
        assertNotEquals(ticket1, null);
        assertEquals(ticket1, ticket1);
    }

    @Test
    public void testSortTickets10() {
        Ticket ticket1 = new Ticket("DME", "LED", 1500, 12, 14);
        Ticket ticket2 = new Ticket("DME", "LED", 1500, 12, 14);
        Ticket ticket3 = new Ticket("GDZ", "ROV", 1000, 15, 18);
        Ticket ticket4 = new Ticket("DME", "MSK", 1800, 7, 9);
        Ticket ticket5 = new Ticket("MSK", "GDZ", 1200, 5, 6);
        Ticket ticket6 = new Ticket("DME", "LED", 1100, 10, 14);
        Ticket ticket7 = new Ticket("GDZ", "LED", 1300, 12, 15);

        assertEquals(ticket1.hashCode(), ticket2.hashCode());
    }

    @Test
    public void testSortTickets11() {
        Ticket ticket1 = new Ticket("DME", "LED", 1500, 12, 14);
        Ticket ticket2 = new Ticket("DME", "LED", 1500, 12, 14);
        Ticket ticket3 = new Ticket("GDZ", "ROV", 1000, 15, 18);
        Ticket ticket4 = new Ticket("DME", "MSK", 1800, 7, 9);
        Ticket ticket5 = new Ticket("MSK", "GDZ", 1200, 5, 6);
        Ticket ticket6 = new Ticket("DME", "LED", 1100, 10, 14);
        Ticket ticket7 = new Ticket("GDZ", "LED", 1300, 12, 15);

        // При равных ценах должен возвращать 0
        assertEquals(0, ticket1.compareTo(ticket2));
    }

    @Test
    public void testSortTickets12() {
        Ticket ticket = new Ticket("DME", "LED", 1500, 12, 14);

        assertEquals("DME", ticket.getFrom());
        assertEquals("LED", ticket.getTo());
        assertEquals(1500, ticket.getPrice());
        assertEquals(12, ticket.getTimeFrom());
        assertEquals(14, ticket.getTimeTo());
    }

    @Test
    public void testSortTickets13() {
        Ticket ticket1 = new Ticket("DME", "LED", 200, 10, 15);
        String notATicket = "This is not a Ticket";
        assertFalse(ticket1.equals(notATicket));
    }

    @Test
    public void testSortTickets14() {
        Ticket ticket1 = new Ticket("DME", "LED", 200, 10, 15);
        Ticket ticket2 = new Ticket("GDZ", "LED", 200, 10, 15);
        assertFalse(ticket1.equals(ticket2)); // Разные аэропорты отправления
    }

    @Test
    public void testSortTickets15() {
        Ticket ticket1 = new Ticket("DME", "LED", 200, 10, 15);
        Ticket ticket2 = new Ticket("DME", "GDZ", 200, 10, 15);
        assertFalse(ticket1.equals(ticket2)); // Разные аэропорты назначения
    }

    @Test
    public void testSortTickets16() {
        Ticket ticket1 = new Ticket("DME", "LED", 200, 10, 15);
        Ticket ticket2 = new Ticket("DME", "LED", 300, 10, 15);
        assertFalse(ticket1.equals(ticket2)); // Разная цена
    }

    @Test
    public void testSortTickets17() {
        Ticket ticket1 = new Ticket("DME", "LED", 200, 10, 15);
        Ticket ticket2 = new Ticket("DME", "LED", 200, 12, 15);
        assertFalse(ticket1.equals(ticket2)); // Разное время вылета
    }

    @Test
    public void testSortTickets18() {
        Ticket ticket1 = new Ticket("DME", "LED", 200, 10, 15);
        Ticket ticket2 = new Ticket("DME", "LED", 200, 10, 18);
        assertFalse(ticket1.equals(ticket2));
    }// Разное время прилёта
}