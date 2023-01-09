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
#            "@maven//:junit_junit",
#            "@maven//:androidx_test_espresso_espresso_core",
#            "@maven//:androidx_appcompat_appcompat",
            #"@maven//:androidx_core_core",
            "@maven//:androidx_cardview_cardview",
            "@maven//:androidx_lifecycle_lifecycle_viewmodel",
            "@maven//:androidx_lifecycle_lifecycle_livedata",
#            "@maven//:com_google_android_material_material",
        ],
)