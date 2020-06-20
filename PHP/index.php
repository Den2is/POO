<?php
require_once("car.php");
require_once("uberX.php");
require_once("UberPool.php");
require_once("account.php");

$uberX = new UberX("CVB345", new Account("Alexandro","AX32"), "Chevrolet", "Spark");
$uberX->printDateCar();

$uberPool = new UberPool("WEDS12", new Account("MArtin","MLO567"), "Dodge", "Chispita");
$uberPool->printDataCar();
?>
