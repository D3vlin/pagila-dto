# Pagila DTO

## 📌 Overview
**Pagila DTO** is part of a modular project built on top of the Pagila sample database schema for PostgreSQL.  
This module provides a collection of **Data Transfer Objects (DTOs)** that represent structured data contracts used across application layers.

The goal of this project is to demonstrate a clean, scalable, and professional architecture using a real-world relational schema as the foundation.

---

## 🎯 Purpose
This module exists to:

- Provide immutable or controlled data representations
- Decouple persistence entities from API and service layers
- Define clear data contracts between modules
- Enable safer serialization/deserialization
- Prevent leaking internal entity structure

DTOs are especially useful when:

- exposing APIs
- transferring data between services
- shaping responses
- validating inputs

---

## 🧱 Project Architecture Context

This repository contains only the **DTO module** of the Pagila ecosystem.

The full architecture is intentionally split across multiple repositories, where each module is independently versioned, published, and maintained.

Related modules live in separate repositories:

| Module | Responsibility | Repository |
|------|----------------|-----------|
| dto | Data transport | https://github.com/D3vlin/pagila-dto |
| entity | Database mapping | https://github.com/D3vlin/pagila-entity |
| mapper | Data access | https://github.com/D3vlin/pagila-mapper |

---

### Architectural Philosophy
Each module is isolated in its own repository to achieve:

- independent versioning
- loose coupling
- clear boundaries
- reusable artifacts
- microservice readiness
- simplified dependency graphs

This repository specifically publishes the **DTO contract layer**, which is intended to be consumed by any service or application needing structured Pagila data representations.

---

## 🚀 Why a Dedicated DTO Module?

Separating DTOs into their own artifact allows:

- reuse across services
- independent versioning
- safer refactoring
- cleaner dependencies
- easier testing
- microservice compatibility

---

## 📚 Use Cases

This module can be consumed by:

- REST APIs
- Messaging systems
- Batch jobs
- External clients
- Frontend adapters

---

## 🔗 Dependency Usage (Maven)

```xml
<dependency>
    <groupId>co.co.d3vlin</groupId>
    <artifactId>pagila-dto</artifactId>
    <version>1.0.0</version>
</dependency>}
```

---

## 🧠 Philosophy

This project is not just a demo.

It is designed to model **real production architecture patterns**, including:

- modularization  
- separation of concerns  
- clean boundaries  
- scalable layering  
- versioned artifacts
