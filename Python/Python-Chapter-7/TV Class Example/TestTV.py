from TV import TV

def main():
    tv1 = TV()
    tv1.turnOn()
    tv1.setChannel(10)
    tv1.setVolume(3)

    tv2 = TV()
    tv2.turnOn()
    tv2.channelUp()
    tv2.channelUp()
    tv2.volumeUp()

    print(f"tv1's channel is {tv1.getChannel()} and volume level is {tv1.getVolumeLevel()}.")
    print(f"tv2's channel is {tv2.getChannel()} and volume is {tv2.getVolumeLevel()}.") 

main() # Call the main function