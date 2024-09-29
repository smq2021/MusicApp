# TuneHive: Curated Music Streaming

## Overview

**TuneHive** is an Android application designed to provide users with a personalized music discovery experience. The app features sections for trending, popular, and new releases, allowing users to explore a wide variety of music tailored to their tastes. With seamless integration of Firebase for backend services and user authentication, TuneHive ensures a secure and user-friendly environment for music lovers.

## Features

- **Personalized Music Discovery**: Users can explore music based on their preferences with dedicated sections for trending, popular, and new releases.
- **User Authentication**: Secure sign-up and login functionality using Firebase Authentication.
- **Firebase Integration**: Utilizes Firebase Firestore for real-time data storage and retrieval, ensuring users have access to the latest music information.
- **Responsive UI**: Designed with a user-friendly interface that adapts to different screen sizes and orientations.
- **Media Playback**: Integrated with ExoPlayer for smooth and efficient music playback.
- **Dynamic Content**: The app dynamically updates content based on user interactions and preferences.

## Technologies Used

- **Programming Language**: Kotlin
- **Android SDK**: Android 12 (API level 31) and above
- **Firebase**: For authentication and Firestore database
- **ExoPlayer**: For media playback
- **Glide**: For image loading and caching
- **AndroidX Libraries**: For modern Android development practices

## Installation

To run the TuneHive app locally, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/smq2021/TuneHive-Curated-Music-Streaming.git
   ```

2. **Open the Project**:
   Open the project in Android Studio.

3. **Set Up Firebase**:
   - Create a new Firebase project in the [Firebase Console](https://console.firebase.google.com/).
   - Add your Android app to the Firebase project.
   - Download the `google-services.json` file and place it in the `app/` directory of your project.

4. **Sync Gradle**:
   Ensure all dependencies are correctly set up by syncing Gradle.

5. **Run the App**:
   Connect an Android device or start an emulator, then run the app from Android Studio.

## Usage

- **Sign Up / Login**: Users can create an account or log in to access personalized features.
- **Explore Music**: Navigate through different sections to discover trending, popular, and new music.
- **Play Music**: Click on any song to start playback using the integrated media player.



## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Thanks to the Firebase team for providing excellent backend services.
- Special thanks to the Android community for their continuous support and resources.

