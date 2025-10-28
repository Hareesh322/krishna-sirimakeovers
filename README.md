# siri-makeovers-warangal (Krishna Animation Edition)

This repository contains a Spring Boot (Java 17) promotional application for **Siri Makeovers — Warangal** with a little Krishna animation on the Home page.

## Highlights
- Home (/): includes Little Krishna walking across the top holding a golden board that says "Siri Makeovers — Warangal" (fade-in 1.5s).
- Services (/services), Gallery (/gallery), Booking (/booking) pages.
- POST /api/bookings logs booking to console and returns confirmation.
- Java 17 (OpenJDK) + Spring Boot + Maven.
- Replace `src/main/resources/static/images/little-krishna.svg` with a final PNG or SVG artwork if desired.

## Run
```
mvn clean package
java -jar target/siri-makeovers-warangal-0.0.3-SNAPSHOT.jar
```

Open http://localhost:8080
# krishna-sirimakeovers
