FROM ghcr.io/graalvm/native-image:muslib-ol9-java11-22.3.2 as build
RUN \
 microdnf -y install \
  findutils

WORKDIR /application
COPY . .
RUN \
 ./gradlew nativeCompile &&\
 chmod +x /application/build/native/nativeCompile/queenSolver

# ---
FROM scratch
COPY --from=build /application/build/native/nativeCompile/queenSolver /queenSolver
ENTRYPOINT ["/queenSolver"]
CMD ["6"]
