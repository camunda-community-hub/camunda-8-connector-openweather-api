# OpenWeather API Camunda 8 Connector

![Compatible with: Camunda Platform 8](https://img.shields.io/badge/Compatible%20with-Camunda%20Platform%208-0072Ce)
[![](https://img.shields.io/badge/Community%20Extension-An%20open%20source%20community%20maintained%20project-FF4700)](https://github.com/camunda-community-hub/community)
[![](https://img.shields.io/badge/Lifecycle-Proof%20of%20Concept-blueviolet)](https://github.com/Camunda-Community-Hub/community/blob/main/extension-lifecycle.md#proof-of-concept-)

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

The element template can be found in the [element-templates/template-connector.json](element-templates/template-connector.json) file.
