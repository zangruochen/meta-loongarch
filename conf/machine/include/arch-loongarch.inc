# LOONGARCH Architecture definition

DEFAULTTUNE ?= "loongarch"

TUNE_ARCH = "loongarch64"
TUNE_PKGARCH = "${LOONGARCHPKGSFX_VARIANT:tune-loongarch64}"

# Endianess
TUNEVALID[littleendian] = "Enable little-endian mode"
TUNE_CCARGS .= "${@bb.utils.contains('TUNE_FEATURES', 'littleendian', ' ', ' ', d)}"

# Base tunes
AVAILTUNES += "loongarch64"

TUNE_FEATURES:tune-loongarch64 = " littleendian"
BASE_LIB:tune-loongarch64 = "lib64"
LOONGARCHPKGSFX_VARIANT:tune-loongarch64 = "${TUNE_ARCH}"
PACKAGE_EXTRA_ARCHS:tune-loongarch64 = "loongarch64"
