package com.example.durian

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project

internal fun Project.configureBuildTypes(commonExtension: CommonExtension<*, *, *, *>){
    commonExtension.apply {
        signingConfigs{

        }

        buildTypes {

            getByName("debug"){
                isMinifyEnabled = false
            }

            getByName("release") {
                isMinifyEnabled = false
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
        }

    }
}