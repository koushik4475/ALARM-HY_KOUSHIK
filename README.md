# ALARM-HY_KOUSHIK

A simple and intuitive Android alarm application built as a learning project using Android Studio.

## 📱 Preview

<img width="1920" height="1080" alt="flipkartphp" src="https://github.com/user-attachments/assets/03ec43a9-db0e-4ff1-bc1a-2a762a16680b" />


## 🎯 About

This is a simple Android alarm application created as a practice project to demonstrate Android development concepts and mobile UI design. The app provides essential alarm functionality with a clean and user-friendly interface built using Android Studio.

## ✨ Features

- **Set Multiple Alarms**: Create and manage multiple alarms
- **Custom Alarm Tones**: Choose from different alarm sounds
- **Snooze Function**: Snooze alarms for a few extra minutes
- **Time Picker**: Native Android time picker interface
- **Alarm Management**: Enable/disable alarms with toggle switches
- **Notifications**: System notifications when alarms trigger
- **Material Design**: Clean UI following Android design guidelines
- **Background Operation**: Alarms work even when app is closed

## 🛠️ Technologies Used

- **Language**: Java/Kotlin
- **IDE**: Android Studio
- **Framework**: Android SDK
- **UI**: XML Layouts with Material Design Components
- **Storage**: SharedPreferences/SQLite for alarm data
- **Services**: AlarmManager and BroadcastReceiver
- **Audio**: MediaPlayer for alarm sounds
- **Minimum SDK**: Android API Level 21 (Android 5.0)

## 🚀 Getting Started

### Prerequisites

- **Android Studio** (latest version recommended)
- **Android SDK** (API Level 21 or higher)
- **Java JDK 8+** or **Kotlin**
- **Android device** or **emulator** for testing

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/koushik4475/ALARM-HY_KOUSHIK.git
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing Android Studio project"
   - Navigate to the cloned repository folder
   - Click "OK" to open the project

3. **Sync the project**
   - Android Studio will automatically sync Gradle files
   - Wait for the sync to complete

4. **Run the application**
   - Connect an Android device or start an emulator
   - Click the "Run" button (green play icon) or press `Shift + F10`
   - Select your target device and click "OK"

## 📖 Usage

1. **Setting an Alarm**:
   - Tap the "+" button or "Add Alarm"
   - Use the time picker to select your desired alarm time
   - Choose alarm tone from the list
   - Save the alarm

2. **Managing Alarms**:
   - Toggle alarms on/off using the switch
   - Long press or tap edit icon to modify alarm settings
   - Swipe or tap delete to remove unwanted alarms

3. **When Alarm Rings**:
   - Notification will appear with alarm sound
   - Tap "Dismiss" to turn off the alarm
   - Tap "Snooze" for 5-10 minutes of extra sleep

## 📁 Project Structure

```
ALARM-HY_KOUSHIK/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/yourpackage/
│   │   │   │   ├── MainActivity.java/kt
│   │   │   │   ├── AlarmReceiver.java/kt
│   │   │   │   ├── AlarmAdapter.java/kt
│   │   │   │   └── AlarmModel.java/kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   ├── values/
│   │   │   │   ├── drawable/
│   │   │   │   └── raw/ (alarm sounds)
│   │   │   └── AndroidManifest.xml
│   │   └── androidTest/
│   ├── build.gradle
│   └── proguard-rules.pro
├── gradle/
├── build.gradle
└── README.md
```

## 🔧 Key Components

### Activities
- **MainActivity**: Main screen displaying alarm list
- **AddAlarmActivity**: Screen for creating/editing alarms

### Services & Receivers
- **AlarmReceiver**: BroadcastReceiver to handle alarm triggers
- **AlarmService**: Background service for alarm management

### Adapters
- **AlarmAdapter**: RecyclerView adapter for alarm list

### Models
- **AlarmModel**: Data model for alarm objects

## 🎨 Customization

You can customize the alarm app by:

- **Adding new alarm tones**: Place audio files in `res/raw/` directory
- **Changing themes**: Modify colors in `res/values/colors.xml`
- **UI modifications**: Edit layout files in `res/layout/`
- **Adding features**: Extend functionality in Java/Kotlin files
- **Custom notifications**: Modify notification styles and behavior

## 🔨 Build Instructions

### Debug Build
```bash
./gradlew assembleDebug
```

### Release Build
```bash
./gradlew assembleRelease
```

### Install on Device
```bash
./gradlew installDebug
```

## ⚠️ Permissions Required

The app requires the following permissions (defined in AndroidManifest.xml):
- `WAKE_LOCK`: To wake up device when alarm triggers
- `RECEIVE_BOOT_COMPLETED`: To restore alarms after device reboot
- `VIBRATE`: For alarm vibration
- `USE_EXACT_ALARM`: For precise alarm timing (Android 12+)

## 🐛 Known Issues

- Battery optimization may affect alarm reliability on some devices
- Doze mode might delay alarms on Android 6.0+ (handled with exact alarms)
- Some OEMs have aggressive power management that may kill alarms

## 📝 To-Do / Future Enhancements

- [ ] Add recurring alarms (daily, weekly, custom)
- [ ] Multiple snooze intervals
- [ ] Alarm labels and descriptions
- [ ] Volume fade-in feature
- [ ] Weather integration
- [ ] Dark theme support
- [ ] Backup and restore functionality
- [ ] Widget support
- [ ] Math problems to dismiss alarm

## 🤝 Contributing

This is a learning project, but contributions are welcome! Here's how you can help:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 👨‍💻 Author

**Koushik**
- Portfolio: [https://koushikhy.netlify.app](https://koushikhy.netlify.app)
- GitHub: [@koushik4475](https://github.com/koushik4475)
- Project Link: [https://github.com/koushik4475/ALARM-HY_KOUSHIK](https://github.com/koushik4475/ALARM-HY_KOUSHIK)

## 🙏 Acknowledgments

- Thanks to the Android development community for guidance
- Material Design guidelines for UI inspiration
- Stack Overflow community for problem-solving help
- Built as a learning exercise in Android development

---

**Note**: This is a practice project created for learning Android development. Feel free to use, modify, and learn from the code!
