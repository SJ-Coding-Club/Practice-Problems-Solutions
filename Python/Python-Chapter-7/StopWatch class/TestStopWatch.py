from StopWatch import StopWatch

def main():
    stopwatch = StopWatch()
    stopwatch.start()
    sum = 0
    for i in range(1, 10000000):
        sum += i
    stopwatch.stop()
    elapsed_time = stopwatch.getElapsedTime()
    print(f"Time elapsed: {round(abs(elapsed_time), 2)} ms")

main()

