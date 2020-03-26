from Loan import Loan

def main():
    # Enter yearly interest rate
    annualInterestRate = eval(input
        ("Enter yearly interest rate, for example, 7.25: "))
    
    # Enter number of years
    numberOfYears = eval(input(
        "Enter number of years as an integer: "))
    
    # Enter loan amount
    loanAmount = eval(input(
        "Enter loan amount, for example, 120000.95: "))

    # Enter a borrower
    borrower = input("Enter a borrower's name: ")

    # Create a Loan object
    loan = Loan(annualInterestRate, numberOfYears, 
        loanAmount, borrower)

    # Display loan date, monthly payment, and total payment
    print(f"The loan is for {loan.getBorrower()}")
    print(f"The monthly payment is {loan.getMonthlyPayment()}")
    print(f"The total payment is {loan.getTotalPayment()}")

main() # Call the main function