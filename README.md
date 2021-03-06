# gamesense-essentials
Essential OLED integrations for SteelSeries Gamesense.

This programs adds the following to your SteelSeries OLED screen:

- A clock
- Volume slider when changing
- Supports Spotify, iTunes, MusicBee, AIMP and YouTube Music Desktop App for displaying current artist and song

[Download for Windows](https://github.com/mtricht/gamesense-essentials/releases/download/1.6.0/gamesense-essentials-1.6.0.msi)  

## Demo
Video: https://streamable.com/7wnmt  
<img src="https://raw.githubusercontent.com/mtricht/gamesense-essentials/master/photos/clock.png" width="450" />  
<img src="https://raw.githubusercontent.com/mtricht/gamesense-essentials/master/photos/volume.png" width="450" />

## Run on windows startup
To run after boot, create a shortcut to gamesense-essentials inside the "Startup" folder. Follow this [tutorial](https://www.howtogeek.com/208224/how-to-add-programs-files-and-folders-to-system-startup-in-windows-8.1/) if you're having trouble.

## Tick rate
Starting with v1.3.0, the tick rate/delay is now configurable through the system tray icon. This value determines how many times per second the OLED screen is updated.
The default on windows is 50 milliseconds and on macOS 200 milliseconds.

This is because the lower the number, the higher the CPU usage will be. For my 8-core gaming desktop, 50 milliseconds is barely noticeable, but for my macbook pro, 50 milliseconds is way too fast and the CPU fans will go crazy.   
