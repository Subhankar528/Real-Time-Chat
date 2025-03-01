# Real-Time Chat Application

This is a real-time chat application built using **Spring Boot** for the backend and **HTML, JavaScript, and Bootstrap** for the frontend. It uses **WebSockets and STOMP** for real-time messaging.

---

## Features
- Real-time chat using WebSockets & STOMP
- Simple UI with Bootstrap
- STOMP-based message broker
- Dockerized for easy deployment

---

## Screenshot
![Screenshot](https://github.com/user-attachments/assets/28720bc2-8e4a-4b5e-ae64-6fce199e5992)
![Screenshot](https://github.com/user-attachments/assets/e0ea0473-cad4-4d5d-a99e-ea9c0e444971)

---

## Technologies Used
- **Backend:** Spring Boot, STOMP WebSockets
- **Frontend:** HTML, JavaScript, Bootstrap
- **WebSocket Client:** SockJS, STOMP.js
- **Containerization:** Docker

---

## Installation & Running Locally

### Prerequisites
- Java 17+
- Maven
- Docker (optional for containerized deployment)

### Steps
1. **Clone the Repository**
   ```sh
   git clone https://github.com/Subhankar528/Real-Time-Chat.git
   cd chat-app
   ```

2. **Build the Project**
   ```sh
   mvn clean package
   ```

3. **Run the Application**
   ```sh
   mvn spring-boot:run
   ```

4. **Access the Chat App**
   - Open `http://localhost:8080/chat` in your browser

---

## WebSocket Endpoints
| Endpoint            | Description                     |
|---------------------|--------------------------------|
| `/chat`            | STOMP WebSocket Endpoint       |
| `/app/sendMessage` | Client sends messages here     |
| `/topic/message`   | Broadcasts messages to clients |

---

## Docker Deployment

### Build Docker Image
```sh
docker build -t chat-app .
```

### Run Docker Container
```sh
docker run -p 8080:8080 chat-app
```

### Push to Docker Hub
Replace `your-dockerhub-username` with your actual username:
```sh
docker tag chat-app your-dockerhub-username/chat-app:latest
docker push your-dockerhub-username/chat-app:latest
```

---

## Future Enhancements
- Multi-room chat support
- User authentication
- Message persistence with database
- Web3 integration

---

## License
This project is open-source. Feel free to contribute! 🚀

