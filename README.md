# yacht_Booking_System_APi_Spring_Boot
yacht_Booking_System_APi_Spring_Boot


# How can Run COde 
    * Run Docker at your device 
    * Go to /docker-compose.yml File and Build it to run database
    * Go to Java Main file and run project (8080)

=> Swagger Documentation End Point  for local : http://localhost:8080/swagger-ui/index.html
=> Swagger Documentation End Point  for docker image : http://localhost:8000/swagger-ui/index.html

# Simple Database Diagram 
![YachtBookinkSimple.drawio.png](..%2F..%2F..%2F..%2FDownloads%2FYachtBookinkSimple.drawio.png)

# to create new Docker image Run steps and be confirmed your docker is installed and run 
    
    - docker images 
    - docker build -t yachtbookingapi .
    - docker run -p 8000:8080 yachtbookingapi
    - docker container ls   #=>show all container run 