FROM ubuntu:22.10

RUN \
 apt update &&\
 apt dist-upgrade -f &&\
 apt install -y \
    wget \
    axel \
    curl \
    zip \
    unzip \
    vim &&\
 apt clean

RUN \
 rm /bin/sh &&\
 ln -s /bin/bash /bin/sh

# sdkman
RUN \
 curl -s "https://get.sdkman.io" | bash

RUN \
 source "$HOME/.sdkman/bin/sdkman-init.sh" &&\
 sdk install java 22.3.r19-grl &&\
 sdk install maven 3.8.8

# ide
# https://download-cdn.jetbrains.com/idea/ideaIC-2023.1.2.tar.gz