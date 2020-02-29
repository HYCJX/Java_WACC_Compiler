all:
	./gradlew build -x test
clean:
	./gradlew clean

.PHONY: all clean