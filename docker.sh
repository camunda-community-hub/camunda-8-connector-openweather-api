#!/bin/bash
docker run --rm --name=connectors -v $PWD/target/connectomr.jar:/opt/app/connector.jar --env-file env.txt camunda/connectors:0.2.0