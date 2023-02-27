#Create   key store in PKCS12 format(recommended):
===================================================
```"C:\Users\Raju\.jdks\openjdk-19.0.2\bin\keytool.exe"  -genkeypair -alias ismailraju -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore ismailraju.p12 -validity 3650```


#Create key store in .jks format(not recommended):
==================================================
```keytool -genkeypair -alias baeldung -keyalg RSA -keysize 2048 -keystore baeldung.jks -validity 3650```

#Convert .jks to pk12 ( if needed )
===================================
```keytool -importkeystore -srckeystore ismailraju.jks -destkeystore ismailraju.p12 -deststoretype pkcs12```


#Convert p12 (key store) to .crt (certificate)
================================================
```"C:\Users\Raju\.jdks\openjdk-19.0.2\bin\keytool.exe" -keystore ismailraju.p12 -storetype pkcs12 -exportcert -file ismailraju.crt -rfc -alias ismailraju```


#Convert p12(key store) to private.key (private key)
===========================================================
```openssl pkcs12 -in ismailraju.p12  -nodes -nocerts -out key.pem```


#Convert p12 to public.crt (certificate)
==========================
```openssl pkcs12 -in ismailraju.p12  -nokeys -out cert.pem```



#usefull app:
======================
https://hohnstaedt.de/xca/



```curl --cacert ismailraju.crt -v https://localhost:8443/welcome```