object Compose {
    const val composeVersion = "1.4.3"
    const val composeCompilerVersion = "1.4.7"
    const val runtime = "androidx.compose.runtime:runtime:${composeVersion}"
    const val runtimeLiveData = "androidx.compose.runtime:runtime-livedata:${composeVersion}"
    const val ui = "androidx.compose.ui:ui:${composeVersion}"
    const val material = "androidx.compose.material:material:${composeVersion}"
    const val uiTooling = "androidx.compose.ui:ui-tooling:${composeVersion}"
    const val foundation = "androidx.compose.foundation:foundation:${composeVersion}"
    const val compiler = "androidx.compose.compiler:compiler:${composeCompilerVersion}"

    private const val composeActivitiesVersion = "1.6.1"
    const val activity = "androidx.activity:activity-compose:${composeActivitiesVersion}"

    private const val composeNavigationVersion = "2.5.3"
    const val navigation = "androidx.navigation:navigation-compose:${composeNavigationVersion}"

    const val coil = "io.coil-kt:coil-compose:2.3.0"
    const val accompanist = "com.google.accompanist:accompanist-placeholder:0.30.1"

    const val composeJUnitUITest = "androidx.compose.ui:ui-test-junit4:${composeVersion}"
    const val composeUITestManifest = "androidx.compose.ui:ui-test-manifest:${composeVersion}"
}