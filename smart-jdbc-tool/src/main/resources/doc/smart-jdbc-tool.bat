@echo off
color 2
if "%1"=='' (java -jar smart-jdbc-tool.jar -g) else (java -jar smart-jdbc-tool.jar %1 %2 %3 %4 %5 %6)
pause