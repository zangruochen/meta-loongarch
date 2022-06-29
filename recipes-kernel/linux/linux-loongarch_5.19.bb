SUMMARY = "Linux kernel"
SECTION = "kernel"
LICENSE = "GPL-2.0-only"
HOMEPAGE = "https://www.yoctoproject.org/"

BRANCH = "loongarch-next"

SRCREV_machine:qemuloongarch64 ?= "78c36a0c87b9d55a3289c44ab691e7940619fcc1"

SRC_URI = "git://github.com/loongson/linux.git;name=machine;branch=${BRANCH};protocol=git"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.19"

DEPENDS += "openssl-native util-linux-native"
DEPENDS += "gmp-native libmpc-native"
DEPENDS += "xz-native bc-native"

PV = "${LINUX_VERSION}+git${SRCPV}"

KCONF_BSP_AUDIT_LEVEL = "1"

COMPATIBLE_MACHINE:qemuloongarch64 = "qemuloongarch64"

inherit kernel
inherit pkgconfig
