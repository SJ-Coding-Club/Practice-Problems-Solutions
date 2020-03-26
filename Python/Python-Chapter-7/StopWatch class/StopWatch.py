from datetime import datetime

class StopWatch:
    def __init__(self):
        self.__startTime = datetime.now().strftime("%H:%M:%S")
        self.__endTime = 0

    def getStartTime(self):
        return self.__startTime
    
    def getEndTime(self):
        return self.__endTime
    
    def start(self):
        now = datetime.now()
        current_time = float(now.strftime("%f")) / 1000
        self.__startTime = current_time
    
    def stop(self):
        now = datetime.now()
        current_time = float(now.strftime("%f")) / 1000
        self.__endTime = current_time
    
    def getElapsedTime(self):
        return self.getEndTime() - self.getStartTime()