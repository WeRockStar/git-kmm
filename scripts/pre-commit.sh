#!/bin/sh

KOTLIN_FILES_CHANGED="$(git --no-pager diff --name-status --no-color --cached | awk '$1 != "D" && $2 ~ /\.kts|\.kt/ { print $2}')"
SWIFT_FILES_CHANGED="$(git --no-pager diff --name-status --no-color --cached | awk '$1 != "D" && $2 ~ /\.swift/ { print $2}')"
ALL_LANGUAGE_FILES_CHANGED="$(git --no-pager diff --name-status --no-color --cached | awk '$1 != "D" && $2 ~ /\.kt/ && $2 ~ /\.swift/ { print $2}')"

if [ "$ALL_LANGUAGE_FILES_CHANGED" ]; then
  echo "Run all unit tests"
  make kmm-test ios-test droid-test
  echo "Completed"
  exit 0
fi

if [ "$KOTLIN_FILES_CHANGED" ]; then
  echo "Run all android unit tests"
  make droid-all-test
  echo "Completed"
  exit 0
fi

if [ "$SWIFT_FILES_CHANGED" ]; then
  echo "Run all ios unit tests"
  make ios-all-test
  echo "Completed"
  exit 0
fi

echo "No Kotlin and Swift files changed"