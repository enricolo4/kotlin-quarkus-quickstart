# kotlin-quarkus-quickstart

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./gradlew :main:quarkusDev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./gradlew :main:build
```

It produces the `quarkus-run.jar` file in the `build/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `build/quarkus-app/lib/` directory.

The application is now runnable using `java -jar build/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./gradlew :main:build -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar build/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./gradlew :main:build -Dquarkus.native.enabled=true -Dquarkus.packge.jar.enabled=false
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./gradlew :main:build -Dquarkus.native.enabled=true -Dquarkus.native.container-build=true -Dquarkus.packge.jar.enabled=false
```

You can then execute your native executable with: `./main/build/kotlin-quarkus-quickstart-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/gradle-tooling>.

## Related Guides

- Messaging ([guide](https://quarkus.io/guides/messaging)): Produce and consume messages and implement event driven and data streaming applications
- REST ([guide](https://quarkus.io/guides/rest)): A Jakarta REST implementation utilizing build time processing and Vert.x. This extension is not compatible with the quarkus-resteasy extension, or any of the extensions that depend on it.
- Hibernate ORM with Panache and Kotlin ([guide](https://quarkus.io/guides/hibernate-orm-panache-kotlin)): Define your persistent model in Hibernate ORM with Panache
- Confluent Schema Registry - Avro ([guide](https://quarkus.io/guides/kafka-schema-registry-avro)): Use Confluent as Avro schema registry
- Kotlin ([guide](https://quarkus.io/guides/kotlin)): Write your services in Kotlin
- YAML Configuration ([guide](https://quarkus.io/guides/config-yaml)): Use YAML to configure your Quarkus application
- Hibernate ORM with Panache ([guide](https://quarkus.io/guides/hibernate-orm-panache)): Simplify your persistence code for Hibernate ORM via the active record or the repository pattern
- Apache Avro ([guide](https://quarkus.io/guides/kafka-schema-registry-avro)): Provide support for the Avro data serialization system
- Kafka Streams Processor ([guide](https://docs.quarkiverse.io/quarkus-kafka-streams-processor/dev/index.html)): Easily build resilient Kafka Streams topologies based on the Processor API
- JDBC Driver - PostgreSQL ([guide](https://quarkus.io/guides/datasource)): Connect to the PostgreSQL database via JDBC

## Provided Code

### YAML Config

Configure your application with YAML

[Related guide section...](https://quarkus.io/guides/config-reference#configuration-examples)

The Quarkus application configuration is located in `src/main/resources/application.yml`.

### Hibernate ORM

Create your first JPA entity

[Related guide section...](https://quarkus.io/guides/hibernate-orm)

[Related Hibernate with Panache section...](https://quarkus.io/guides/hibernate-orm-panache)

[Related Hibernate with Panache in Kotlin section...](https://quarkus.io/guides/hibernate-orm-panache-kotlin)

### REST

Easily start your REST Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
