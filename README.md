📒 Notes App – Android (Jetpack Compose + Room)

A modern Android Notes Application built using Jetpack Compose and Room Database.
This app allows users to create, view, and delete notes with persistent local storage.

🚀 Features

✍️ Add new notes

📋 View all saved notes

🗑️ Delete notes

💾 Offline storage using Room Database

🎨 Modern UI with Material 3

⚡ Built using Kotlin + Coroutines

🛠 Tech Stack

Language: Kotlin

UI Toolkit: Jetpack Compose

Architecture: MVVM

Database: Room

Asynchronous Programming: Kotlin Coroutines

Build Tool: Gradle

📂 Project Structure
NotesApp/
│
├── app/
│   ├── src/main/java/com/example/notesapp/
│   │   ├── MainActivity.kt
│   │   ├── data/
│   │   │   ├── Note.kt
│   │   │   ├── NoteDao.kt
│   │   │   └── NoteDatabase.kt
│   │   ├── viewmodel/
│   │   │   └── NoteViewModel.kt
│   │   └── ui/
│   │       └── NoteScreen.kt
│   │
│   ├── res/
│   └── AndroidManifest.xml
│
├── build.gradle
├── settings.gradle
└── README.md
⚙️ How to Run the Project
1️⃣ Clone the Repository
git clone https://github.com/your-username/NotesApp.git
2️⃣ Open in Android Studio

Open the project in Android Studio.

Recommended:

Android Studio Hedgehog or newer

Gradle 8.x

JDK 17

3️⃣ Sync Project

Let Gradle sync automatically.

4️⃣ Run the App

Connect Android device or start emulator

Click ▶ Run

🔄 Future Improvements

Update notes feature

Search functionality

Dark mode toggle

Export notes

Cloud sync integration

📌 Learning Objectives

This project demonstrates:

MVVM architecture implementation

Room database integration

State management in Compose

Coroutine usage with ViewModel

👩‍💻 Author

Pratiksha Chandure

📜 License

This project is for academic and learning purposes.
