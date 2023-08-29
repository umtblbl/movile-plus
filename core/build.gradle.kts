import dependencies.Dependencies
import dependencies.AnnotationProcessorsDependencies
import extensions.implementation
import extensions.kapt
import extensions.buildConfigStringField

plugins {
    id("commons.android-library")
}

android {
    buildTypes.forEach {
        it.buildConfigStringField("MOVIE_PLUS_API_BASE_URL", "https://api.themoviedb.org/3/")
        it.buildConfigStringField("MOVIE_PLUS_DATABASE_NAME", "movie-plus-db")
    }
}

dependencies {
    implementation(Dependencies.LIFECYCLE_EXTENSIONS)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.FRAGMENT_KTX)
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.RETROFIT_CONVERTER_MOSHI)
    implementation(Dependencies.MOSHI)
    implementation(Dependencies.MOSHI_KTX)
}
