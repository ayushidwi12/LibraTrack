# 📚 Digital Library Book Management System
A simple and efficient Java-based library management system.

## 🚀 Project Overview
The Digital Library Book Management System helps users manage books efficiently. It includes features like adding, updating, deleting, and searching books. Built using Java and packaged as an executable JAR file, this system is easy to deploy and run.

## 📂 Project Structure
```
Digital Library Book Management System/
│── src/               # Source code files
│── target/            # Compiled JAR files (output)
│── pom.xml            # Maven configuration file
│── README.md          # Project documentation
│── .gitignore         # Git ignore rules
```

## ⚙️ Prerequisites
Before running the project, ensure you have the following installed:
✅ Java 22 (or latest LTS version) → [Download](https://www.oracle.com/java/technologies/javase-downloads.html)  
✅ Maven → [Download](https://maven.apache.org/download.cgi)  
✅ Git (optional, if cloning from GitHub) → [Download](https://git-scm.com/)  

## 🛠️ How to Run the Project?

### Option 1: Run Locally (Using the JAR file)
1️⃣ Clone the repository (or download ZIP manually):
```sh
git clone https://github.com/rohitmanola/Digital-Library-Book-Management-System.git
cd Digital-Library-Book-Management-System
```

2️⃣ Navigate to the JAR file location (inside the `target/` directory):
```sh
cd target/
```

3️⃣ Run the application using Java:
```sh
java -jar DigitalLibrary-1.0-SNAPSHOT.jar
```
👉 If you need all dependencies included, run:
```sh
java -jar DigitalLibrary-1.0-SNAPSHOT-jar-with-dependencies.jar
```

### Option 2: Build and Run Manually (For Developers)
1️⃣ Clone the repository
```sh
git clone https://github.com/rohitmanola/Digital-Library-Book-Management-System.git
cd Digital-Library-Book-Management-System
```

2️⃣ Build the JAR file using Maven
```sh
mvn clean package
```

3️⃣ Run the newly generated JAR file
```sh
java -jar target/DigitalLibrary-1.0-SNAPSHOT.jar
```
👉 If required, run with dependencies:
```sh
java -jar target/DigitalLibrary-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## 🌐 Deploying the JAR File

### ✅ Replit (For Code Sharing & Manual Execution)
Since this is a **CLI-based application**, Replit does not provide a public URL to interact with it directly. However, you can still share the Replit project link so others can view and run it manually:

**Replit Project Link:** [Digital Library Management System on Replit](https://replit.com/@rohitmanola2024/DigitalLibraryManagement?v=1)

**Steps to Run on Replit:**
1️⃣ Open the Replit link above.
2️⃣ Click on the "Run" button.
3️⃣ The CLI interface will be available inside Replit’s shell.

### ✅ Deploy on a Cloud Service that Supports CLI Interaction
For public cloud deployment with CLI interaction, you can use **Google Cloud Run with Web Terminal Support**:

#### Steps to Deploy on Google Cloud Run:
1️⃣ **Containerize the Application** using Docker:
```dockerfile
FROM openjdk:22
COPY target/DigitalLibrary-1.0-SNAPSHOT-jar-with-dependencies.jar /app.jar
CMD ["java", "-jar", "/app.jar"]
```

2️⃣ **Build and Push the Docker Image** to Google Container Registry:
```sh
docker build -t gcr.io/YOUR_PROJECT_ID/digital-library .
docker push gcr.io/YOUR_PROJECT_ID/digital-library
```

3️⃣ **Deploy to Cloud Run:**
```sh
gcloud run deploy digital-library --image=gcr.io/YOUR_PROJECT_ID/digital-library --platform=managed --region=us-central1 --allow-unauthenticated
```

4️⃣ **Access the Web Terminal (if needed):**
- Google Cloud Run does not support direct terminal interaction, so you may need to integrate a web-based shell like Apache Guacamole or a lightweight web UI to accept inputs.

📌 **Key Features**
✔️ Add, Update, Delete Books  
✔️ Search Books by Title/Author  
✔️ Optimized for Performance  
✔️ Packaged as an Executable JAR  
✔️ Easy to Deploy Anywhere  

📜 **License**
This project is open-source and free to use! 🚀

📞 **Need Help?**
Feel free to raise an issue in the GitHub repository or contact me at manolarohit24@gmail.com 😊

🎉 **Enjoy Using the Digital Library Book Management System! 🚀📖**

