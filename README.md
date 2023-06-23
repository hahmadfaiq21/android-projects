# SQL injection with the Room Persistence Library

![Intro](https://github.com/hahmadfaiq21/mobile-security/assets/74751720/2bf8a397-f755-4338-803e-12f8f9037c7d)

During Google I/O 2017 the Room Persistence Library was announced. Room is a new library built into Android that provides an abstraction on top of SQLite to allow easier database access without losing SQLite's functionality. You can learn more about Room Persistence Library on:
https://developer.android.com/training/data-storage/room

On the other hand, SQL injection attacks are well documented on the web, indeed, OWASP rank injection as their number 1 security concern in 2017. 
SQLite built into Android is also susceptible to client-side SQL injection attacks, putting any data you store locally at risk.

As such, I thought it would be interesting to look at Room to see if it is possible to perform SQL injection attacks when using it.

This project is based on Medium.com article, written by Matthew Dolan
https://appmattus.medium.com/android-security-sql-injection-with-the-room-persistence-library-69f4e286960f
