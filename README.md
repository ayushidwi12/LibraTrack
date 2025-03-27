📚 Digital Library Book Management System
A simple and efficient Java-based library management system.

🚀 Project Overview
The Digital Library Book Management System helps users manage books efficiently. It includes features like adding, updating, deleting, and searching books. Built using Java and packaged as an executable JAR file, this system is easy to deploy and run.

📂 Project Structure
Digital Library Book Management System/
│── src/  # Source code files
│── target/  # Compiled JAR files (output)
│── pom.xml  # Maven configuration file
│── README.md  # Project documentation
│── .gitignore  # Git ignore rules

⚙️ Prerequisites
Before running the project, ensure you have the following installed:

✅ Java 17 (from pom.xml) → [Download](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
✅ Maven 3.8.6 (from pom.xml) → [Download](https://maven.apache.org/download.cgi)
✅ Git (optional, if cloning from GitHub) → [Download](https://git-scm.com/downloads)

🛠️ How to Run the Project?

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

1️⃣ Clone the repository:
```sh
git clone https://github.com/rohitmanola/Digital-Library-Book-Management-System.git
cd Digital-Library-Book-Management-System
```

2️⃣ Build the JAR file using Maven:
```sh
mvn clean package
```

3️⃣ Run the newly generated JAR file:
```sh
java -jar target/DigitalLibrary-1.0-SNAPSHOT.jar
```
👉 If required, run with dependencies:
```sh
java -jar target/DigitalLibrary-1.0-SNAPSHOT-jar-with-dependencies.jar
```

### Copying the JAR File to Another System
To copy and run the JAR file on another system:

1️⃣ Copy the JAR file using SCP (for Linux/Mac):
```sh
scp target/DigitalLibrary-1.0-SNAPSHOT-jar-with-dependencies.jar user@remote-server:/path/to/destination
```

Or use USB/Google Drive to transfer the file.

2️⃣ On the target system, ensure Java is installed and run:
```sh
java -jar DigitalLibrary-1.0-SNAPSHOT-jar-with-dependencies.jar
```

🌐 Deploying the JAR File

✅ **Replit (Quick and Free)**
1. Go to [Replit](https://replit.com/)
2. Create a new Java Repl
3. Upload your JAR file to the Replit project
4. Run the command:
```sh
java -jar DigitalLibrary-1.0-SNAPSHOT-jar-with-dependencies.jar
```
5. Share the public link: [Replit Deployment](https://replit.com/@rohitmanola2024/DigitalLibraryManagement?v=1)

✅ **Render (For Public Cloud Deployment)**
1. Sign up at [Render](https://render.com/)
2. Create a new Web Service
3. Upload the JAR file
4. Set the Start Command to:
```sh
java -jar DigitalLibrary-1.0-SNAPSHOT-jar-with-dependencies.jar
```
5. Click Deploy and get a Live URL!

📌 Key Features
✔️ Add, Update, Delete Books
✔️ Search Books by Title/Author
✔️ Optimized for Performance
✔️ Packaged as an Executable JAR
✔️ Easy to Deploy Anywhere

📜 License
This project is open-source and free to use! 🚀

📞 Need Help?
Feel free to raise an issue in the GitHub repository or contact me at manolarohit24@gmail.com 😊

🎉 Enjoy Using the Digital Library Book Management System! 🚀📖

