KBRANCH ?= "loongarch-next"

require recipes-kernel/linux/linux-loongarch.inc

KBRANCH:qemuloongarch64 ?= "loongarch-next"

SRCREV_machine:qemuloongarch64 ?= "78c36a0c87b9d55a3289c44ab691e7940619fcc1"

KBUILD_DEFCONFIG ?= "loongson3_defconfig"

#SRCREV_meta ?= "e45349e6fb636285a7431e74bca678dcc95495fd"

SRC_URI = "git://github.com/loongson/linux.git;name=machine;branch=${KBRANCH};"
#           git://github.com/zangruochen/loongarch-kernel-cache.git;type=kmeta;name=meta;destsuffix=${KMETA}

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.19-rc4"

do_kernel_configme[noexec] = "1"
do_kernel_configcheck[noexec] = "1"

DEPENDS += "openssl-native util-linux-native"
DEPENDS += "gmp-native libmpc-native"

PV = "${LINUX_VERSION}+git${SRCPV}"

KCONF_BSP_AUDIT_LEVEL = "1"

COMPATIBLE_MACHINE = "qemuloongarch64"

#KERNEL_FEATURES:append:qemuloongarch64 =" arch/loongarch/loongarch.scc"

