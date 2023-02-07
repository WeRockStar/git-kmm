kmm-test:
	./gradlew shared:test
clean:
	./gradlew clean

droid-linter:
	./gradlew detekt
droid-test:
	./gradlew androidApp:test
droid-build:
	./gradlew androidApp:assDe
droid-all-test: kmm-test droid-test

ios-linter:
	swiftlint lint --strict
ios-build:
	xcodebuild -project iosApp/iosApp.xcodeproj \
	-scheme iosApp -configuration Debug \
	-sdk iphonesimulator \
	-destination 'platform=iOS Simulator,name=iPhone 14 Pro Max' build | xcbeautify
ios-test:
	xcodebuild -project iosApp/iosApp.xcodeproj \
	-scheme iosApp -configuration Debug \
	-sdk iphonesimulator \
	-destination 'platform=iOS Simulator,name=iPhone 14 Pro Max' test | xcbeautify
ios-all-test: kmm-test ios-test

all-build: droid-build ios-build
all-check: kmm-test droid-test droid-build ios-test ios-build