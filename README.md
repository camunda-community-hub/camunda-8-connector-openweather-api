# OpenWeather API Camunda 8 Connector

A Camunda 8 Connector to retrieve data from the OpenWeather API.

## Build

```bash
mvn clean package
```

## API

### Input

```json
{
  "latitude": ".....",
  "longitude": ".....",
  "units": "....",
  "apiKey":"...."
}
```

### Output

```json
{
  "weather": {
    "forecast": "....",
    "code": "...."
  }
}
```

## Test locally

Run unit tests

```bash
mvn clean verify
```

Use the [Camunda Job Worker Connector Run-Time](https://github.com/camunda/connector-framework/tree/main/runtime-job-worker) to run your function as a local Job Worker.

## Element Template

The element templates can be found in the [element-templates/template-connector.json](element-templates/template-connector.json) file.
