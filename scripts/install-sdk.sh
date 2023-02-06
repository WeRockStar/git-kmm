#!/bin/sh

wget --quiet --output-document=android-sdk.zip https://dl.google.com/android/repository/commandlinetools-linux-${ANDROID_SDK_TOOLS}_latest.zip
unzip -d android-sdk-linux android-sdk.zip
rm android-sdk.zip
mkdir android-sdk-latest; pushd android-sdk-latest
mkdir cmdline-tools; pushd cmdline-tools
mkdir latest
popd; popd
mv android-sdk-linux/cmdline-tools/* android-sdk-latest/cmdline-tools/latest