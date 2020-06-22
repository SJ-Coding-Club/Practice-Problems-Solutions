// a runner runs 14 km in 45 min and 30 sec.
// compute their average speed in miles per hour
// 1.6 km = 1 mile
let kmToMiles = 1.6
var miles = 14 / kmToMiles
var hours = 45.0 / 60.0 + 30.0 / 3600.0
var speed = miles / hours
print("average speed is \(speed)")
