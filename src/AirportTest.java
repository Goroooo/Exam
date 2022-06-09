import model.Plane;
import service.PlaneService;

public class AirportTest {
    public static void main(String[] args) {

        PlaneService service = new PlaneService();
        Plane p1 = service.create();
        Plane p2 = service.create();
        Plane p3 = service.create();
        Plane[] planes = {p1, p2, p3};

        service.planeInfo(p1); //Task1

        service.planeIfMilitary(p1); //Task2

        Plane plan = service.newerPlane(p1, p2); //Task3
        plan.printInfo();

        Plane plane2 = service.biggerWingspan(p1, p2); //Task4
        plane2.printInfo();

        service.smallestSeats(p1, p2); //Task5

        service.notMilitary(planes); //Task6
        service.moreThen100(planes);




        Plane plane = service.minimalWeight(planes); //Task8
        plane.printInfo();

        Plane plane3 = service.militaryMinimal(planes); //Task9
        plane3.printInfo();

        service.ascendingPlanes(planes); //10

    }
}
