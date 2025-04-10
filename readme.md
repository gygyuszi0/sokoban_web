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
    sh install.sh
    ```
5. A szoftver indítása
    ``` sh
    sh run.sh
    ```

### 1.2. Docker változat

1. Docker konfigurálása a host OS-nek megfelelően.
2. Ezen repository klónozása
3. A repository gyökerében a docker-image buildelése
    ``` sh
    docker 
    ```
4. Az elkészült image futtatása
    ``` sh
    docker
    ```