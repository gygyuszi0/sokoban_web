# Sokoban Web

*Györgyi Gyula PTI Bsc lebelező - Szakdolgozati munka*

## 1. Demo indítása

Az alább leírt módszer egy demo verziót indít az alkalmazásból, 
amely semmilyen perzisztens adatot nem tárol és nem olvas be.

### 1.1. Natív indítás

1. Debian 12 operációs rendszer [letöltés](https://cdimage.debian.org/debian-cd/current/amd64/iso-cd/debian-12.10.0-amd64-netinst.iso)
2. Debian telepítése default beállításokkal.
3. Ezen repository klónozása HTTPS segítségével.
4. Szükséges csomagok telepítése és fordítása
    ``` sh
    \. install.sh
    ```
5. A szoftver indítása
    ``` sh
    \. run.sh
    ```

Egy előre telepített debian image elérhető az alábbi linken, 
amely `VirtualBox Version 7.1.4 r165100 (Qt6.5.3)` verzióval készült.

Az image nem tartalmazza a forráskódot, 
a szoftver a fentebbi lépések segítségével hozható működésbe.

Az egyetlen elérhető felhasználó jelszava `admin`

[letöltő link]