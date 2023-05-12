ARG GRAALVM_DOCKER_IMAGE
FROM ghcr.io/graalvm/native-image:${GRAALVM_DOCKER_IMAGE} as build
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
