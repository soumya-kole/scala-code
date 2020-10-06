package com.soumya.miscellaneous.com.soumya.variance

abstract class Vehicle{
  val name:String
}
case class Car(name: String) extends Vehicle
case class Bike(name: String) extends Vehicle

case class ParkingTicket[+T](vehicle: T, price: Int)

object ContraVariance extends App {

  def parkMyVehicle(p : ParkingTicket[Vehicle]): Unit = println(s"Parking your ${p.vehicle.name}")

  //get a car
  val c = Car("Mercedes")
  //take a ticket for the car
  val tkt = ParkingTicket(c, 2)
  //park the car with the ticket
  //Note - If your ParkingTicket is not covariant, then you will get an error here
  parkMyVehicle(tkt)

}
