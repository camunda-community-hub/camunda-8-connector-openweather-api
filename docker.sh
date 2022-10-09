#!/bin/bash
docker run --rm --name=connectors -v $PWD/target/openweather-api-0.1.0-SNAPSHOT.jar:/opt/app/connector.jar --env-file env.txt camunda/connectors:0.2.0