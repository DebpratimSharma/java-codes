# Migration Plan - Java 21 Upgrade

**Session ID:** 772297c6-bb68-44f5-9101-befe95c58e21

**Created:** 2025-12-12 11:54:17

**Target:** Upgrade project runtime to Java 21 (LTS)

**Detected Language:** java

**Uncommitted Changes Policy:** Always Stash

**Build tool detection:** No Maven or Gradle build files (pom.xml / build.gradle) detected. Project contains standalone Java sources.

**JDK environment:**
- Existing installed JDKs: Java 11 (system)
- Installed JDK 21 for migration: /home/debpratim/.jdk/jdk-21.0.8/bin

**Files discovered to consider for migration:**
- methods/Recursion.java
- methods/MethodOverloading.java
- methods/MyMethod.java
- data-structures/MyArrays.java
- intro/MyDetails.java
- intro/Reference.java
- college-classes/Bufferdata.java
- intro/MyString.java
- intro/MultiDimensionalArray.java
- college-classes/Complement.java
- intro/Intro.java
- intro/UserInput.java
- intro/UsingArray.java
- college-classes/Hybrid_Inheritance.java
- college-classes/SingletonPattern.java
- college-classes/CopyCons.java

**Plan (high level):**
1. Prepare environment: ensure JDK 21 is installed and JAVA_HOME set for build steps.
2. Compile all Java sources with JDK 21 (javac) and fix any language-level issues.
3. Update any source code incompatible with Java 21 (language/API changes) using automated recipes where possible.
4. Run unit tests (if any) or a small smoke compile/test harness.
5. Iterate on build/test fixes until stable.
6. Commit changes to branch `appmod/java-migration-20251212115417` (after stashing uncommitted changes as policy dictates).
7. Generate migration summary and finalize progress.

**Next immediate actions:**
- Create progress file and open it in preview mode.
- Stash uncommitted changes (policy: Always Stash) using version control tooling.
- Create branch `appmod/java-migration-20251212115417` and continue migration steps.
