package za.ac.cput.Factory;

import za.ac.cput.Entity.Room;

/**
 * author: Llewelyn Klaase
 * student no: 216267072
 */

public class RoomFactory {

    public static Room build(String roomType, int roomCode, int roomCapacity, int roomFloor, int buildingID) {

        if(roomType.isEmpty() || roomCode <= 0 || roomCapacity <= 0 || roomFloor <= 0 || buildingID <= 0)
            return null;

        return new Room.RoomBuilder().setRoomType(roomType).setRoomCode(roomCode).setRoomCapacity(roomCapacity).setRoomFloor(roomFloor).setBuildingID(buildingID).build();
    }
}