# NightTimeTemperature
NightTimeTemperature

Development: Eclipse, java 8

Test steps:


step 1:  run command under project root -- build dev gradle profile with excluding all the tests
gradle -PbuildProfile=dev build -x test -x integrationTest
check if the dev jar file exists under NightTimeTemperature\build\libs and NightTimeTemperature\docker-compose\dev

step 2: build qa gradle profile with excluding all the tests
gradle -PbuildProfile=qa build -x test  -x integrationTest
check if the  qa file exists under NightTimeTemperature\build\libs and NightTimeTemperature\docker-compose\qa


Step 3: run below command to start container and image for both dev and qa
docker-compose  -f docker-compose-dev.yml -f docker-compose-qa.yml up


Test the mock service within 1 minute as I set Thread.sleep(60000)
check dev mock mock-night-time-temperature service
http://localhost:8050/mock-night-time-temperature

check qa night-time-temperature service
http://localhost:8060/night-time-temperature?lat=43.66258321585993&lng=-79.39152689466948


Step 4 execute junit test and integration-test respectively or both


gradle clean -PbuildProfile=qa build -x test  
gradle clean -PbuildProfile=qa build -x integrationTest
gradle clean -PbuildProfile=qa build 

check test reports under  \build\reports\tests
