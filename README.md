# StocksApp

A modern Android application for tracking stocks, viewing company details, and managing personalized watchlists. Built with Jetpack Compose, Room, Hilt, and Retrofit.

## Features
- **Company Listings:** Browse and search for companies and stocks.
- **Company Overview:** View detailed information about each company.
- **Top Gainers & Losers:** See the top performing and underperforming stocks.
- **Watchlists:** Create multiple named watchlists and add stocks to them.
- **Expandable Watchlists:** Expand a watchlist to view its stocks.
- **Offline Support:** Company listings and watchlists are available offline.
- **Modern UI:** Built with Jetpack Compose for a smooth, responsive experience.

## Tech Stack
- **Kotlin**
- **Jetpack Compose** (UI)
- **Room** (local database)
- **Hilt** (dependency injection)
- **Retrofit** (network/API)
- **Coroutines & Flow** (async and reactive programming)

## Getting Started

### Prerequisites
- Android Studio (latest recommended)
- Android device or emulator (API 24+)

### Setup
1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/StocksApp.git
   cd StocksApp
   ```
2. **Open in Android Studio:**
   - File > Open > Select the `StocksApp` directory.
3. **Build the project:**
   - Let Gradle sync and download dependencies.
4. **Run the app:**
   - Select a device/emulator and click Run.

### API Key
- The app uses a stock market API. Add your API key in `ApiConstants.kt`:
  ```kotlin
  const val API_KEY = "YOUR_API_KEY_HERE"
  ```

## Project Structure
- `app/src/main/java/com/seenu/stocksapp/`
  - `companylistingscreen/` — Company listing UI and logic
  - `companyoverviewscreen/` — Company overview UI and logic
  - `topgainerslosersscreen/` — Top gainers/losers UI and logic
  - `watchlistscreen/` — Watchlist UI and logic
  - `data/` — Local and remote data sources, entities, DAOs, mappers, repository implementations
  - `domain/` — Domain models and repository interfaces
  - `ui/` — Theme and UI resources
  - `util/` — Utility classes and constants

## Contributing
Contributions are welcome! Please open issues or submit pull requests for improvements and bug fixes.

1. Fork the repo
2. Create your feature branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a pull request

## License
This project is licensed under the MIT License.
