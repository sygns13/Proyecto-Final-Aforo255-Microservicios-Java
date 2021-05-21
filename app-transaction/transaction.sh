echo **************************************************************
echo Generate JAR
echo **************************************************************
mvn clean package -DskipTests
echo **************************************************************
echo BUILD AND PUSH Docker
echo **************************************************************
docker stop microtransaction
docker rm  microtransaction
echo **************************************************************
docker  build -t crisfer13/app-transaction-v1 .
docker push  crisfer13/app-transaction-v1
echo **************************************************************
echo run image 
docker run -p 8082:8082 --name microtransaction --network aforo255-test -d crisfer13/app-transaction-v1
echo *************************************************************
echo End Process
echo *************************************************************