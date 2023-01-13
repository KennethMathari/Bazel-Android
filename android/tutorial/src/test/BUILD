android_local_test(
    name = "main_activity_test",
    srcs = ["java/com/example/bazel/MainActivityTest.java"],
    manifest = "AndroidManifest.xml",
    test_class = "src.test.java.com.example.bazel.MainActivityTest",
    deps = [
#        "//src/main:app",
        "//src/main/java/com/example/bazel:greeter_activity",
        "@maven//:org_robolectric_robolectric",
        "@robolectric//bazel:android-all",
#        "@maven//:androidx_test_ext_junit",
#        "@maven//:org_assertj_assertj_core",
#        "@maven//:org_robolectric_shadows_framework",
    ],
)
