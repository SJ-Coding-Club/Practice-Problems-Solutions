# Chapter 3 #9
name = input("Enter employee's name:")
hours = eval(input("Enter number of hours worked in a week:"))
hourlyPay = eval(input("Enter hourly pay rate:"))
federalTaxWithholdingRate = eval(input("Enter federal tax withholding rate:"))
stateTaxWithholdingRate = eval(input("Enter state tax withholding rate:"))
print("Name: " + name)
print("Hours Worked", hours)
print("Pay rate: $" + str(hourlyPay))
print("Gross pay: $" + str(hourlyPay * hours))
print("Deductions:")
print("  Federal Witholding (" + str(federalTaxWithholdingRate) + "%): $" +
      str(round(federalTaxWithholdingRate * (hourlyPay * hours), 2)))
print("  State Withholding (" + str(stateTaxWithholdingRate) + "%): $" +
      str(round(stateTaxWithholdingRate * (hourlyPay * hours), 2)))
print("  Total Deduction: $" + str(round(federalTaxWithholdingRate * (hourlyPay * hours)
                                         + stateTaxWithholdingRate * (hourlyPay * hours), 2)))
