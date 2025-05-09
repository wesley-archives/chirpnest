# 🐦 Chirpnest

A simple social media post manager built in Java using **JDBC** and **PostgreSQL**.
This project was created as a learning tool to practice **SQL operations**, **JDBC connections**, and building a clean **console-based CRUD app** in Java, following the **MVC pattern**.

## 📖 Table of Contents

* [Features](#features)
* [Get Started](#get-started)
* [Usage Example](#usage-example)
* [Contributing](#contributing)
* [License](#license)

## ✨ Features

* Basic **CRUD operations** for managing posts
* Interactive **terminal menu**
* Clean and modular Java code following the **MVC structure**
* Uses **JDBC** for direct SQL execution
* PostgreSQL database managed via **Docker Compose**
* Clear separation of **controllers**, **services**, **repositories**, and **entities**
* Built-in logging of SQL queries executed (via Hibernate)

## 🚀 Get Started

### Prerequisites

* Java 17+
* Maven
* Docker & Docker Compose

### Running the project

1. **Clone the repository**

   ```bash
   git clone https://github.com/wesleybertipaglia/chirpnest.git
   ```

2. **Navigate to the project directory**

   ```bash
   cd chirpnest
   ```

3. **Start the database with Docker Compose**

   ```bash
   docker-compose up -d
   ```

4. **Build the project**

   ```bash
   mvn clean install
   ```

5. **Run the app**

   ```bash
   mvn exec:java -Dexec.mainClass="com.wesleybertipaglia.Main"
   ```

## 📌 Usage Example

```plaintext
-------------------------------------
🐦 CHIRPNEST POST MENU
-------------------------------------

1. List all posts
2. View post details
3. Create a new post
4. Update a post
5. Delete a post
0. Exit

Choose an option: 1

--- Posts ---
📝 1 wesley 
My first post...

📝 2 wesley
Just another post...
```

## 🤝 Contributing

Contributions are welcome!
If you have any suggestions or improvements, feel free to open an issue or submit a pull request.

## 📄 License

This project is licensed under the **MIT License**. See the `LICENSE` file for more details.

Aqui está um modelo de README adaptado para o seu projeto **Chirpnest**!
