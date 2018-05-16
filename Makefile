test:
	@./gradlew test

migrate:
	./gradlew flywayMigrate -i