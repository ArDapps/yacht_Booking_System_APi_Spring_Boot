# yacht_Booking_System_APi_Spring_Boot
yacht_Booking_System_APi_Spring_Boot


# How can Run COde 
    * Run Docker at your device 
    * Go to /docker-compose.yml File and Build it to run database
    * Go to Java Main file and run project (8080)

=> Swagger Documentation End Point  for docker image : http://localhost:8080/swagger-ui/index.html

# Simple Database Diagram 
![YachtBookinkSimple drawio (1)](https://github.com/ArDapps/yacht_Booking_System_APi_Spring_Boot/assets/91119772/6b417a4e-accb-4043-9607-4cd4b3fdd0b2)


# to create new Docker image Run steps and be confirmed your docker is installed and run 
    
//LOCAL 
    - docker images 
    - docker build -t yachtbookingapi .
    - docker run -p 8000:8080 yachtbookingapi
    - docker container ls   #=>show all container run 

//Push to docker Hub
- Craete repo at docker hub with special name ex(mrbebo/yachtbookingapi)
- docker build -t mrbebo/yachtbookingapi
- docker push  mrbebo/yachtbookingapi
