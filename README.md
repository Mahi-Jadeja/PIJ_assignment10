# Java Threads Demonstration

## Overview

This project demonstrates the basic working of **threads** in Java using the `Thread` class.

## Files

- **Main.java**: The entry point of the program. Creates and starts two threads.
- **ThreadExample.java**: Defines a thread by extending the `Thread` class and overriding `run()`.

## Functional Description

- **ThreadExample(String name)**: Constructor to assign a name to each thread.
- **run()**: Prints five iterations with a sleep interval to show concurrent execution.
- **Main.main()**: Starts both threads and waits for them to complete using `join()`.

## How to Run

1. Compile: `javac threadexample/*.java`
2. Run: `java threadexample.Main`

## GitHub Repository

[GitHub Repository Link](https://github.com/your-username/JavaThreadsDemo)

_(Replace the link with your actual GitHub repo)_