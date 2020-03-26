class Account:
    def __init__(self, id = 0, balance = 100, annualInterestRate = 0):
        self.__id = id
        self.__balance = balance
        self.__annualInterestRate = annualInterestRate
    
    def getId(self):
        return self.__id
    
    def getBalance(self):
        return self.__balance
    
    def getAnnualInterestRate(self):
        return self.__annualInterestRate
    
    def setId(self, id):
        self.__id = id
    
    def setBalance(self, balance):
        self.__balance = balance
    
    def setAnnualInterestRate(self, annualInterestRate):
        self.__annualInterestRate = annualInterestRate

    def getMonthlyInterestRate(self):
        return self.getAnnualInterestRate() / 1200

    def getMonthlyInterest(self):
        return self.getBalance() * self.getMonthlyInterestRate()
    
    def withdraw(self, amount):
        self.__balance -= amount
    
    def deposit(self, amount):
        self.__balance -= amount
