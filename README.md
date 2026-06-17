
# Spring Boot Code Review & Refactor Exercise

## Problem Statement
You are given a simple Spring Boot REST API that allows creating and retrieving notes.

The current implementation has several issues related to:
- Code structure
- Error handling
- Security
- Test quality
- Maintainability

Your task is to review and refactor the code.

---

## Instructions (15–20 mins)

1. Review the code and identify issues.
2. Call out problems (design, security, testing, etc.).
3. Refactor parts of the code where possible.
4. If you run out of time, explain what else you would improve.

Focus on:
- Clean code & structure
- Validation
- Error handling
- Thread safety
- Test improvements

---

## How to Run the Application

### Prerequisites
- Java 17+
- Maven

### Run the app
```bash
mvn spring-boot:run
```

### Test the API

Create a note:
```bash
curl -X POST http://localhost:8080/notes \
  -H "Content-Type: application/json" \
  -d '{"title":"Test","content":"Hello"}'
```

Get a note:
```bash
curl http://localhost:8080/notes/{id}
```

---

## Notes
You do NOT need to complete everything. Focus on what you think matters most.
