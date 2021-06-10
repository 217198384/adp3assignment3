package za.ac.cput.Entity;

/**
 * author: Llewelyn Klaase
 * student no: 216267072
 */

public class Room {

    private String roomType;
    private int roomCode, roomCapacity, roomFloor, buildingID;

    public Room(RoomBuilder room) {
        this.roomType = room.roomType;
        this.roomCode = room.roomCode;
        this.roomCapacity = room.roomCapacity;
        this.roomFloor = room.roomFloor;
        this.buildingID = room.buildingID;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType='" + roomType + '\'' +
                ", roomCode=" + roomCode +
                ", roomCapacity=" + roomCapacity +
                ", roomFloor=" + roomFloor +
                ", buildingID=" + buildingID +
                '}';
    }

    public static class RoomBuilder {

        private String roomType;
        private int roomCode, roomCapacity, roomFloor, buildingID;

        public RoomBuilder setRoomType(String roomType) {
            this.roomType = roomType;
            return this;
        }

        public RoomBuilder setRoomCode(int roomCode) {
            this.roomCode = roomCode;
            return this;
        }

        public RoomBuilder setRoomCapacity(int roomCapacity) {
            this.roomCapacity = roomCapacity;
            return this;
        }

        public RoomBuilder setRoomFloor(int roomFloor) {
            this.roomFloor = roomFloor;
            return this;
        }

        public RoomBuilder setBuildingID(int buildingID) {
            this.buildingID = buildingID;
            return this;
        }

        public Room build() { return new Room(this); }

        public RoomBuilder copy (Room room){
            this.roomType = room.roomType;
            this.roomCode = room.roomCode;
            this.roomCapacity = room.roomCapacity;
            this.roomFloor = room.roomFloor;
            this.buildingID = room.buildingID;

            return this;
        }
    }
}