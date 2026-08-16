# 🚗 Smart Parking Management System (SPMS)

A Microservices-based Smart Parking Management System developed using Spring Boot and Spring Cloud. This system allows users to register, manage vehicles, allocate parking spaces, and process parking payments.

---

## 📌 Project Overview

The Smart Parking Management System is designed using the Microservices Architecture. Each service is independently deployable and communicates through the API Gateway while registering with Eureka Service Registry.

---

## 🛠 Technologies Used

- Java 21
- Spring Boot
- Spring Cloud
- Spring Cloud Gateway
- Spring Cloud Config Server
- Eureka
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok
- Postman
- Git & GitHub

---

# 🏗 System Architecture

```
Client
   │
   ▼
API Gateway
   │
   ├──────────────┐
   │              │
   ▼              ▼
User Service   Vehicle Service
   │              │
   ├──────────────┤
   │              │
Parking Service  Payment Service

        │
        ▼

    MySQL Database

        ▲
        │

Config Server
        │

Eureka Server
```

---

# 📂 Microservices

## 1️⃣ Eureka Server

Responsible for Service Discovery.

Default URL

```
http://localhost:8761
```

---

## 2️⃣ Config Server

Provides centralized configuration for all microservices.

Default Port

```
8888
```

---

## 3️⃣ API Gateway

Routes client requests to the corresponding microservices.

Default Port

```
8080
```

---

## 4️⃣ User Service

Port

```
8081
```

Features

- User Registration
- User Login
- User CRUD Operations

Database

```
spms_user_db
```

---

## 5️⃣ Vehicle Service

Port

```
8083
```

Features

- Register Vehicle
- Update Vehicle
- Delete Vehicle
- View Vehicle

Database

```
spms_vehicle_db
```

---

## 6️⃣ Parking Space Service

Port

```
8084
```

Features

- Allocate Parking
- Update Parking
- Release Parking
- Parking CRUD

Database

```
spms_parking_db
```

---

## 7️⃣ Payment Service

Port

```
8084
```

Features

- Create Payment
- Update Payment
- Delete Payment
- Payment History

Database

```
spms_payment_db
```

---

# 📡 API Endpoints

## User Service

| Method | Endpoint |
|---------|----------|
| POST | /api/v1/users/register |
| POST | /api/v1/users/login |
| GET | /api/v1/users |
| GET | /api/v1/users/{id} |
| PUT | /api/v1/users/{id} |
| DELETE | /api/v1/users/{id} |

---

## Vehicle Service

| Method | Endpoint |
|---------|----------|
| POST | /api/v1/vehicles |
| GET | /api/v1/vehicles |
| GET | /api/v1/vehicles/{id} |
| PUT | /api/v1/vehicles/{id} |
| DELETE | /api/v1/vehicles/{id} |

---

## Parking Service

| Method | Endpoint |
|---------|----------|
| POST | /api/v1/parking |
| GET | /api/v1/parking |
| GET | /api/v1/parking/{id} |
| PUT | /api/v1/parking/{id} |
| DELETE | /api/v1/parking/{id} |

---

## Payment Service

| Method | Endpoint |
|---------|----------|
| POST | /api/v1/payments |
| GET | /api/v1/payments |
| GET | /api/v1/payments/{id} |
| PUT | /api/v1/payments/{id} |
| DELETE | /api/v1/payments/{id} |

---

# 💾 Databases

| Service | Database |
|----------|----------|
| User Service | spms_user_db |
| Vehicle Service | spms_vehicle_db |
| Parking Service | spms_parking_db |
| Payment Service | spms_payment_db |

---

# ▶️ How to Run

## Step 1

Start MySQL Server

---

## Step 2

Run Eureka Server

```
http://localhost:8761
```

---

## Step 3

Run Config Server

```
Port : 8888
```

---

## Step 4

Run API Gateway

```
Port : 8080
```

---

## Step 5

Run all Microservices

- User Service
- Vehicle Service
- Parking Service
- Payment Service

---

# 🧪 API Testing

All APIs were tested using Postman.


## Postman Testing

You may also include screenshots of

- User CRUD
- Vehicle CRUD
- Parking CRUD
- Payment CRUD

---

# 📁 Project Structure

```
SPMS
├── eureka-server
├── config-server
├── api-gateway
├── user-service
├── vehicle-service
├── parking-space-service
└── payment-service
```

---

# 👩‍💻 Developer

**Name**

Thakshila Kavindi
IJSE - Institute of Software Engineering
GDSE74



