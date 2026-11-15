<div align="center">

# Android Alarm Clock App | Multiple Alarms, Custom Tones & Snooze — ALARM-HY_KOUSHIK

ALARM-HY_KOUSHIK is an Android alarm clock application for creating and managing multiple alarms, selecting custom alarm tones, using snooze controls, and receiving system notifications. The project demonstrates Android application development with Java/Kotlin, Android SDK components, local storage, and a Material-style interface. It is suitable as a learning project or a starting point for a simple personal alarm app.


<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=28&duration=3000&pause=1000&color=6C63FF&center=true&vCenter=true&repeat=true&width=600&lines=Wake+Up+On+Time%2C+Every+Time!;Simple+%7C+Intuitive+%7C+Reliable;Android+Alarm+Application" alt="Typing SVG" />

[![Made with Love](https://img.shields.io/badge/Made%20with-❤️-red.svg)](https://github.com/koushik4475/ALARM-HY_KOUSHIK)
[![Android](https://img.shields.io/badge/Platform-Android-3DDC84?logo=android&logoColor=white)](https://www.android.com/)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![GitHub Stars](https://img.shields.io/github/stars/koushik4475/ALARM-HY_KOUSHIK?style=social)](https://github.com/koushik4475/ALARM-HY_KOUSHIK/stargazers)

<img width="100%" alt="divider" src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">

### 🎯 A Beautifully Crafted Android Alarm Application

*Built with precision, designed for simplicity*

</div>

---

## 📱 Application Preview

<div align="center">

<img width="900" alt="ALARM-HY_KOUSHIK Preview" src="https://github.com/user-attachments/assets/03ec43a9-db0e-4ff1-bc1a-2a762a16680b" />

<img width="100%" alt="divider" src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">

</div>

---

## ✨ Features That Make You Smile

<div align="center">

| 🎵 Feature | 📝 Description |
|:---|:---|
| ⏰ **Multiple Alarms** | Create and manage unlimited alarms with ease |
| 🎼 **Custom Tones** | Choose from a variety of delightful alarm sounds |
| 😴 **Snooze Magic** | Hit snooze for those precious extra minutes |
| 🕐 **Intuitive Time Picker** | Native Android time picker for seamless experience |
| 🔄 **Smart Toggle** | Enable or disable alarms with a simple switch |
| 🔔 **Push Notifications** | Never miss an alarm with system notifications |
| 🎨 **Material Design** | Clean, modern UI following Android guidelines |
| 🌙 **Background Running** | Alarms work even when the app is closed |

</div>

---

## 🛠️ Tech Stack

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)
![Material Design](https://img.shields.io/badge/Material%20Design-757575?style=for-the-badge&logo=material-design&logoColor=white)
![XML](https://img.shields.io/badge/XML-FF6600?style=for-the-badge&logo=xml&logoColor=white)
![SQLite](https://img.shields.io/badge/SQLite-07405E?style=for-the-badge&logo=sqlite&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)

</div>

<div align="center">

**Minimum SDK:** Android 5.0 (API Level 21) | **Language:** Java/Kotlin | **Architecture:** MVVM

</div>

---

## 🚀 Quick Start Guide

<details open>
<summary><b>📦 Installation Steps</b></summary>

### Prerequisites

- ✅ Android Studio (Latest version recommended)
- ✅ Android SDK (API Level 21+)
- ✅ Java JDK 8+ or Kotlin
- ✅ Android device or emulator

### Clone & Run

```bash
# Clone the repository
git clone https://github.com/koushik4475/ALARM-HY_KOUSHIK.git

# Navigate to project directory
cd ALARM-HY_KOUSHIK

# Open in Android Studio
# File → Open → Select project folder

# Sync Gradle files (automatic)
# Wait for sync to complete

# Run the app
# Click the green play button or press Shift + F10
```

</details>

<details>
<summary><b>📖 How to Use</b></summary>

### Setting an Alarm
1. 🎯 Tap the **"+"** button to add a new alarm
2. ⏰ Select your desired time using the time picker
3. 🎵 Choose your favorite alarm tone
4. 💾 Save and you're all set!

### Managing Alarms
- 🔄 **Toggle** alarms on/off with the switch
- ✏️ **Edit** alarms by long-pressing or tapping the edit icon
- 🗑️ **Delete** alarms by swiping or tapping delete

### When the Alarm Rings
- 🔔 You'll receive a notification with alarm sound
- ✋ Tap **"Dismiss"** to turn off
- 💤 Tap **"Snooze"** for 5-10 extra minutes of sleep

</details>

---

## 📂 Project Architecture

```
ALARM-HY_KOUSHIK/
│
├── 📱 app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/yourpackage/
│   │   │   │   ├── MainActivity.java/kt
│   │   │   │   ├── AlarmReceiver.java/kt
│   │   │   │   ├── AlarmAdapter.java/kt
│   │   │   │   └── AlarmModel.java/kt
│   │   │   │
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   ├── values/
│   │   │   │   ├── drawable/
│   │   │   │   └── raw/ (alarm sounds)
│   │   │   │
│   │   │   └── AndroidManifest.xml
│   │   │
│   │   └── androidTest/
│   │
│   └── build.gradle
│
├── gradle/
├── build.gradle
└── README.md
```

---

## ⚡ Key Components

<div align="center">

| Component | Purpose |
|:---|:---|
| 🎬 **Activities** | MainActivity, AddAlarmActivity |
| 📡 **Receivers** | AlarmReceiver for handling alarm triggers |
| 🔄 **Services** | Background alarm management |
| 📋 **Adapters** | RecyclerView adapter for alarm list |
| 📦 **Models** | AlarmModel data structure |

</div>

---

## 🔐 Required Permissions

```xml
✓ WAKE_LOCK              → Wake device when alarm triggers
✓ RECEIVE_BOOT_COMPLETED → Restore alarms after reboot
✓ VIBRATE                → Alarm vibration support
✓ USE_EXACT_ALARM        → Precise timing (Android 12+)
```

---

## 🎨 Customization Options

<div align="center">

| 🎯 What You Can Customize | 💡 How to Do It |
|:---|:---|
| 🎵 **Alarm Tones** | Add audio files to `res/raw/` |
| 🎨 **Themes** | Modify `res/values/colors.xml` |
| 🖼️ **UI Layouts** | Edit files in `res/layout/` |
| ⚙️ **Features** | Extend functionality in source code |
| 🔔 **Notifications** | Customize notification styles |

</div>

---

## 🔮 Future Enhancements

<div align="center">

- [ ] 🔁 Recurring alarms (daily, weekly, custom patterns)
- [ ] ⏸️ Multiple snooze interval options
- [ ] 🏷️ Alarm labels and custom descriptions
- [ ] 📈 Volume fade-in feature
- [ ] 🌤️ Weather integration
- [ ] 🌙 Dark theme support
- [ ] 💾 Backup and restore functionality
- [ ] 📱 Home screen widget
- [ ] 🧮 Math challenges to dismiss alarm
- [ ] 🎯 Location-based alarms

</div>

---

## 🤝 Contributing

<div align="center">

Contributions make the open-source community an amazing place to learn and create!

**Any contributions you make are greatly appreciated** ⭐

</div>

1. 🍴 Fork the Project
2. 🌿 Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. 💾 Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. 📤 Push to the Branch (`git push origin feature/AmazingFeature`)
5. 🎉 Open a Pull Request

---

## 📄 License

<div align="center">

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](LICENSE)

</div>

---

## 👨‍💻 Author

<div align="center">

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=500&size=24&duration=3000&pause=1000&color=F75C7E&center=true&vCenter=true&repeat=true&width=435&lines=Crafted+with+%E2%9D%A4%EF%B8%8F+by+Koushik" alt="Author" />

### **Koushik**

[![Portfolio](https://img.shields.io/badge/Portfolio-Visit%20Now-6C63FF?style=for-the-badge&logo=google-chrome&logoColor=white)](https://koushikhy.netlify.app)
[![GitHub](https://img.shields.io/badge/GitHub-Follow-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/koushik4475)
[![Phone](https://img.shields.io/badge/Phone-+91%209620968968-25D366?style=for-the-badge&logo=whatsapp&logoColor=white)](tel:+919620968968)

**📧 Let's Connect!**

🌐 Portfolio: [koushikhy.netlify.app](https://koushikhy.netlify.app)  
📱 Phone: [+91 9620968968](tel:+919620968968)  
💼 GitHub: [@koushik4475](https://github.com/koushik4475)

</div>

---

## 🙏 Acknowledgments

<div align="center">

- 💙 Android Developer Community for guidance and support
- 🎨 Material Design for UI/UX inspiration
- 🧑‍💻 Stack Overflow for problem-solving assistance
- 📚 Built as a learning exercise in Android development

</div>

---

<div align="center">

<img width="100%" alt="divider" src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">

### ⭐ If you found this project helpful, please give it a star!

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=20&duration=3000&pause=1000&color=6C63FF&center=true&vCenter=true&repeat=true&width=600&lines=Thanks+for+visiting!;Happy+Coding!+%F0%9F%9A%80;Don't+forget+to+%E2%AD%90+this+repo!" alt="Footer" />

**Made with ❤️ by [Koushik](https://koushikhy.netlify.app)**

<img width="100%" alt="divider" src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">

</div>
