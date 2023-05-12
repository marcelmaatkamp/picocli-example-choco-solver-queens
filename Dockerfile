FROM ghcr.io/graalvm/native-image:muslib-ol9-java11-22.3.2
RUN \
 microdnf -y install findutils

COPY . .
RUN \
 ./gradlew nativeCompile
