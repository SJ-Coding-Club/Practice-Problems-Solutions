from Stock import Stock

def main():
    stock = Stock("INTC", "Intel Corporation",
        20.5, 20.35)
    print(f"Stock symbol: {stock.getSymbol()},"\
        f"Stock name: {stock.getName()}, Percent change: {round(stock.getChangePercent(), 2)}%")
    
main()