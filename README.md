# custom-operation
This maven project provides an interface to write a custom operation, later to be integrated within the Platalytics Platform.

## Steps
1. Clone the project
2. Create a separate package to code the basic functionality of operation
3. Implement a `Main` class and extend it from the `Operation` interace already provided
4. Implement the `run` method of interface
5. Compile the project using `mvn clean install`
6. Upload the resultant **fat-jar** on Platalytics Platform

## Scope Resolution
Always create a unique package for each separate operation. 
Package name should precede `com.platalytics.platform.custom`.
A process must not contain two different custom operations with the same qualified `Main` class.

## Dependency Managment
Always provide the scope of **Spark** dependencies as *provided*, since they are automatically loaded by the platform at run time. Do not import transitive dependencies separately. If your job fails due to a dependency conflict, it might already be added by the platform and therefore should not be included within the **fat-jar**.  
