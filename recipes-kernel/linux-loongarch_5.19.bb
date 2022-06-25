SUMMARY = "Linux kernel"
SECTION = "kernel"
LICENSE = "GPL-2.0-only"
HOMEPAGE = "https://www.yoctoproject.org/"

SRCREV_machine:qemuloongarch64 ?= "a111daf0c53ae91e71fd2bfe7497862d14132e3e"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;name=machine"

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
