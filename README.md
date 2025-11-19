# LangSmith Java SDK Example

This project demonstrates how to use the LangSmith Java SDK with published JARs from Maven Central.

## Prerequisites

- Java 9 or higher
- Gradle 8.12 or higher (wrapper included)
- LangSmith API key

## Setup

1. Clone this repository:
```bash
git clone <your-repo-url>
cd langchain-java-test
```

2. Set your LangSmith API key as an environment variable:
```bash
export LANGSMITH_API_KEY=your_api_key
```

Optionally, you can also set:
```bash
export LANGSMITH_ENDPOINT=https://api.smith.langchain.com  # Optional, defaults to this
export LANGSMITH_PROJECT_ID=your-project-id  # Required for ListRunsExample
```

## Running Examples

### Dataset Example

Creates a dataset, adds examples, and then deletes it:

```bash
./gradlew run
```

Or explicitly:
```bash
./gradlew run --main-class=com.langchain.smith.example.DatasetExampleKt
```

### List Runs Example

Queries and lists runs from a LangSmith project:

```bash
export LANGSMITH_PROJECT_ID=your-project-id
./gradlew run --main-class=com.langchain.smith.example.ListRunsExampleKt
```

## Dependencies

This project uses the published LangSmith Java SDK from Maven Central:

```kotlin
implementation("com.langchain.smith:langsmith-java:0.1.0-alpha.12")
```

See: https://central.sonatype.com/artifact/com.langchain.smith/langsmith-java/0.1.0-alpha.12

## Project Structure

```
.
├── build.gradle.kts          # Gradle build configuration
├── settings.gradle.kts        # Gradle settings
├── gradle/                    # Gradle wrapper
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── src/
│   └── main/
│       └── kotlin/
│           └── com/
│               └── langchain/
│                   └── smith/
│                       └── example/
│                           ├── DatasetExample.kt
│                           └── ListRunsExample.kt
└── README.md
```

## Examples Overview

### DatasetExample

Demonstrates:
- Checking if a dataset exists by name
- Creating a new dataset
- Adding individual examples with inputs and outputs
- Bulk creating multiple examples
- Retrieving dataset information
- Deleting a dataset

### ListRunsExample

Demonstrates:
- Configuring run query parameters with filters
- Querying runs by project/session ID
- Iterating through and displaying run information

## Additional Resources

- [LangSmith Documentation](https://docs.langchain.com/langsmith)
- [LangSmith Java SDK GitHub](https://github.com/langchain-ai/langsmith-java)
- [Maven Central - langsmith-java](https://central.sonatype.com/artifact/com.langchain.smith/langsmith-java/0.1.0-alpha.12)

