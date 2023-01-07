load("@build_bazel_rules_android//android:rules.bzl", "android_library")


android_library(
    name = "greeter_activity",
    srcs = glob(["*.kt"]),
    visibility = ["//src:__subpackages__"],
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
)