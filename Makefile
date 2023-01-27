clean:
	./gradlew clean

droid-test:
	./gradlew androidApp:test
droid-build:
	./gradlew androidApp:assDe

kmm-test:
	./gradlew shared:test

droid-all-test: kmm-test droid-test

ios-build:
	xcodebuild -project iosApp/iosApp.xcodeproj \
	-scheme iosApp -configuration Debug \
	-sdk iphonesimulator \
	-destination 'platform=iOS Simulator,name=iPhone 14 Pro Max' build

ios-test:
	xcodebuild -project iosApp/iosApp.xcodeproj \
	-scheme iosApp -configuration Debug \
	-sdk iphonesimulator \
	-destination 'platform=iOS Simulator,name=iPhone 14 Pro Max' test

ios-all-test: kmm-test ios-test

all-build: droid-build ios-build
all-check: kmm-test droid-test droid-build ios-test ios-build