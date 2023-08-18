

import com.android.build.gradle.LibraryExtension
import com.example.durian.configureBuildTypes
import com.example.durian.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure


class DurianLibraryConventionPlugin : Plugin<Project>{
    override fun apply(target: Project) {
       with(target){
           pluginManager.apply{
               apply("com.android.library")
               apply("org.jetbrains.kotlin.android")
           }
           extensions.configure<LibraryExtension>{
               configureKotlinAndroid(this)
               configureBuildTypes(this)

               buildFeatures{
                   buildConfig = true
               }

           }
       }
    }
}