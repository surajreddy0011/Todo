buildscript {
    repositories {
        google()
    }
    dependencies {
        def nav_version = "2.5.1"
        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"
        classpath 'com.google.dagger:hilt-android-gradle-plugin:2.38.1'
    }
}

plugins {
    id 'com.android.application' version '7.2.1' apply false
    id 'com.android.library' version '7.2.1' apply false
    id 'org.jetbrains.kotlin.android' version '1.7.0' apply false
}

task clean(type: Delete) {
    delete rootProject.buildDir
}
