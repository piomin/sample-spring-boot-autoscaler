# Spring Boot Autoscaler Demo Project [![Twitter](https://img.shields.io/twitter/follow/piotr_minkowski.svg?style=social&logo=twitter&label=Follow%20Me)](https://twitter.com/piotr_minkowski)

[![CircleCI](https://circleci.com/gh/piomin/sample-spring-boot-autoscaler.svg?style=svg)](https://circleci.com/gh/piomin/sample-spring-boot-autoscaler)

[![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-black.svg)](https://sonarcloud.io/dashboard?id=piomin_sample-spring-boot-autoscaler)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=piomin_sample-spring-boot-autoscaler&metric=bugs)](https://sonarcloud.io/dashboard?id=piomin_sample-spring-boot-autoscaler)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=piomin_sample-spring-boot-autoscaler&metric=coverage)](https://sonarcloud.io/dashboard?id=piomin_sample-spring-boot-autoscaler)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=piomin_sample-spring-boot-autoscaler&metric=ncloc)](https://sonarcloud.io/dashboard?id=piomin_sample-spring-boot-autoscaler)

In this project I'm demonstrating how to scale up and scale down number of running instances of your Spring Boot application by the Jenkins pipeline. Jenkins integrates with discovery based on Spring Cloud Netflix Eureka, and endpoints provided Spring Boot Actuator. 

The example is available in the branch [master](https://github.com/piomin/sample-spring-boot-autoscaler/tree/master). A detailed guide may be find in the following article: [Spring Boot Autoscaler](https://piotrminkowski.com/2018/09/18/spring-boot-autoscaler/)
