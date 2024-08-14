
  
# SQL injection with the Room Persistence Library

![Intro](https://github.com/hahmadfaiq21/mobile-security/assets/74751720/2bf8a397-f755-4338-803e-12f8f9037c7d)

During Google I/O 2017 the Room Persistence Library was announced. Room is a new library built into Android that provides an abstraction on top of SQLite to allow easier database access without losing SQLite's functionality.

You can learn more about Room Persistence Library on:
https://developer.android.com/training/data-storage/room


![image](https://github.com/hahmadfaiq21/mobile-security/assets/74751720/3b9e548e-c8ae-4832-b030-11c46e01bbb4)

On the other hand, SQL injection attacks are well documented on the web, indeed, OWASP rank injection as their number 1 security concern in 2017. 
SQLite built into Android is also susceptible to client-side SQL injection attacks, putting any data you store locally at risk. It would be interesting to look at Room to see if it is possible to perform SQL injection attacks when using it.

# User Interface and Feature of Secret Notes

![Untitled-1](https://github.com/hahmadfaiq21/mobile-security/assets/74751720/a41d6046-7a54-434f-bb62-757897146ea2)


NB: Height of RecyclerView have to be adjusted to devices.


# How SQL injection Works in This App
<p align="center">
First, we have to create a New Note with Add Note Button. <br>
<img src="https://github.com/hahmadfaiq21/mobile-security/assets/74751720/3842eba7-596f-4e41-811c-96b4bd4b9a8a" width="360">
</p>
<p align="center">
Then, Create a note and PIN numbers. <br>
<img src="https://github.com/hahmadfaiq21/mobile-security/assets/74751720/7cb5aa24-eac5-4915-b797-193f2b6a6683" width="360">
<img src="https://github.com/hahmadfaiq21/mobile-security/assets/74751720/28860991-aca1-4a80-b4fa-6785d7c0d281" width="360"> <br>
</p>
<p align="center">
After that, type ' or 'x' = 'x then click **Search Button on the keyboard bar**. <br>
<img src="https://github.com/hahmadfaiq21/mobile-security/assets/74751720/015531ea-2b49-41dd-871d-2fe91e375cd0" width="360"> <br>
</p>
<p align="center">
Finally, you can see content of the note without entering PIN numbers. <br>
<img src="https://github.com/hahmadfaiq21/mobile-security/assets/74751720/f29ec6ef-2792-4e91-b845-557adc5942a7" width="360"> <br>
</p>

User Interface (UI) Design: <br>
https://www.figma.com/design/6ZlyeTgwAIpGikScmToGjO/SecretNotesApp?node-id=0-1&m=dev&t=yLPFY6iwxsKoRwOo-1
<br>

This project is based on Medium.com article, written by Matthew Dolan: <br>
https://appmattus.medium.com/android-security-sql-injection-with-the-room-persistence-library-69f4e286960f


