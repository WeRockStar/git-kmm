#!/bin/sh

pushd ..
./gradlew androidApp:test
popd