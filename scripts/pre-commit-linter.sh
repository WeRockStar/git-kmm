#!/bin/sh

KOTLIN_FILES_CHANGED="$(git --no-pager diff --name-status --no-color --cached | awk '$1 != "D" && $2 ~ /\.kts|\.kt/ { print $2}')"
SWIFT_FILES_CHANGED="$(git --no-pager diff --name-status --no-color --cached | awk '$1 != "D" && $2 ~ /\.swift/ { print $2}')"
ALL_LANGUAGE_FILES_CHANGED="$(git --no-pager diff --name-status --no-color --cached | awk '$1 != "D" && $2 ~ /\.kt/ && $2 ~ /\.swift/ { print $2}')"

if [ "$ALL_LANGUAGE_FILES_CHANGED" ]; then
  echo "Run linter for iOS and Android"
  make droid-linter ios-linter
  echo "Completed"
  exit 0
fi

if [ "$KOTLIN_FILES_CHANGED" ]; then
  echo "Run linter on Android"
  make droid-linter
  echo "Completed"
  exit 0
fi

if [ "$SWIFT_FILES_CHANGED" ]; then
  echo "Run linter on iOS"
  make ios-linter
  echo "Completed"
  exit 0
fi

echo "No Kotlin and Swift files changed"