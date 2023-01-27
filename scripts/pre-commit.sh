#!/bin/sh

KOTLIN_FILES_CHANGED="$(git --no-pager diff --name-status --no-color --cached | awk '$1 != "D" && $2 ~ /\.kts|\.kt/ { print $2}')"
SWIFT_FILES_CHANGED="$(git --no-pager diff --name-status --no-color --cached | awk '$1 != "D" && $2 ~ /\.swift/ { print $2}')"
ALL_LANGUAGE_FILES_CHANGED="$(git --no-pager diff --name-status --no-color --cached | awk '$1 != "D" && $2 ~ /\.kt/ && $2 ~ /\.swift/ { print $2}')"

if [ "$ALL_LANGUAGE_FILES_CHANGED" ]; then
  make kmm-test ios-test droid-test
  exit 0
fi

if [ "$KOTLIN_FILES_CHANGED" ]; then
  make droid-all-test
  exit 0
fi

if [ "$SWIFT_FILES_CHANGED" ]; then
  make ios-all-test
  exit 0
fi
