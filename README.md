# task-spring-boot-thymeleaf

Run sql query to create database

![image](https://user-images.githubusercontent.com/120351262/213962298-1ca82d0c-6bff-451c-afc2-4db7085a2496.png)

Input your username and password

![image](https://user-images.githubusercontent.com/120351262/213962329-100d0944-d26e-428a-acdd-58fc5d3bd637.png)

# Convert the Application to JAR File
Run this command in the current directory
`./mvnw clean package -DskipTests`
  
# Build docker file:
`docker build -t task-app .`

# Run the application:
`docker-compose up`

# Access Endpoint
http://localhost:8080
