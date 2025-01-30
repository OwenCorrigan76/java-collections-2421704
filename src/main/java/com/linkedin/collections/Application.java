package com.linkedin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Application {

	public static void main(String[] args) {

		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room manchester = new Room("Manchester", "Suite", 5, 250.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);
		Room victoria = new Room("Victoria", "Suite", 5, 225.00);

		Collection<Room> rooms = new ArrayList<>(Arrays.asList(cambridge, oxford, victoria, manchester));
		oxford.setPetFriendly(true);
		victoria.setPetFriendly(true);

        // can't remove from loop. hence add to an arraylist and remove the arraylist after the loop
        Collection<Room> removeRoom = new ArrayList<>();
		for(Room room : rooms) {
			if(room.isPetFriendly()) {
				removeRoom.add(room);
			}
		}
        rooms.removeAll(removeRoom);
        rooms.forEach(r -> System.out.println(r.getName()));

        // this is the same as above - you can remove from loop using iterator
        Iterator<Room> iterator = rooms.iterator();
        for(Room room : rooms) {
            if(room.isPetFriendly()) {
                iterator.remove();
            }
        }
        rooms.forEach(r -> System.out.println(r.getName()));
    }
}
