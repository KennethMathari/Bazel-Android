package(
    default_visibility = ["//src:__subpackages__"],
)

android_library(
    name = "greeter_activity",
    srcs = [
            "Greeter.java",
            "GreeterViewModel.java",
            "MainActivity.java",
            ],
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    deps = [
        "@maven//:androidx_lifecycle_lifecycle_runtime",
#        "@maven//:androidx_appcompat_appcompat",
#                        "@maven//:com_google_android_material_material",
                        #"@maven//:androidx_core_core",
                        "@maven//:androidx_cardview_cardview",
                        "@maven//:androidx_lifecycle_lifecycle_viewmodel",
                        "@maven//:androidx_lifecycle_lifecycle_livedata",
                        "@maven//:androidx_lifecycle_lifecycle_livedata_core",
#                        "@maven//:org_robolectric_robolectric",
#                        "@robolectric//bazel:android-all",
            ],
)

android_local_test(
    name = "greeter_activity_test",
    srcs = ["MainActivityTest.java"],
    manifest = "AndroidManifest.xml",
    test_class = "com.example.bazel.MainActivityTest",
    deps = [
        ":greeter_activity",
        "@maven//:org_robolectric_robolectric",
        "@robolectric//bazel:android-all",
    ],
)