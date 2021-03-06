echo **************************************************************
echo Generate JAR
echo **************************************************************
mvn clean package -DskipTests
echo **************************************************************
echo BUILD AND PUSH Docker
echo **************************************************************
docker stop microconfigserver
docker rm  microconfigserver
echo **************************************************************
docker  build -t crisfer13/app-configserver-v1 .
docker push  crisfer13/app-configserver-v1
echo **************************************************************
echo run image 
docker run -p 8888:8888 --name microconfigserver --network aforo255-test -d crisfer13/app-configserver-v1
echo *************************************************************
echo End Process
echo *************************************************************