# java-codes 💻☕️

A personal collection of Java programs I write while learning, experimenting, and practising different concepts.

[![JDK](https://img.shields.io/badge/JDK-21-informational)](https://adoptium.net/)

Whether you're just starting out or exploring new Java features, this repo contains small exercises, examples, and experiments grouped by topic.

---

## What you'll find
- **intro/** — beginner examples: strings, arrays, input
- **methods/** — method examples, overloading, recursion
- **data-structures/** — simple array utilities
- **college-classes/** — examples showing OOP concepts (constructors, inheritance, patterns)

## Quick start
Prerequisite: JDK 21 (or newer) installed. Set `JAVA_HOME` to your JDK and add `bin` to your `PATH`.

Compile all Java files in the repo:
```bash
export JAVA_HOME=/home/your-user/.jdk/jdk-21.0.8
$JAVA_HOME/bin/javac -d out $(find . -name "*.java")
```

Run a specific class (example `Intro`):
```bash
$JAVA_HOME/bin/java -cp out Intro
```

## Contributing
- Feel free to open issues or PRs with improvements or new example programs.
- Keep examples small and focused; add a short description for new folders or files.

## Tips
- Add a build tool (Maven or Gradle) if you want CI and dependency management.
- Add unit tests to make exercises reproducible and verifiable.

---

Happy coding! 🚀

