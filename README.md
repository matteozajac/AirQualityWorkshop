# AirQualityWorkshop Android regular

## Workshop

### Project Setup
#### Goal
Run the project on the device or emulator

#### Info
Select Material 3 Activity - Jetpack Compose

### MVVM
#### Goal
Display list with fake data on screen

#### Info
Classes:
- `StationListView`
- `StationListViewModel`

### Airly REST API
#### Goal
Feed list with data coming from [Airly REST API](
https://developer.airly.org/en/docs#concepts.installations)

#### Info
- Add [Retrofit](https://square.github.io/retrofit/) to your project.
- Add custom `AuthHttpClient` with the interceptor, adding an API key to every app request.
- Add `RemoteStationsDataSource`
- Add Retrofit service fetching installation from the API

Use [Json2Kt]([readme.md](https://json2kt.com)) to make DTO classes directly from JSON response.

Do not publish your API Key on Github!

### Clean Architecture

You should have five packages:
- DI
- UI
- Logic
- Entities
- Data

#### Goal
Create a LocalStationsRepository and add a simple `InMemoryStationsRepository` holding data in a static array.

Add `GetStationsUseCase`. It should fetch data from a remote if there are no stations in the local storage.

#### Info
Add unit tests for `GetStationsUseCase` validating business rules.

### Room Database
#### Goal
Stations fetched once should persist between app sessions.
#### Info
Implement [Room Database](https://developer.android.com/training/data-storage/room) three main components
- `@Entity`
- `@Dao`
- `@Database`

### Jetpack compose

### Goal
Create a list row item containing:
- Image - Sponsor Image
- Title - Station Display Name
- Subtitle - City
- Label - Sponsor name

#### Info
Use `AsyncImage` from [Coil](https://coil-kt.github.io/coil/compose/)

## Career development
### Portfolio repository
During the first stage interview, most companies require you to write an app displaying a list of data fetched from the specified REST API.

Be prepared for that and publish source code from a similar app on your GitHub profile.
If you apply for a senior role, ensure the code has unit tests! Include code coverage and architectural diagrams.

### Content
Post articles on Medium, tweet on Twitter, and consider hosting your blog. Those are the best ways to show different aspects of you as a developer, leader, and helping others.
It doesn't have to be an academic essay. Publish articles that are easy to read by less experienced people. You remember having less experience and using StackOverflow or such blog posts.

### Useful links

[Levels.fyi](https://www.levels.fyi/) - salary info

[Dropbox Engineering Career Framework](https://dropbox.github.io/dbx-career-framework/ic1_software_engineer.html)

[Looka](https://looka.com) - AI generation assets

[The Standout Developer](https://thestandoutdeveloper.com) - Randal Kanna's books

[LeetCode](https://leetcode.com) - algo exercises

[Glassdoor](https://www.glassdoor.com/) - international, remote job offers

[tryexponent](https://www.tryexponent.com/welcome) - interview prep course

[Gramarly](https://grammarly.com) - Helping with English writings

[Polska IT jobs](https://justjoin.it/)

### Books
[Software Engineering essentials](
https://www.essentialdeveloper.com/book-suggestions)

[Advanced Android App Architecture](https://www.kodeco.com/books/advanced-android-app-architecture)

