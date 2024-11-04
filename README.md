# Mini ERP System

A simple ERP system built with Spring Boot and React, focused on managing companies, employees, and services.

## Project Structure

### Class Diagram
```mermaid
classDiagram
    class Person {
        <>
        -Long id
        -String firstName
        -String lastName
        -String idNumber
        -String phone
        -String email
        -String address
        +getId()
        +getFirstName()
        +getLastName()
    }

    class Employee {
        -String position
        -Double salary
        -Date hireDate
        -Boolean active
        +getPosition()
        +getSalary()
    }

    class Company {
        -Long id
        -String businessName
        -String tradeName
        -String taxId
        -String fiscalAddress
        -String phone
        -String email
        -Boolean active
        -List~Contact~ contacts
        +getId()
        +getBusinessName()
        +getContacts()
    }

    class Contact {
        -Long id
        -String firstName
        -String lastName
        -String position
        -String phone
        -String email
        +getId()
        +getName()
    }

    class Service {
        -Long id
        -String name
        -String description
        -Double basePrice
        -Boolean active
        +getId()
        +getName()
        +getBasePrice()
    }

    class ProvidedService {
        -Long id
        -Company company
        -Service service
        -Employee employee
        -Contact mainContact
        -Date startDate
        -Date endDate
        -Double finalPrice
        -String status
        +getId()
        +getCompany()
        +getService()
    }

    Person <|-- Employee: extends
    Company "1" -- "*" Contact: has
    Company "1" -- "*" ProvidedService: contracts
    Service "1" -- "*" ProvidedService: associated
    Employee "1" -- "*" ProvidedService: performs
    Contact "1" -- "*" ProvidedService: responsible
```

## Technologies Used
- Backend: Spring Boot 3.x
- Frontend: React + Vite
- Database: PostgreSQL (H2 for development)
- Deployment: Railway.app & Vercel

## Project Setup
[Setup instructions will be added as the project progresses]

## Features
- Company Management
- Employee Management
- Service Management
- Service Provision Tracking

## Development Status
🚧 Under Construction 🚧