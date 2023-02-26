Create public key in PKCS12 format:
============================================
"C:\Users\Raju\.jdks\openjdk-19.0.2\bin\keytool.exe"  -genkeypair -alias ismailraju -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore ismailraju.p12 -validity 3650


Create public key in .jks format(not recommanded):
==================================================
keytool -genkeypair -alias baeldung -keyalg RSA -keysize 2048 -keystore baeldung.jks -validity 3650

Convert .jks to pk12 ( if needed )
======================================
keytool -importkeystore -srckeystore ismailraju.jks -destkeystore ismailraju.p12 -deststoretype pkcs12


Convert p12 to .crt
==========================
"C:\Users\Raju\.jdks\openjdk-19.0.2\bin\keytool.exe" -keystore ismailraju.p12 -storetype pkcs12 -exportcert -file ismailraju.crt -rfc -alias ismailraju
# for java9 up omit -storetype pkcs12 -- it's now default
# -rfc gives PEM form; omit for DER form
# can omit -alias $name if 'friendlyname' is mykey --
# but that's likely only for stores created _with_ keytool
# because other tools and users mostly don't use that name


usefull app:
https://hohnstaedt.de/xca/
