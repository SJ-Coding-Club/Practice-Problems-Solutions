from Account import Account

def main():
    account = Account(1122, 20000, 4.5)
    account.withdraw(2500)
    account.deposit(3000)
    print(f"ID: {account.getId()}, Bal: {account.getBalance()}, "\
        f"Monthly Interest Rate: {account.getMonthlyInterestRate()}, "\
            f"Monthly Interest: {account.getMonthlyInterest()}.")

main()