java_library(
    name = "java_test_deps",
    exports = [
        "@maven//:junit_junit",
        "@maven//:org_hamcrest_hamcrest_library",
    ],
)

android_library(
    name = "greeter_activity",
    srcs = glob(["*.java"]),
    visibility = ["//src:__subpackages__"],
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    exports = [
            "@maven//:junit_junit",
            "@maven//:androidx_test_espresso_espresso_core",
        ],
)