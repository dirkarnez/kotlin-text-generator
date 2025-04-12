@echo off

@REM %USERPROFILE%\Downloads\OpenJDK8U-jdk_x64_windows_hotspot_8u382b05\jdk8u382-b05\bin
set PATH=^
%USERPROFILE%\Downloads\kotlin-native-prebuilt-windows-x86_64-2.1.10\kotlin-native-prebuilt-windows-x86_64-2.1.10\bin;^
%USERPROFILE%\Downloads\OpenJDK11U-jdk_x64_windows_hotspot_11.0.26_4\jdk-11.0.26+4\bin

kotlinc-native.bat main.kt -o main
pause
