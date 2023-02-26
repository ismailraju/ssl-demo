#Create public key in PKCS12 format:
============================================
"C:\Users\Raju\.jdks\openjdk-19.0.2\bin\keytool.exe"  -genkeypair -alias ismailraju -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore ismailraju.p12 -validity 3650


#Create public key in .jks format(not recommanded):
==================================================
keytool -genkeypair -alias baeldung -keyalg RSA -keysize 2048 -keystore baeldung.jks -validity 3650

#Convert .jks to pk12 ( if needed )
======================================
keytool -importkeystore -srckeystore ismailraju.jks -destkeystore ismailraju.p12 -deststoretype pkcs12


#Convert p12 to .crt
==========================
"C:\Users\Raju\.jdks\openjdk-19.0.2\bin\keytool.exe" -keystore ismailraju.p12 -storetype pkcs12 -exportcert -file ismailraju.crt -rfc -alias ismailraju
 


#usefull app:
======================
https://hohnstaedt.de/xca/
