

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
   // id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.kotlinproject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.kotlinproject"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

   dataBinding {
       isEnabled = true
   }

    buildFeatures{
        viewBinding = true
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {


    //Local Variables
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.0")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    //paging
    implementation("androidx.paging:paging-runtime-ktx:3.2.0")

    // CameraX core library
    implementation("androidx.camera:camera-core:1.3.0-beta02")
    // CameraX Camera2 extensions
    implementation("androidx.camera:camera-camera2:1.3.0-beta02")
    // CameraX Lifecycle library
    implementation("androidx.camera:camera-lifecycle:1.3.0-beta02")
    // CameraX View class
    implementation("androidx.camera:camera-view:1.3.0-beta02")

    //WindowManager
    implementation("androidx.window:window:1.2.0-beta01")

    // Glide
    implementation("com.github.bumptech.glide:glide:4.12.0")

    //Location
    implementation("com.google.android.gms:play-services-location:21.0.1")
    //To get photoPicker
    implementation("androidx.activity:activity-ktx:1.7.2")
    implementation("androidx.fragment:fragment-ktx:1.7.0-alpha02")

    //ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    // Lifecycles only (without ViewModel or LiveData)
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    // Saved state module for ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:$2.6.1")

    //room test
    testImplementation("androidx.room:room-testing:2.5.2")

    // Testing Navigation
    androidTestImplementation("androidx.navigation:navigation-testing:2.7.0")

    // Feature module Support
    implementation("androidx.navigation:navigation-dynamic-features-fragment:2.7.0")

    //drawerLayout
    implementation("androidx.drawerlayout:drawerlayout:1.2.0")

    // Room for database
    implementation ("androidx.room:room-ktx:2.5.2")
    implementation("androidx.room:room-paging:2.5.2")
    implementation("androidx.room:room-runtime:2.5.2")
    implementation("androidx.room:room-rxjava2:2.5.2")
    implementation("androidx.room:room-rxjava3:2.5.2")

    //work
    implementation("androidx.work:work-runtime-ktx:2.8.1")

    //kaptLibraries
    kapt("androidx.room:room-compiler:2.5.2")
    kapt("com.github.bumptech.glide:compiler:4.12.0")
    kapt("androidx.lifecycle:lifecycle-compiler:2.6.1")

}
