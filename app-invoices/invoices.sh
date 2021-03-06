echo **************************************************************
echo Generate JAR
echo **************************************************************
mvn clean package -DskipTests
echo **************************************************************
echo BUILD AND PUSH Docker
echo **************************************************************
docker stop microinvoices
docker rm  microinvoices
echo **************************************************************
docker  build -t crisfer13/app-invoices-v1 .
docker push  crisfer13/app-invoices-v1
echo **************************************************************
echo run image 
docker run -p 8081:8081 --name microinvoices --network aforo255-test -d crisfer13/app-invoices-v1
echo *************************************************************
echo End Process
echo *************************************************************