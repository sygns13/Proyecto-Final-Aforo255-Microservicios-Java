echo **************************************************************
echo Generate JAR
echo **************************************************************
mvn clean package -DskipTests
echo **************************************************************
echo BUILD AND PUSH Docker
echo **************************************************************
docker stop micropay
docker rm  micropay
echo **************************************************************
docker  build -t crisfer13/app-pay-v1 .
docker push  crisfer13/app-pay-v1
echo **************************************************************
echo run image 
docker run -p 8006:8006 --name micropay --network aforo255-test -d crisfer13/app-pay-v1
echo *************************************************************
echo End Process
echo *************************************************************