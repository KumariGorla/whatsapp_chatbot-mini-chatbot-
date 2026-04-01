WhatsApp Chatbot Backend Simulation built using Java and Spring Boot

This project simulates a simple chatbot backend that receives messages via a REST API and responds with predefined replies.

Features:
- REST API endpoint (/webhook) to handle POST requests
- Accepts JSON input simulating WhatsApp messages
- Responds with predefined messages (Hi → Hello, Bye → Goodbye)
- Logs incoming messages in the console
- Built using Spring Boot framework

Technologies Used:
- Java
- Spring Boot
- Maven

How to Run:
1. Clone the repository
2. Navigate to the project folder
3. Run using: mvnw.cmd spring-boot:run
4. Test API using postman:
   URL: http://localhost:8080/webhook
   Method: POST
   Body:
   {
     "message": "Hi"
   }

Expected Output:
{
  "reply": "Hello"
}

