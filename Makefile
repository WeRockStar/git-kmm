clean:
	./gradlew clean

droid-test:
	./gradlew androidApp:test

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

all-check: droid-all-test ios-test ios-build